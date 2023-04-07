package com.fastcampus.ch2.exception;

import java.io.FileNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice("com.fastcampus.ch3")
public class GlobalCatcher {

    @ExceptionHandler({NullPointerException.class, FileNotFoundException.class })
    public String catcher2(Exception ex, Model model) {
        model.addAttribute("ex", ex);
        System.out.println("-- catcher2");
        return "error";
    }

    @ExceptionHandler(Exception.class)
    public String catcher(Exception ex) {
        System.out.println("-- catcher");
        return "error";
    }

}
