package cn.kobe.controller;

import cn.kobe.bean.Admin;
import cn.kobe.bean.Student;
import cn.kobe.service.AdminService;
import cn.kobe.service.StudentService;
import cn.kobe.util.Status;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: kobe byrant
 * @Date: 2020/2/23 12:39
 * @Describe
 */
@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestHeader Map<String,Object> he, @RequestBody Map<String,Object> para) throws JsonProcessingException {
        System.out.println(he+""+para);
        String account=(String)para.get("account");
        String password=(String)para.get("password");
        Student student = studentService.login(account, password);
        HashMap<String,Object> hs=new HashMap<>();
        if(student != null) {
            hs.put("token","token"+account+password);
            hs.put("userInfo", student);
        } else {
            hs.put("token", Status.ERROR);
        }

        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.writeValueAsString(hs);
    }

    @RequestMapping(value = "/adminLogin",method = RequestMethod.POST)
    @ResponseBody
    public String adminLogin(@RequestHeader Map<String,Object> he, @RequestBody Map<String,Object> para) throws JsonProcessingException {
        System.out.println(he+""+para);
        String account=(String)para.get("account");
        String password=(String)para.get("password");
        Admin admin = adminService.login(account, password);
        HashMap<String,Object> hs=new HashMap<>();
        if(admin != null) {
            hs.put("token","token"+account+password);
            hs.put("userInfo", admin);
        } else {
            hs.put("token", Status.ERROR);
        }

        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.writeValueAsString(hs);
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String test(@RequestHeader Map<String,Object> he) throws JsonProcessingException {
        System.out.println(he);
        HashMap<String,Object> hs=new HashMap<>();
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.writeValueAsString(hs);
    }
}
