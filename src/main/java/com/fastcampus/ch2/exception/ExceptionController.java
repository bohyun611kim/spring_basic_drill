package com.fastcampus.ch2.exception;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {

    @RequestMapping("/ex")
    public void main() throws Exception {

        try {
            throw new Exception("예외가 발생하였습니다.");
        } catch (Exception e) {
            e.getMessage();
        }

    }

}
