package com.app.accounting.commons.utils;

public class Constants {
    public static class Application {
        public static String VERSION = "1.0.0";
        public static String NAME = "accounting-api";
    }

    public static class Token {
        public static String PREFIX = "#";
        public static String POSTFIX = ">#";
        public static String STARTING = "Token:<";
        public static Integer LENGTH = 128;
        public static String ACCEPTABLE_CHARACTERS = CharterAndNumber.LOWER_CASE + CharterAndNumber.UPPER_CASE + CharterAndNumber.ZERO_TO_NINE;
    }

    public static class CharterAndNumber {
        public static String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
        public static String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        public static String ZERO_TO_NINE = "0123456789";
    }
}
