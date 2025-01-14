package Intermediate;

public class Palindrome {
    public boolean isPalindrome(String s) {
        if(s.length()==1)
            return true;
        if(s.charAt(0)==s.charAt(s.length()-1)) // checking if the first and last character are same
            return isPalindrome(s.substring(1,s.length()-1)); // checking further characters
        else
            return false;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome("racecar"));
        System.out.println(p.isPalindrome("BOB"));
    }




}
