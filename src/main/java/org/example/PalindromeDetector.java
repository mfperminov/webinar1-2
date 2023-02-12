package org.example;

public class PalindromeDetector {
  public static void main(String[] args) {
    boolean isPalindrome = checkPalindrome(args[0]);
    if (isPalindrome) {
      System.out.println(args[0] + " is a palindrome!");
    } else {
      System.out.println(args[0] + " is NOT a palindrome!");
    }

  }

  private static boolean checkPalindrome(String arg) {
    return true;
  }
}
