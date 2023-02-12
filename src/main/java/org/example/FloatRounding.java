package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FloatRounding {
  public static void main(String[] args) {
    float example = 1041.99989f;
    System.out.println("Rounded by division: " + roundByDivision(example));
    System.out.println("Rounded by big decimal: " + roundByBigDecimal(example));
  }

  private static double roundByDivision(float example) {
    int temp = (int)(example * 100);
    return temp / 100.00;
  }

  private static BigDecimal roundByBigDecimal(float example) {
    return BigDecimal.valueOf(example).setScale(2, RoundingMode.DOWN);
  }

}