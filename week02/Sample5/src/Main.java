import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String name = "";
        short age = 0;
        float height = 0.0f;
        float weight = 0.0f;

        System.out.printf("%s당신의 이름은?", name);
        name = keyboard.nextLine();
        System.out.printf("%s님의 나이는 ? ", name);
        age = keyboard.nextShort();
        System.out.printf("%s님의 키는 ? ", name);
        height = keyboard.nextFloat();
        System.out.printf("%s님의 몸무게는 ? ", name);
        weight = keyboard.nextFloat();

        System.out.printf("%s님읜 나이는 %d살 입니다.\n", name, age);
        System.out.printf("%s님의 키는 %.1f Cm 입니다.\n", name, height);
        System.out.printf("%s님의 몸무게는 %.1f Kg 입니다.\n",name, weight);


    }
}