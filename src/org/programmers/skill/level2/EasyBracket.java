package org.programmers.skill.level2;

import java.util.Stack;

public class EasyBracket {

  public static void main(String[] args) {
    System.out.println(solution("(())()"));
  }

  public static boolean solution(String s) {
    boolean answer = true;
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if ('(' == s.charAt(i)) {
        stack.push(1);
      } else {
        if (stack.empty()) {
          answer = false;
          break;
        } else {
          stack.pop();
        }
      }
    }
    if (!stack.isEmpty()) answer = false;

    return answer;
  }
}
