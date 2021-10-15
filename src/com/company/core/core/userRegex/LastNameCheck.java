package com.company.core.core.userRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameCheck {

    public static  boolean validLastName(String lastName){
        Pattern validLastNameRegex =
                Pattern.compile("^[A-Z]{2,50}$", Pattern.CASE_INSENSITIVE);


        Matcher matcher = validLastNameRegex.matcher(lastName);
        return matcher.find();

    }
}
