package com.company.core.core.userRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameCheck {

    public static  boolean validFirstName(String firstName){
        Pattern validFirstNameRegex =
                Pattern.compile("^[A-Z]{2,50}$", Pattern.CASE_INSENSITIVE);


        Matcher matcher = validFirstNameRegex.matcher(firstName);
        return matcher.find();

    }
}