package org.programmers.sort;

import java.util.Arrays;

public class KthNumber {
  public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] reuslt = solution(array, command);

        Arrays.stream(reuslt).forEach(System.out::println);
  }

  public static int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];
    int idx = 0;
    for (int[] command : commands) {
        int i = command[0] - 1;
        int j = command[1];
        int k = command[2];
        int[] slice = Arrays.copyOfRange(array, i, j);
        //System.arraycopy(array, i-1, slice, 0, slice.length);
        Arrays.sort(slice);
        answer[idx++] = slice[k-1];
    }

    return answer;
  }
}
