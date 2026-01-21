package com.github.leonardow.core.exceptions.domain;

public class LoginInvalidException extends Exception {
    public LoginInvalidException() {
        super("Login Invalid");
    }

    public LoginInvalidException(String message) {
        super(message);
    }
}
