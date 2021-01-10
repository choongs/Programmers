package org.programmers.skill.level2;

public class Stock {
    public static void main(String[] args) {
        int[] prices= {1,2,3,2,3};
        int[] result = solution(prices);
        for (int s : result) {
            System.out.println(s);
        }
    }
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length-1; i++) {
            int price = prices[i];
            for (int j = i+1; j < prices.length; j++) {
                answer[i]++;
                if (price > prices[j]) break;
            }
        }
        return answer;
    }
}
