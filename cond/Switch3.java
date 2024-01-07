package cond;

public class Switch3 {
    public static void main(String[] args) {
        // int grade  변수 선언 -> 등급에 따라 그에 맞는 쿠폰 발급
        // 1등급 -> 쿠폰 1000
        // 2등급 -> 쿠폰 2000
        // 3등급 -> 쿠폰 3000
        // 그 외 등급 -> 쿠폰 500

        int grade = 2;

        int coupon;
        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2: // 이런 식으로 되어있으면 break가 없기 때문에 그 밑에 있는 case도 실행됨
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 = " + coupon);
    }
}
