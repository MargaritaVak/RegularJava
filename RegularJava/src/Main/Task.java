package Main;

import java.util.regex.Pattern;

public class Task {

        static public boolean ipAddress(String str){
            String ipPattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
           //0-255.0-255.0-255.0-255
            return Pattern.matches(ipPattern, str);
        }

        static public boolean GUID(String str){
            String guidPattern = "^[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}|[{][0-9a-fA-F]{8}-" +
                    "([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}[}]$";
            return Pattern.matches(guidPattern, str);
        }

        static public boolean URL(String str){
            String urlPattern = "(https?://)?(www\\.)?([a-zA-Z][-a-zA-Z0-9]*[a-zA-Z]\\.)+[a-zA-Z]{2,}" +
                    "(/[\\w-.~:?#\\[\\]@!$&'()*+,;%=]+)*/?$";
            return Pattern.matches(urlPattern, str);
        }

        static public boolean Password(String str){
            String passwordPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9_]{8,}";
            return Pattern.matches(passwordPattern, str);
        }

}
