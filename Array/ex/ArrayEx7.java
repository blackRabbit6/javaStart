package Array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        // 내가 푼거 ArrayEx7Tea파일은 같은 문제지만 교수님이 만든 깔금한 답안
        Scanner scanner = new Scanner(System.in);

        int[][] score = new int[4][3];

        for (int i = 0; i<4; i++){
            System.out.println((i+1) + "번 학생의 성적을 입력하세요: ");
            for(int j =0; j<3; j++){
                if(j == 0) {
                    System.out.print("국어 점수: ");
                    score[i][j] = scanner.nextInt();
                } else if (j == 1) {
                    System.out.print("영어 점수: ");
                    score[i][j] = scanner.nextInt();
                }
                else if (j == 2) {
                    System.out.print("수학 점수: ");
                    score[i][j] = scanner.nextInt();
                }
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
