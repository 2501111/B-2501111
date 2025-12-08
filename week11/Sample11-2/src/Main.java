import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String[][] students = {
                {"12345", "홍길동"},
                {"34563", "이혜인"},
                {"54321", "김영성"},
                {"56467", "경복대"},
                {"67853", "이대학"}
        };

        String[] subject = {"국어", "영어", "수학"};

        int[][] score = new int[students.length][subject.length];
        float[] avg = new float[students.length];

        // 입력 루프
        for (int i = 0; i < students.length; i++) {

            for (int j = 0; j < subject.length; j++) {

                while (true) {
                    System.out.printf("%s님의 %s 성적 입력 : ",
                            students[i][1], subject[j]);

                    int input = keyboard.nextInt();

                    if (input >= 0 && input <= 100) {
                        score[i][j] = input;
                        break;  // nota válida → salir del while
                    } else {
                        System.out.println("⚠️ 0~100 사이로 입력하세요.");
                    }
                }
            }
        }

        // 평균 계산
        for (int i = 0; i < students.length; i++) {
            int total = 0;
            for (int j = 0; j < subject.length; j++) {
                total += score[i][j];
            }
            avg[i] = total / 3.0f;
        }

        // 출력
        System.out.println("\n===== 성적 결과 =====");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%s 평균 점수 : %.2f점\n", students[i][1], avg[i]);
        }
    }
}
