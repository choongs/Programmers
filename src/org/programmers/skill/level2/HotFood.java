package org.programmers.skill.level2;

import java.util.PriorityQueue;

public class HotFood {

  public static void main(String[] args) {
    int[] foods = {10,9,2,3,1,12};
    System.out.println(solution(foods, 7));
  }
  public static int solution(int[] scoville, int K) {
    int answer = 0;
    PriorityQueue<Integer> foods = new PriorityQueue<>();
    for (int i : scoville) {
      foods.add(i);
    }

    while (true) {
      answer++;
      int first = foods.poll();
      int second = foods.poll();
      foods.add(first + (second * 2));
      if (foods.peek() >= K) break;
      if (foods.size() == 1) return -1;
    }

    return answer;
  }
}
