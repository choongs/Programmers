package org.programmers.exhaustive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**

수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

        1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

        제한 조건
        시험은 최대 10,000 문제로 구성되어있습니다.
        문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
        가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
*/


public class PracticeTest {
  public static void main(String[] args) {
    int[] answer = {1,2,3,4,5};
    int[] result = solution(answer);

    for (int i : result) {
      System.out.println(i);
    }
  }

  public static int[] solution(int[] answers) {
    int[] point = new int[3];
    int[] a = {1,2,3,4,5};
    int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    for (int i = 0; i < answers.length; i++) {
        int ans = answers[i];
      if (ans == a[i % a.length]) {
          point[0]++;
      }
        if (ans == b[i % b.length]) {
            point[1]++;
        }

        if (ans == c[i % c.length]) {
            point[2]++;
        }
    }

    int max = Arrays.stream(point).max().getAsInt();
      List<Integer> list = new ArrayList<>();
    for (int i = 0; i < point.length; i++) {
      if (point[i] == max) {
          list.add(i+1);
      }
    }

    return list.stream().mapToInt(i -> i.intValue()).toArray();
  }
}
