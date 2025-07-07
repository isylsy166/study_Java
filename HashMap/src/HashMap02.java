import java.util.*;

public class HashMap02 {
    public static void main(String[] args) {

        String[] friends = {"muzi","ryan", "frodo" , "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};

        int pNum = friends.length; // 사람 수
        int[][] giftTable = new int[pNum][pNum];
        int[] giftIndex = new int[pNum];

        // 각각 친구에 번호 매기기
        Map<String, Integer> friendsMap = new HashMap<>();
        for (int i = 0; i < pNum; i++) { friendsMap.put(friends[i], i); }
        System.out.println(friendsMap);

        // 주고받은 선물 표
        for (String g : gifts) {
            String[] parts = g.split(" ");

            int x = friendsMap.get(parts[0]);
            int y = friendsMap.get(parts[1]);

            int give = 0;
            int receive = 0;

            for (int i = 0; i < pNum; i++) {
                for (int j = 0; j < pNum; j++) {
                    if (i == x && j == y) {
                        giftTable[i][j]++;
                    }
                }
            }
        }

        // 선물지수
        for (int i = 0; i < pNum; i++) {
            int give = 0;
            int receive = 0;

            for (int j = 0; j < pNum; j++) {
                give += giftTable[i][j];
                receive += giftTable[j][i];
            }
            giftIndex[i] = give - receive;
        }

        System.out.println(Arrays.toString(giftIndex));
    }
}
