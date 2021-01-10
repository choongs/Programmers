package org.programmers.skill.level1;

import java.util.ArrayList;
import java.util.List;

public class AnyPang {
  public static void main(String[] args) {
    int[][] brard =
            {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    int[] moves = {1,5,3,5,1,2,1,4};
    solution(brard,moves);
  }

  public static int solution(int[][] board, int[] moves) {
    int answer = 0;

      List<Integer> result = new ArrayList<>();

    for (int move : moves) {
        if (board[board.length-1][move-1] == 0) continue;
      for (int i = 0; i < board.length; i++) {
        if (board[i][move-1] != 0) {

            result.add(board[i][move-1]);
            board[i][move-1] = 0;
            break;
        }
      }
    }

      int cnt = 0;
    while (cnt < result.size()-1) {
        if (result.get(cnt) == result.get(cnt+1)) {
            result.remove(cnt+1);
            result.remove(cnt);
            cnt = 0;
            answer += 2;
            continue;
        }
        cnt++;
    }
    return answer;
  }
}
