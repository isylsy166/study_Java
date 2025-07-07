import java.util.Arrays;
import java.util.Comparator;

public class Array02 {
    public static void main(String[] args) {

        // 배열 초기화와 동시에 값 저장하기
        int[] arr = new int[]{1,2,1,2,3};

        // 배열을 오름차순으로 정렬
        Arrays.sort(arr);

        //내림차 순으로 정렬
        // int[]는 기본형이라 Comparator를 쓸 수 없다
        // 내림차순 하기위해서는 직접 뒤집어야함
        // Integer[]는 객체기 때문에 Comparator 사용 가능
        Integer[] arr1 = new Integer[]{1,2,1,2,3};
        Arrays.sort(arr1, Comparator.reverseOrder());

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
