package com.test.demo.errorHandling;

public class BookIdMismatchException extends RuntimeException{
    public BookIdMismatchException() {
        super("Prova di errore MISMATCH");
    }
}
