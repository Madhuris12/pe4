package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {
    public static void main(String[] args) {
        PatternMatch obj = new PatternMatch();

        obj.presentword("harry", "harry");
    }

    public String presentword(String str, String word) {
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find())
            System.out.println("Is " + word + " here? true");
        else
            System.out.println("Is " + word + " here? false");
        return null;
    }

}
