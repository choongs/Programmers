package org.programmers.skill.level2;

import java.util.Arrays;

public class LeastCommonMultiple2 {

  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    System.out.println(solution(arr));
  }
  public static int solution(int[] arr) {
    int answer = 0;
    Arrays.sort(arr);
    int max = arr[arr.length-1];
    int multiple = 1;
    while (true) {
      boolean flag = true;
      for (int i = 0; i < arr.length-1; i++) {
        if( (max * multiple) % arr[i] != 0){
          flag = false;
          break;
        }
      }
      if (flag) break;
      multiple++;
    }
    answer = multiple * max;
    return answer;
  }
}
