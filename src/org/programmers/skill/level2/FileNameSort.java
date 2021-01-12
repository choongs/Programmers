package org.programmers.skill.level2;

import java.util.Arrays;
import java.util.Comparator;

public class FileNameSort {

  public static void main(String[] args) {
    String[] s = {"a mg12.png", "img10", "img00", "img001.png", "IMG01.GIF", "img0.JPG"};
    String[] result = solution(s);
    for (String s1 : result) {
      System.out.println(s1);
    }
  }

  public static String[] solution(String[] files) {
    Arrays.sort(files, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        String[] first = separate(o1);
        String[] second = separate(o2);

        int vs = first[0].compareTo(second[0]);
        if (vs == 0) {
          return Integer.valueOf(first[1]) - Integer.valueOf(second[1]);
        }
        return vs;
      }

      private String[] separate(String word) {
        int startIdx = -1;
        int endIdx = -1;
        for (int i = 0; i < word.length(); i++) {
          if (startIdx == -1 && word.charAt(i) >= 48 && word.charAt(i) <= 57) {
            startIdx = i;
          } else if (startIdx != -1 && !(word.charAt(i) >= 48 && word.charAt(i) <= 57)) {
            endIdx = i;
          }
          if (startIdx != -1 && endIdx != -1) {
            break;
          }
        }

        String[] result = new String[2];
        result[0] = word.substring(0, startIdx).toLowerCase();
        if (endIdx == -1) {
          if (word.length() - startIdx > 5) {
            result[1] = (word.substring(startIdx, startIdx + 5));
          } else {
            result[1] = (word.substring(startIdx));
          }
        } else {
          if (endIdx - startIdx > 5) {
            result[1] = (word.substring(startIdx, startIdx + 5));
          } else {
            result[1] = (word.substring(startIdx, endIdx));
          }
        }
        return result;
      }

    });

    return files;
  }
}
