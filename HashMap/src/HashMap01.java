import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(0, "duly");
        map.put(1, "frodo");
        map.put(2, "ryan");
        map.put(3, "neo");

        map.put(0, "muzi"); // Key는 중복될 수 없기 때문에 덮어써진다

        System.out.println(map); // map 출력

        // 주어진 키에 해당하는 값을 반환, 없으면 null을 반환한다
        System.out.println(map.get(1));
        System.out.println(map.get(4));

        boolean findName =  map.containsKey(0); // 해당 키가 존재하는지 여부를 반환
        boolean findNumber =  map.containsValue("muzi"); //해당 값이 존재하는지 여부를 반환
        System.out.println(findName);
        System.out.println(findNumber);

        Set<Integer> keySet = map.keySet();
        System.out.println(keySet); // 모든 키를  Set 형태로 반환

        Collection<String> values = map.values();
        System.out.println(values); // 모든 값을 Collection 형태로 반환
    }
}
