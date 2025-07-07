import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {

        // 배열을 크기가 정해져 있기 때문에 처음 초기화 시 크기를 정해준다
        int[] arr = new int[10];

        //값 삽입하기
        arr[0] = 10;

        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1] + i;
        }

        // 배열을 출력할 때는 Arrays.toString()을 사용한다
        System.out.println(Arrays.toString(arr));
    }
}
