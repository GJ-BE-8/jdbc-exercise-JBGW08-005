package com.nhnacademy.jdbc.bank.exception;

public class AccountAreadyExistException extends RuntimeException {
    public AccountAreadyExistException(long accountNumber) {
        super("account already exist accountNumber : "+ accountNumber );
    }
}
