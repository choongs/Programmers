package org.programmers.skill.level2;

import java.util.ArrayList;
import java.util.List;

public class LZWCompress {

  public static void main(String[] args) {
    solution("KAKAO");
  }

  public static int[] solution(String msg) {
    List<String> index = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < 26; i++) {
      index.add(Character.toString((char) ('A' + i)));
    }

    int i = 0;
    while (i < msg.length()) {
      String w = Character.toString(msg.charAt(i));
      int idx = -1;
      for (int j = i+1; j < msg.length(); j++) {
        String c = Character.toString(msg.charAt(j));
        if (index.contains(w+c)) {
          w = w+c;
        } else {
          i = j;
          index.add(w+c);
          idx = index.indexOf(w);
          break;
        }
      }
      if (idx != -1) {
        result.add(idx+1);
      } else {
        result.add(index.indexOf(w) + 1);
        break;
      }
    }
    return result.stream().mapToInt(ii -> ii.intValue()).toArray();
  }
}
