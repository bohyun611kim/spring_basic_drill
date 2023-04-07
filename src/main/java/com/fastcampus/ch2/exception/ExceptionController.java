package com.fastcampus.ch2.exception;


import java.io.FileNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ExceptionController {

    @ExceptionHandler({NullPointerException.class, FileNotFoundException.class })
    public String catcher2(Exception ex, Model model) {
        model.addAttribute("ex", ex);
        return "error";
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 200 -> 500
    @ExceptionHandler(Exception.class)
    public String catcher(Exception ex, Model model) {
        System.out.println("--- catcher");
        // status code : 200 변경되어야 한다.
        //model.addAttribute("ex", ex);
        return "error";
    }

    @RequestMapping("/ex")
    public String main() throws Exception {
        throw new Exception("ex 예외가 발생하였습니다.");
    }

    @RequestMapping("/ex2")
    public String main2() throws Exception {
        throw new FileNotFoundException("ex 예외가 발생하였습니다."); // 예외 조상이 처리한다.
    }

}
