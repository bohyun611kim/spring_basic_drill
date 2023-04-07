package com.fastcampus.ch2.exception;

import java.io.FileNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("com.fastcampus.ch2") // 지정된 공통예외처리 가능
public class GlobalCatcher {

    @ExceptionHandler({NullPointerException.class, FileNotFoundException.class })
    public String catcher2(Exception ex, Model model) {
        model.addAttribute("ex", ex);
        return "error";
    }

    @ExceptionHandler(Exception.class)
    public String catcher(Exception ex) {
        return "error";
    }

}
