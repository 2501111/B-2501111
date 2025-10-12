import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        float height = 0.0f;
        char gender = ' ';
        float weight = 0.0f;
        float weight1 = 0.0f;
        String result = "";

        System.out.print("당신의 키(Meter) 입력 : ");
        height = keyboard.nextFloat();
        System.out.print("당신의 성별(남자 = 'M', 여자 = 'F') 입력 : ");
        gender = keyboard.next().charAt(0);

        weight = gender == 'M' || gender == 'm' ? height * height * 22 : height * height * 21;
        weight1 = gender == 'F' || gender == 'f' ? height * height * 20 : 0.0f;
        result = gender == 'F' || gender == 'f' ?
                String.format("키가 %.1f m인 여자의 미용 체중은 %.2f Kg 입니다.\n", height,weight1) :
                String.format(" ");

        System.out.printf("키가 %.1f m인 %c자의 표준 체중은 %.2f Kg 입니다.\n",
                height, gender == 'f' || gender == 'F' ? '여' : '남', weight);
        System.out.println(result);
    }
}