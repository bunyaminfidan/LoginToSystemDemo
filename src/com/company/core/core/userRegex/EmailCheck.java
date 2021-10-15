package com.company.core.core.userRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {
    public static boolean validEmail(String email ) {
        Pattern validEmailAdressRegex =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);


        Matcher matcher = validEmailAdressRegex.matcher(email);
        return matcher.find();

    }
}
