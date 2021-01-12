package org.programmers.skill.level2;

import java.util.HashSet;
import java.util.Set;

public class WordChainGame {

  public static void main(String[] args) {
    int n = 3;
    String[] arr = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
    int result[] = solution(n, arr);
    for (int i : result) {
      System.out.println(i);
    }
  }

  public static int[] solution(int n, String[] words) {
    int[] answer = new int[2];

    int count = 0;
    int number = 1;
    Set<String> set = new HashSet<>();
    //첫번째 시작하는 부분을 예외적으로 통과시킴
    String lastWord = getFirstWord(words[0]);
    for (int i = 0; i < words.length; i++) {
      if (set.contains(words[i]) || !lastWord.equals(getFirstWord(words[i])) ){
        count = (i+1) % n == 0 ? n : (i+1) % n ;
        break;
      } else {
        lastWord = getLastWord(words[i]);
        set.add(words[i]);
      }

      if ((i+1) % n == 0) {
        number++;
      }
    }

    if(set.size() != words.length) {
      answer[0] = number;
      answer[1] = count;
    }
    return answer;
  }

  private static String getFirstWord(String word) {
    return Character.toString(word.charAt(0));
  }
  private static String getLastWord(String word) {
    return Character.toString(word.charAt(word.length()-1));
  }
}
