package exercisePackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexAPI {
    public boolean validateMobileNumber(String mobileNumber) {
        Pattern regex = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
        Matcher mobileMatcher = regex.matcher(mobileNumber);
        return mobileMatcher.matches();
    }

    public static void main(String[] args) {
        RegexAPI object = new RegexAPI();
        System.out.println(object.validateMobileNumber("123-85-3456"));
    }
}
