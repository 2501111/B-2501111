public class Main {
    public static void main(String[] args) {

        final double PI = 3.141592f;
        final int  RADIUS =6378137;
        final int KOREA = 99720;
        double temp;
        long surface;
        double result;

        temp = 4 * PI * RADIUS * RADIUS;
        surface = (long) temp / 1000000;

        result =  (double) KOREA / surface * 100.0f;

        System.out.printf("지구의 반지롬은 %,d m 입니다.\n", RADIUS);
        System.out.printf("자규우ㅏ 표면적인 %,d \u33A2 입니다\n ", surface);
        System.out.printf("대한민국의 넓이는 %,d \u33A2 입니다\n " ,KOREA);
        System.out.printf("대한민국은 지구의 %f %%입니다\n", result);



    }
}