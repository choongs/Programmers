package org.programmers.heap;

import java.util.PriorityQueue;
import java.util.Queue;

/**

매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶습니다. 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 새로운 음식을 만듭니다.

        섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
        Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
        Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.

        제한 사항
        scoville의 길이는 2 이상 1,000,000 이하입니다.
        K는 0 이상 1,000,000,000 이하입니다.
        scoville의 원소는 각각 0 이상 1,000,000 이하입니다.
        모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.
*/


public class Scoville {
  public static void main(String[] args) {
    int[] scoville = {1,2,3,9,10,12};
    int k = 7;
    System.out.println(solution(scoville, k));
  }

  public static int solution(int[] scoville, int K) {
    Queue<Integer> queue = new PriorityQueue<>();
    for (Integer sc : scoville) {
        queue.add(sc);
    }


    int cnt = 0;
    while (true) {
        cnt ++;
        int first = queue.poll();
        int second = queue.poll() * 2;
        queue.add(first + second);

        //다른사람이 푼것을 보면 굳이 다 비교하지않고 queue.peek()만 호출해서 비교.. 어차피 가장 낮은수가 K랑 같거나 크면되기때문에..
        if (queue.stream().map(q -> q.intValue()).allMatch(i -> i >= K)) return cnt;

        if (queue.size() < 2) return  -1;
    }
  }
}
