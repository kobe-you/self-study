package cn.kobe.controller;

import cn.kobe.dto.Result;
import cn.kobe.util.Status;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author: kobe byrant
 * @Date: 2020/2/16 17:39
 * @Describe
 */
@Controller
@RequestMapping("/upload")
public class UploadDownController {
    @RequestMapping("/uploadImg")
    @ResponseBody
    public Result<String> upload(@RequestParam("picture") MultipartFile picture, HttpServletRequest request) throws IOException {
        System.out.println("fileupload2执行了...");
        // 使用fileupload组件完成文件上传
        // 上传的位置
        String path = "E:\\uploadfiles";
        // 判断，该路径是否存在
        File file = new File(path);
        if(!file.exists()){
            // 创建该文件夹
            file.mkdirs();
        }
        System.out.println(path);
        // 获取上传文件的名称
        String filename = picture.getOriginalFilename();
        // 把文件的名称设置唯一值，uuid
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid+"_"+filename;
        // 完成文件上传
        picture.transferTo(new File(path,filename));
        return new Result<String>(Status.SUCCESS,"success",filename);
    }
}
