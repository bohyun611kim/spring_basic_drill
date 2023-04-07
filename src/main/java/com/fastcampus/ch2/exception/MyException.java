package com.fastcampus.ch2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
    // 200 -> 400
class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
        System.out.println("--- MyException");
    }
}
