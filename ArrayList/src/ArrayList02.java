import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
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

        int firstZero = list.indexOf(0);
        int LastZero = list.lastIndexOf(0);


        System.out.println(list);
        System.out.printf("첫번째 0의 인덱스는 %d 입니다. \n", firstZero);
        System.out.printf("마지막 0의 인덱스는 %d 입니다. \n", LastZero);



    }
}
