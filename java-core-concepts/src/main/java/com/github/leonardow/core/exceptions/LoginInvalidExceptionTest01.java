package com.github.leonardow.core.exceptions;

import com.github.leonardow.core.exceptions.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws LoginInvalidException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";

        System.out.println("Login:");

        String usernameTyped = scanner.nextLine();

        System.out.println("Password:");

        String passwordTyped = scanner.nextLine();

        if(!usernameDB.equals(usernameTyped) || !passwordDB.equals(passwordTyped)) {
            throw new LoginInvalidException("Username or password invalid");
        }

        System.out.println("Login with success!");

    }
}
