package org.programmers.skill.level2;

import java.util.*;

public class ChattingHistory {
    public static void main(String[] record) {

        record = new String[]{
                "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"
        };

        if (record.length >= 1 && record.length <= 100000) {
            Map<String, String> nameMap = new HashMap<>();
            List<String> history = new ArrayList<>();
            for (String r : record) {
                String[] user = r.split(" ");
                String command = user[0];
                String id = user[1];
                if (id.length() < 1 && id.length() > 10) continue;

                if ("Leave".equals(command)) {
                    history.add(id + " " + command);
                } else {
                    String nickName = user[2];

                    if (nickName.length() < 1 && nickName.length() > 10) continue;
                    if (nameMap.get(id) == null || !nameMap.get(id).equals(nickName)) {
                        nameMap.put(id, nickName);
                    }
                    if ("Enter".equals(command)) {
                        history.add(id + " " + command);
                    } else if ("Change".equals(command)) {
                        nameMap.put(id, nickName);
                    }
                }


            }
            String[] answer = new String[history.size()];
            for (int i = 0; i < history.size(); i++) {
                String[] data = history.get(i).split(" ");
                String command = data[1];
                String id = data[0];
                if ("Enter".equals(command)) {
                    answer[i] = String.format("%s님이 들어왔습니다.", nameMap.get(id));
                } else {
                    answer[i] = String.format("%s님이 나갔습니다.", nameMap.get(id));
                }
            }

            Arrays.stream(answer).forEach(System.out::println);
        }
    }
}