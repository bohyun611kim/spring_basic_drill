package com.fastcampus.ch2;

import java.net.URLEncoder;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("/register")
@Controller
public class RegisterController {

    // 클래스 내에서만 적용
    @InitBinder
    public void toDate(WebDataBinder binder) {

        // 특정필드값 문자열(구분자) --> 배열
        binder.registerCustomEditor(String[].class, "hobby",
            new StringArrayPropertyEditor("#"));
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String register() {

        return "registerForm";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(User user, BindingResult result, Model model) throws Exception {

        System.out.println("result = " + result);
        // 1. 인증통과 못하면 에러메세지 돌려준다.
        if (!isValid(user)) {
            String msg = URLEncoder.encode("id를 잘못입력하였습니다.", "utf-8");

            model.addAttribute("msg", msg);

            return "forward:/register/add";
            //return "redirect:/register/add?msg=" + msg;
        }
        // 신규회원정보
        return "registerInfo";

    }

    private boolean isValid(User user) {

        return true;
    }
}
