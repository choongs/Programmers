package org.programmers.skill.level2;

public class World124 {
  public static void main(String[] args) {
    for (int i = 1; i < 10; i++) {
      System.out.println(solution(i));
    }
  }

  public static String solution(int n) {
    StringBuilder sb = new StringBuilder();
    while(true) {
      int r = n % 3;
      n =  r == 0 ? (n / 3) - 1 : n  / 3;
      sb.append(r == 0 ? 4 : r);
      if (n < 3) {
        sb.append(n == 0 ? "" : n);
        break;
      }
    }
    return sb.reverse().toString();
  }
}
