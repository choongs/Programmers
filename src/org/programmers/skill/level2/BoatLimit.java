package org.programmers.skill.level2;

import java.util.Arrays;

public class BoatLimit {
    public static void main(String[] args) {
        int[] people = {70,  80 ,50};
        int result = solution(people, 100);
        System.out.println(result);
    }

    public static int solution(int[] people, int limit) {

        if (people.length < 1 || people.length > 50000) {
            return 0;
        }

        if (limit < 40 || limit > 240) {
            return 0;
        }

        Arrays.sort(people);
        int offset = 0;
        int answer = 0;
        for (int i = people.length-1; i >= offset; i--) {
            if (i == offset) {
                answer++;
                break;
            }
            if (people[i] + people[offset] <= limit ) {
                offset++;
            }
            answer++;
        }
        return answer;
    }
}
