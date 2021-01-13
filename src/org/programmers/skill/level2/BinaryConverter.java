package org.programmers.skill.level2;

import java.util.Arrays;

public class BinaryConverter {

  public static void main(String[] args) {
    solution("1111111");
  }

  public static int[] solution(String s) {
    int[] answer = new int[2];
    String target = s;
    int zeroSum = 0;
    int count = 0;
    while (!"1".equals(target)) {
      count++;
      String[] data = target.split("(?<!^)");
      zeroSum += Arrays.stream(data).filter(ss -> "0".equals(ss)).count();
      long decimal = target.replace("0", "").length();
      target = decimalToBinary(decimal);
    }

    answer[0] = count;
    answer[1] = zeroSum;

    System.out.println(answer[0]);
    System.out.println(answer[1]);
    return answer;
  }

  private static String decimalToBinary(long decimal) {
    StringBuilder sb = new StringBuilder();
    long num = decimal;
    while (num != 1) {
      sb.append(num % 2);
      num = num / 2;
    }
    sb.append(1);
    sb.reverse();
    return sb.toString();
  }
}
