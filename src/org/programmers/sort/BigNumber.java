package org.programmers.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BigNumber {
  public static void main(String[] args) {
    int[] arr = {3, 30, 34, 5, 9};
    System.out.println(solution(arr));
  }

  public static String solution(int[] numbers) {

      List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

      Collections.sort(list, (o1, o2) -> {
          int a = Integer.valueOf(o1 + "" + o2);
          int b = Integer.valueOf(o2 + "" + o1);
          if (a < b) return 1;
          if (a > b) return -1;
          return 0;
      });

      list.forEach(System.out::println);
      if ( list.stream().distinct().allMatch(num -> num == 0)) return "0";
      return list.stream().map(String::valueOf).collect(Collectors.joining());
  }
}
