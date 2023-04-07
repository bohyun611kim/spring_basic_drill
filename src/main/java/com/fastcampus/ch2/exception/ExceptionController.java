package com.fastcampus.ch2.exception;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {
    
    @RequestMapping("/ex")
    public String main() throws Exception {

        try {
            throw new Exception("예외가 발생하였습니다.");
        } catch (Exception e) {
            return "error";
        }

    }

    @RequestMapping("/ex2")
    public String main2() throws Exception {

        try {
            throw new Exception("예외가 발생하였습니다.");
        } catch (Exception e) {
            return "error";
        }

    }

}
