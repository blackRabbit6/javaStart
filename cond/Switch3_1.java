package cond;

public class Switch3_1 {
    public static void main(String[] args) {
        // 새로운 switch문 -> 자바 14부터 사용됨
        // 기존 switch 문 차이 '->' 사용 + 선택된 데이터 반환 할 수 있음
        int grade = 2;

        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 = " + coupon);
    }
}
