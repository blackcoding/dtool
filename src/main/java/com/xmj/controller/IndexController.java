package com.xmj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andingLJ on 2018/11/15.
 */

@RestController
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(){
        return "Hello world, DTool!";
    }
}
