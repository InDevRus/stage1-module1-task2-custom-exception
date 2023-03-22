package com.epam.mjc;

public class StudentMissingException extends IllegalArgumentException {
    public StudentMissingException(String message) {
        super(message);
    }

    public StudentMissingException(String message, Throwable cause) {
        super(message, cause);
    }
}
