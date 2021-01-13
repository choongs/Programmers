package org.programmers.skill.level2;

public class DataProcess {

  public static void main(String[] args) {
    solution("aabbaccc");
  }

  public static int solution(String s) {
    int min = Integer.MAX_VALUE;
    for (int i = 1; i <= s.length() / 2; i++) {
      String data = "";
      String next = "";
      String result = "";
      int hit = 1;
      for (int j = 0; j <= s.length() / i; j++) {
        int start = i * j;
        int end = i * (j+1) > s.length() ? s.length() : i * (j+1);
        data = next;
        next = s.substring(start, end);
        if (data.equals(next)) {
          hit++;
        } else {
          result += hit > 1 ? hit+data : data;
          hit = 1;
        }
      }
      result += hit > 1 ? hit+next : next;
      if (min > result.length()){
        min = result.length();
        System.out.println(result);
      }
    }
    return min;
  }
}
