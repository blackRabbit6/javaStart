package cond;

public class CondEx5 {
    public static void main(String[] args) {
        // 문제 5 -  학점에 따른 성취도 출력
        // String grade - 문자열 변수 학점 선언 -> 학점에 따른 성취도 출력
        // A - "탁월환 성과입니다.",B - "좋은 성과입니다.",C -"준수한 성과입니다.",D -"향상이 필요합니다."
        // ,F -"불합격입니다.",나머지 -"잘못된 학점입니다."
        // switch 문 사용

        String grade = "C";

        switch (grade){
            case "A":
                System.out.println("탁월환 성과입니다.");
                break;
            case "B":
                System.out.println("좋은 성과입니다.");
                break;
            case "C":
                System.out.println("준수한 성과입니다.");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }
    }
}
