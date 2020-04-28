package cn.kobe.controller;

import cn.kobe.bean.Admin;
import cn.kobe.bean.Buy;
import cn.kobe.bean.Pay;
import cn.kobe.config.AlipayConfig;
import cn.kobe.config.AlipayConfigforBuy;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.BuyService;
import cn.kobe.service.PayService;
import cn.kobe.service.StudentService;
import cn.kobe.util.Status;
import com.alibaba.fastjson.JSON;
import com.alipay.api.*;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 20:50
 * @Describe
 */
@Controller
@RequestMapping("/pay")
public class PayController {
    @Autowired
    private PayService payService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private BuyService buyService;

    @RequestMapping("/selectAll/{page}/{size}")
    @ResponseBody
    public PageResult<Pay> selectAll(@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Pay> pageResult = new PageResult<Pay>();
        List<Pay> pays = payService.selectAll(pageNumber, pageSize);
        pageResult.setData(pays);
        pageResult.setCode("200");
        pageResult.setTotal(pays.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public Result<String> deleteByPrimaryKey(@PathVariable("id") String payId) {
        int i = payService.deleteByPrimaryKey(payId);
        if(i == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result<String> insert(@RequestBody Pay pay) {
        int insert = payService.insert(pay);
        if(insert == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result<String> updateByPrimaryKey(@RequestBody Pay pay) {
        int result = payService.updateByPrimaryKey(pay);
        if(result == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/selectOne/{id}")
    @ResponseBody
    public Result<Pay> selectByPrimaryKey(@PathVariable("id") String payId) {
        Pay pay = payService.selectByPrimaryKey(payId);
        if(pay != null) {
            return new Result<Pay>(Status.SUCCESS, "success", pay);
        }
        return new Result<Pay>(Status.SYSTEM_OF_ERROR, "system of error",pay);
    }

    @RequestMapping("/searchByName/{name}/{page}/{size")
    @ResponseBody
    public PageResult<Pay> selectByName(@PathVariable("name") String name, @PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Pay> pageResult = new PageResult<Pay>();
        name = "%" + name + "%";
        List<Pay> pays = payService.selectByName(name, pageNumber, pageSize);
        pageResult.setData(pays);
        pageResult.setCode("200");
        pageResult.setTotal(pays.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/goAlipay")
    @ResponseBody
    public String goAlipay(@RequestBody Pay pay) throws Exception {
        System.out.println(pay.getPayMoney());
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
        String out_trade_no = pay.getPayId();
        //付款金额，必填
        String total_amount = pay.getPayMoney().toString();
        //订单名称，必填
        String subject = pay.getPayId();
        pay.setPayTime(new Date());
        payService.insert(pay);
        // 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
        Integer i = studentService.updateCoinById(pay.getStudentId(),pay.getPayMoney()*10);
        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        //请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();
        System.out.println(result);
        return result;
    }

    @RequestMapping("/goAlipayForBuy")
    @ResponseBody
    public String goAlipayForBuy(@RequestBody Buy buy) throws Exception {
        // System.out.println(AlipayConfig.gatewayUrl+" "+ AlipayConfig.app_id+" "+ AlipayConfig.merchant_private_key+""+"json"+" "+ AlipayConfig.charset+" " +AlipayConfig.alipay_public_key+" "+AlipayConfig.sign_type);
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfigforBuy.gatewayUrl, AlipayConfigforBuy.app_id, AlipayConfigforBuy.merchant_private_key, "json", AlipayConfigforBuy.charset, AlipayConfigforBuy.alipay_public_key, AlipayConfigforBuy.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfigforBuy.return_url);
        alipayRequest.setNotifyUrl(AlipayConfigforBuy.notify_url);
        String out_trade_no = buy.getBuyId();
        //付款金额，必填
        String total_amount = buy.getBuyMoney().toString();
        //订单名称，必填
        String subject = buy.getBuyId();
        buy.setBuyCreatetime(new Date());
        buyService.insert(buy);
        // 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        //请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();
        System.out.println(result);
        return result;
    }

    @RequestMapping("/returnAlipay")
    @ResponseBody
    public void returnPay(HttpServletRequest request) {
        Map<String, String> params = convertRequestParamsToMap(request); // 将异步通知中收到的待验证所有参数都存放到map中
        String paramsJson = JSON.toJSONString(params);
        try {
            AlipayConfig alipayConfig = new AlipayConfig();// 支付宝配置
            // 调用SDK验证签名
            boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key,
                    AlipayConfig.charset, AlipayConfig.sign_type);
            if (signVerified) {
                // 按照支付结果异步通知中的描述，对支付结果中的业务内容进行1\2\3\4二次校验，校验成功后在response中返回success，校验失败返回failure
                System.out.println("验签成功");
            } else {
                System.out.println("验签失败");
            }
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
    }
    // 将request中的参数转换成Map
    private static Map<String, String> convertRequestParamsToMap(HttpServletRequest request) {
        Map<String, String> retMap = new HashMap<String, String>();

        Set<Map.Entry<String, String[]>> entrySet = request.getParameterMap().entrySet();

        for (Map.Entry<String, String[]> entry : entrySet) {
            String name = entry.getKey();
            String[] values = entry.getValue();
            int valLen = values.length;

            if (valLen == 1) {
                retMap.put(name, values[0]);
            } else if (valLen > 1) {
                StringBuilder sb = new StringBuilder();
                for (String val : values) {
                    sb.append(",").append(val);
                }
                retMap.put(name, sb.toString().substring(1));
            } else {
                retMap.put(name, "");
            }
        }

        return retMap;
    }
}
