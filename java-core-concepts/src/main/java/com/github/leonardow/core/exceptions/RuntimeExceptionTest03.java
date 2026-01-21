package com.github.leonardow.core.exceptions;

import javax.annotation.processing.FilerException;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) throws SQLException, FileNotFoundException {
        try{
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside of ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside of IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Inside of IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Inside of ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Inside of RuntimeException ");
        }
        try {
            maybeThrowException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void maybeThrowException() throws SQLException, FileNotFoundException {

    }

}
