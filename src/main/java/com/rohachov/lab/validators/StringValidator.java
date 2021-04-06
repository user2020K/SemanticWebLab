package com.rohachov.lab.validators;

public class StringValidator {

    public static boolean validate(String value) {
        return !(value == null || value.isEmpty());
    }
}
