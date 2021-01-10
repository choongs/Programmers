package org.programmers.skill.level2;

import java.util.Stack;

public class Bracket {
  public static void main(String[] args) {
    System.out.println(checkBracket("(()))("));
  }

  public static boolean checkBracket(String p) {
      Stack<Character> stack = new Stack<>();
    for (int i = 0; i < p.length(); i++) {
        char s = p.charAt(i);
      if('(' == s) {
          stack.add('(');
      } else {
          if (stack.isEmpty()) return false;
          stack.pop();
      }
    }
      return true;
  }
}
