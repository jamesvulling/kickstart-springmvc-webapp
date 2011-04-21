package com.sampleapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home 
{

    @RequestMapping(value="/")
    public ModelAndView show(ModelMap modelMap) {

        return new ModelAndView("home", "model", modelMap);
    }
}
