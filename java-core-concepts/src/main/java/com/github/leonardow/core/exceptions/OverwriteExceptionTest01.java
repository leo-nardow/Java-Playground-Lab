package com.github.leonardow.core.exceptions;

import com.github.leonardow.core.exceptions.domain.Employee;
import com.github.leonardow.core.exceptions.domain.LoginInvalidException;
import com.github.leonardow.core.exceptions.domain.Person;

import java.io.FileNotFoundException;

public class OverwriteExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();
        try {
            person.save();
        } catch (LoginInvalidException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        employee.save();
    }
}
