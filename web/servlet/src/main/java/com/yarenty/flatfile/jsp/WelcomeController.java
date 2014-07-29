package com.yarenty.flatfile.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * flat-file-examiner => com.yarenty.flatfile.jsp
 * Created by yarenty on 29/07/2014.
 */
@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap modelMap) {

        modelMap.addAttribute("message", "Welcome to Spring MVC World");

        return "Welcome";
    }
}
