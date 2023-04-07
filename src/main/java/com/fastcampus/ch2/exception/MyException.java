package com.fastcampus.ch2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 500 -> 400 상태코드 변경
@ResponseStatus(HttpStatus.BAD_REQUEST)
class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
        System.out.println("--- MyException");
    }
}
