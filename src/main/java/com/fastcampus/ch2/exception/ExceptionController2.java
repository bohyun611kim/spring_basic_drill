package com.fastcampus.ch2.exception;


import java.io.FileNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ExceptionController2 {

    // Global catcher 예외처리 추가

    @RequestMapping("/ex3")
    public String main() throws Exception {
        System.out.println("--- /ex3");
        throw new MyException("예외가 발생하였습니다.");
    }

    @RequestMapping("/ex4")
    public String main2() throws Exception {
        System.out.println("--- /ex4");
        throw new FileNotFoundException("예외가 발생하였습니다.");
    }

}
