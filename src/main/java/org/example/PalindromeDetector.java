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

  private static boolean checkPalindrome(String original) {
    StringBuilder reverseStringBuilder = new StringBuilder();
    int originalStringLength = original.length();
    for (int i = (originalStringLength - 1); i >=0; i--) {
      reverseStringBuilder.append(original.charAt(i));
    }
    return reverseStringBuilder.toString().equalsIgnoreCase(original);
  }

}
