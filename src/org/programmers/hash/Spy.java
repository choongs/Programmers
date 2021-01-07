package org.programmers.hash;

import java.util.*;
import java.util.stream.Collectors;

public class Spy {
  public static void main(String[] args) {
    //
  }

  public static int solution(String[][] clothes) {
    int answer = 0;
    Map<String, List<String>> map = new HashMap<>();

    for (int i = 0; i < clothes.length; i++) {
      if (map.get(clothes[i][1]) == null) {
        List<String> data = new ArrayList<>();
        data.add(clothes[i][0]);
        map.put(clothes[i][1], data);
      } else {
        List<String> data = map.get(clothes[i][1]);
        data.add(clothes[i][0]);
        map.put(clothes[i][1], data);
      }
    }

    Set<String> set = map.keySet();
    Iterator<String> it = set.iterator();
    int sum = 1;
    while (it.hasNext()) {
      sum *= map.get(it.next()).size() + 1;
    }
    answer = sum - 1;
    return answer;
  }
}
