package com.codewithmosh.exceptions;

@SuppressWarnings("serial")
public class AccountException extends Exception {
  public AccountException(Exception cause) {
    super(cause);
  }
}
