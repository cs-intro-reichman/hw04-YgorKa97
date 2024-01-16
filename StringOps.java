public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

    }

    public static String capVowelsLowRest(String string) {
        // Write your code here:
        String str = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
                    str += (char) (ch - 32);
                } else {
                    str += ch;
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'A' || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U') {
                    str += ch;
                } else {
                    str += (char) (ch + 32);
                }

            }
            if (ch == ' ') {
                str += ch;
            }
        }
        return str;

    }


    /* check how to remove bug with last example!!!!! */
    public static String camelCase(String string) {
        // Write your code here:\
        String str = "";
        boolean nextLetter = false;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == ' ') {
                nextLetter = true;
            }
            if (c >= 'a' && c <= 'z') {
                if (nextLetter) {
                    str += (char) (c - 32);// upperCase
                    nextLetter = false;
                } else {
                    str += c;
                }
            } else if (c >= 'A' && c <= 'Z') {
                if (i == 0 || !nextLetter) {
                    str += (char) (c + 32);// lowerCase
                    nextLetter = false;
                } else {
                    str += c;
                    nextLetter = false;
                }

            } else if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                str += c;
            }

        }
        char char1 = str.charAt(0);
        if (char1 >= 'A' && char1 <= 'Z') {
            char1 = (char) (char1 + 32);
            str = str.substring(1);
            String newString = "" + char1;
            str = newString + str;

        }

        return str;
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                count++;
            }
        }
        int[] index = new int[count];
        int indexOf = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                index[indexOf] = i;
                indexOf++;
            }

        }

        return index;
    }
}
