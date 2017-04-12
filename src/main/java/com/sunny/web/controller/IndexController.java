package com.sunny.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DT254 on 2017/4/12.
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
     return "index";
    }
}
