package org.programmers.skill.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PairWord {

  public static void main(String[] args) {
    System.out.println(solution("cdcd"));
  }

  // 이건 풀었는데 효율성에서 시간초과로 실패..
  public static int solution(String s) {
    List<Character> wordList = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      wordList.add(s.charAt(i));
    }

    boolean flag = true;
    while (flag) {
      flag = false;
      for (int i = 0; i < wordList.size() - 1; i++) {
        if (wordList.get(i) == wordList.get(i + 1)) {
          wordList.remove(i + 1);
          wordList.remove(i);
          flag = true;
          //break;
        }
      }
    }

    return wordList.size() == 0 ? 1 : 0;
  }

  //누군가 스택을 사용하면 좋다고 힌트를 줘서.. 잘됨 ㅋㅋ
  public static int solution2(String s) {

    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
       if (stack.isEmpty()) {
         stack.add(ch);
       } else if (stack.peek() == ch) {
         stack.pop();
       } else {
         stack.add(ch);
       }
    }
    return stack.isEmpty() ? 1 : 0;
  }
}
