package org.programmers.skill.level1;

import java.util.Arrays;

public class PhoneBook {
  public static void main(String[] args) {
    String phone[] = {"119", "97674223", "1195524421"};
    System.out.println(solution(phone));
  }

  public static boolean solution(String[] phone_book) {
    Arrays.sort(phone_book);
    for (int i = 0; i < phone_book.length; i++) {
      for (int j = i + 1; j < phone_book.length; j++) {
        if (phone_book[j].charAt(0) != phone_book[i].charAt(0)) break;
        if (phone_book[j].startsWith(phone_book[i])) {
          return false;
        }
      }
      //
    }

    return true;
  }
}
