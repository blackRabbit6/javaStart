package Array.ex;

import java.util.Scanner;

public class ArrayEx7Tea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] score = new int[4][3];
        String[] subjects = {"국어","영어","수학"};

        for (int i = 0; i<4; i++){
            System.out.println((i+1) + "번 학생의 성적을 입력하세요: ");
            for(int j =0; j<3; j++){
                System.out.print(subjects[j] + " 점수: ");
                score[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i< score.length; i++){
            int sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }
            double aver = (double) sum / 3;
            System.out.println((i+1) + "번의 학생 총점: " + sum + ", 평균: " + aver);
        }
    }
}
