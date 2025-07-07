// 좌표 구하기

public class Array03 {
    public static void main(String[] args) {

        String[] park = {
                "00000",
                "00000",
                "00000"
        };

        int h = park.length; // 공원 높이
        int w = park[0].length(); // 공원 너비

        System.out.println(h);
        System.out.println(w);

        for(int x = 0; x < h; x++){
            for(int y = 0; y < w; y++) {
                System.out.printf("(%d,%d)", x,y);
            }
            System.out.println();
        }



    }
}
