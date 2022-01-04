package com.wzy.study.gateway.exception.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BuzController {
    @ExceptionHandler({
        NullPointerException.class
    })
    public String exception(NullPointerException e) {
        System.out.println(e.getMessage());
        e.printStackTrace();
        return "null pointer exception";
    }

    @RequestMapping("test")
    public void test() {
        throw new NullPointerException("出错了！");
    }
}
