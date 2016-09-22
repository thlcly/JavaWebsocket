package com.aaront.websocket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tonyhui
 * @since 16/9/22
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
