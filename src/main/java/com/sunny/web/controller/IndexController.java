package com.sunny.web.controller;

import com.sunny.web.model.User;
import com.sunny.web.service.UserService;
import org.apache.commons.lang.xwork.builder.ToStringBuilder;
import org.apache.commons.lang.xwork.builder.ToStringStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DT254 on 2017/4/12.
 */
@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index() {
        User user = userService.getUserByName("admin");
        System.out.println(ToStringBuilder.reflectionToString(user, ToStringStyle.SIMPLE_STYLE));
        return "index";
    }
}
