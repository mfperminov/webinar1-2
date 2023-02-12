package org.example;

import java.util.Random;

public class PasswordGenerator {
  private static final char[] SPECIAL_CHARACTERS = {'!', '?', '&', '$'};
  private static final char[] LOWERCASE_CHARACTERS = new char[26];
  private static final char[] UPPERCASE_CHARACTERS = new char[26];
  private static final char[] DIGITS = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
  private static final int DEFAULT_PASSWORD_LENGTH = 8;

  public static void main(String[] args) {
    for (char lowerChar = 'a'; lowerChar <= 'z'; lowerChar++)
      LOWERCASE_CHARACTERS[lowerChar - 'a'] = lowerChar;
    for (char upperChar = 'A'; upperChar <= 'Z'; upperChar++)
      UPPERCASE_CHARACTERS[upperChar - 'A'] = upperChar;
    try {
      System.out.println(Integer.parseInt(args[0]));
    } catch (ArrayIndexOutOfBoundsException|NumberFormatException exception) {
      System.out.println("Argument is not provided, generate password with a default length.");
      System.out.println(generatePassword(DEFAULT_PASSWORD_LENGTH));
    }
  }

  private static String generatePassword(int length) {
    StringBuilder password = new StringBuilder();
    Random random = new Random(System.currentTimeMillis());
    int currentLength = 0;
    while (currentLength < length) {
      int arrayPosition = random.nextInt(4);
      switch (arrayPosition) {
        case 0:
          password.append(SPECIAL_CHARACTERS[random.nextInt(SPECIAL_CHARACTERS.length)]);
          break;
          case 1:
          password.append(LOWERCASE_CHARACTERS[random.nextInt(LOWERCASE_CHARACTERS.length)]);
          break;
          case 2:
          password.append(UPPERCASE_CHARACTERS[random.nextInt(UPPERCASE_CHARACTERS.length)]);
          break;
          case 3:
          password.append(DIGITS[random.nextInt(DIGITS.length)]);
          break;
        default: throw new IllegalArgumentException("Cannot get array for position " + arrayPosition);
      }
      currentLength++;
    }
    return password.toString();
  }
}
