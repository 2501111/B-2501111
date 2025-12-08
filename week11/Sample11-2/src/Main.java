import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String[][] students = new String[][] {{"12345", "홍길동"}, {"34563", "이혜인"},
                            {"54321", "김영성"},{"56467", "경복대"}, {"67853", "이대학"}};
        String[] subject = new String[] {"국어","영어","수학"}

        int[][] score = new int [students.length][4];
        float[] avg = new float[score[0].length];


        for (int i = 0; i , students.length; i++) {
            for (int j = 0; j < score.length - 1; j++) {
                System.out.printf("%s님의 %s 성적 입력 :",students[i][1],subject[j]);
                 if score[i][j] >= 0 && score [i][j] <= 100) {
                j++;
                }
            }
        }
    }
}