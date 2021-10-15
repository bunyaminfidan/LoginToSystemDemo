package com.company.core.core.userRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck {
        public static boolean validPassword(String password) {
            Pattern validPasswordRegex =
                    Pattern.compile("^[A-Z0-9._%+-]{6,50}$",
                            Pattern.CASE_INSENSITIVE);

            Matcher matcherPassword = validPasswordRegex.matcher(password);
            return matcherPassword.find();

        }
    }