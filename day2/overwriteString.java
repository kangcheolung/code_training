package day2;

public class overwriteString {
    public static String overwriteString(String my_string, String overwrite_string, int s) {
        StringBuilder result = new StringBuilder(my_string);
        return result.replace(s, s + overwrite_string.length(), overwrite_string).toString();
    }

    public static void main(String[] args) {

        String result = overwriteString("He11oWor1d", "lloWorl", 2);
        System.out.println(result);
    }
}