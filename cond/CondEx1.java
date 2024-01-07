package cond;

public class CondEx1 {

    public static void main(String[] args) {
        //문제 1 - 성적에 기반한 학점
        // 학생 점수 기분으로 학점 출력
        // 90이상: A, 80이상 90미만: B, 70이상 80미만: C, 60이상 70미만: D, 60 미만:F

        int score = 65;

        if (90 <= score){
            System.out.println("학점은 A입니다.");
        } else if (80 <= score) {
            System.out.println("학점은 B입니다.");
        } else if (70 <= score) {
            System.out.println("학점은 C입니다.");
        } else if (60 <= score) {
            System.out.println("학점은 D입니다.");
        }else{
            System.out.println("학점은 F입니다.");
        }
    }

}
