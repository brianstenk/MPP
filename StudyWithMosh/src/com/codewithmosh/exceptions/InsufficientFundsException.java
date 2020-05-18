package com.codewithmosh.exceptions;

// Checked -> Exception
// Unchecked (runtime) -> RuntimeException

@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception {
  public InsufficientFundsException() {
    super("Insufficient funds in your account.");
  }

  public InsufficientFundsException(String message) {
    super(message);
  }
}
