package com.gree.hzapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
1.@RestController：相当于@Controller+@ResponseBody两个注解的结合，返回json数据不需要在方法前面
加@ResponseBody注解了，但使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析
jsp,html页面。
2.@GetMapping：GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩
写。
*/
@RestController
public class testController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
