import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {

        // 이번에는 정수형 리스트 선언
        List<Integer[]> list = new ArrayList<>();

        list.add(new Integer[]{1, 2, 3, 4});
        list.add(new Integer[]{2, 1, 3, 5});
        list.add(new Integer[]{0, 3, 2, 8});

        // 각각의 Integer 배열을 가져와서 내림차순으로 정렬한 후 최솟값 구하기
        for(Integer[] i : list){
            Arrays.sort(i, Collections.reverseOrder()); // 내림차순 정렬
            int min = i[i.length - 1]; // 최솟값
            System.out.println(Arrays.toString(i));
            System.out.println(min);
        }

    }
}
