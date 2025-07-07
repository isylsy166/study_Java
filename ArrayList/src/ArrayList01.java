import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();

        // 맨 뒤에 요소 추가
        strList.add("a");
        strList.add("b");

        // 특정 인덱스 위치에 삽입
        // 중간에 빈 값이 있으면 에러남
        strList.add(1, "c");


        // 인덱스로 삭제
        strList.remove(1);

        // 값으로 삭제
        strList.remove("a");

        // 요소 개수
        System.out.println(strList.size());

        // 값 존재 여부
        boolean result = strList.contains("a");
        System.out.println(result);

        System.out.println(strList.get(0));
        System.out.println(strList);
    }
}
