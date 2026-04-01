//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final float YEAR = 365.2422f;
        int day;
        int hour;
        int minute;
        int second;
        float temp;



        day = (int) YEAR;

        temp = YEAR - day;
        temp *= 24;
        hour = (int) (temp);

        temp -= hour;
        temp *= 60;
        minute = (int)(temp);

        temp -= minute;
        temp *= 60;
        second = (int) (temp + 0.5);


        System.out.printf("1년은 %.4f인데 이것은 \n " +
                "%d일 %d시간 %d분 %d초 입니다.\n", YEAR, day, hour, minute,second);

    }
}