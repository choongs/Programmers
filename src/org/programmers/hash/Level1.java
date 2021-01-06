package org.programmers.hash;

import java.util.Arrays;

/**
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 *
 * <p>마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을
 * return 하도록 solution 함수를 작성해주세요.
 *
 * <p>제한사항 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다. completion의 길이는 participant의 길이보다 1 작습니다. 참가자의
 * 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다. 참가자 중에는 동명이인이 있을 수 있습니다
 */
public class Level1 {
  public static void main(String[] args) {
    String[] participant = {"mislav", "stanko", "mislav", "ana"};
    String[] completion = {"mislav", "stanko", "ana"};
    System.out.println(solution(participant, completion));
  }

  public static String solution(String[] participant, String[] completion) {
    //솔직히 정렬해서 안될 줄 알았는데...처음엔 for문 2개로 하니 효율성이 탈락함...ㅎㅎ
    Arrays.sort(participant);
    Arrays.sort(completion);

    //사실 이문제는 HashMap을 사용해서 풀어야하는게 맞는데 출제자의 의도와 다르게풀었네
    for (int i = 0; i < participant.length - 1; i++) {
      if (!participant[i].equals(completion[i])) return participant[i];
    }
    return participant[participant.length - 1];
  }
}
