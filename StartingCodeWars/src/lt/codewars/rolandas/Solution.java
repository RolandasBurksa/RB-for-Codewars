package lt.codewars.rolandas;
import java.util.stream.*;

//Write function RemoveExclamationMarks which removes all exclamation marks from a given string.

public class Solution {

    static String removeExclamationMarks(String s) {

//        String sRemowed = s.replace("!", "");
//
//        return sRemowed;

        return Stream.of(s.split(""))
                .filter(l -> !l.equals("!"))
                .collect(Collectors.joining(""));
    }
}
