package net.codemarc.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView printWelcome(HttpServletRequest request) {

        ModelAndView result = new ModelAndView();
        result.addObject("resources", request.getContextPath() + "/resources");
        result.addObject("title", "Hello CF");
        result.addObject("jumbo-title", "hello world");
        result.addObject("jumbo-desc", "A Java Version");
        result.setViewName("hello");
        return result;

    }
}