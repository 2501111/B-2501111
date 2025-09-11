import java.util.Scanner;

public class Main {
    // 메소드
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name = "" ;

        name = keyboard.nextLine();
        // Data 입력

        // 처리 ;

        // 출력 (필수) <- 필수니까 제일 1순위로 적기
        System.out.println("입력받은 이름 : " + name);
    }
}