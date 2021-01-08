package org.programmers.stack_queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class PrintPriority {
  public static void main(String[] args) {
    int[] priority = {2, 1, 3, 2};
    System.out.println(solution(priority, 2));
  }

  public static int solution(int[] priorities, int location) {

    Queue<Integer> queue = new LinkedList<>();
    for (Integer i : priorities) {
      queue.add(i);
    }



    return 0;
  }
}
