import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        float height, weight;
        float feet, pound;
        final float FEETUNIT = 30.48f;
        final float POUNDUNIT = 0.453592f;

        System.out.print("당신의 키 입력(Cm)");
        height = keyboard.nextInt();
        System.out.print("당신의 몸구게 입력 (Kg)");
        weight = keyboard.nextInt();

        feet = height / FEETUNIT;
        pound = weight / POUNDUNIT;

        System.out.printf("당신의 키(%.2f Cm)는 %.3f 피트(feet) 입니다 : \n", height, feet );
        System.out.printf("당신의 몸무게(%.2f Kg)는 %.3f 파운드(pound) 입니다.\n", weight,pound);
    }
}