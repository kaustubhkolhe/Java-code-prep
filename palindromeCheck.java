// Question:Check if string is palindrom

//Program to check if the given string is palindrome or not.
//This program returns true or false
public class palindromeCheck {
    static boolean isPalindrome(String str){

        int start = 0;
        int end = str.length() - 1;


        str = str.toLowerCase();

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args){


        String str = "froggyGgOrF";

        System.out.println(isPalindrome(str));

    }
}
