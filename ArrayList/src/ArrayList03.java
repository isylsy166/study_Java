import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        // 이번에는 정수형 리스트 선언
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= 30; i++){
            if(i%5==0){
                list.add(0); // 5의 배수는 0
            }else{
                list.add(i);
            }
        }

        // 리스트를 오름차순으로 정렬
        Collections.sort(list);
        System.out.println(list);

        // 리스트를 내림차순으로 정렬
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);



    }
}
