package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 11000; // 가격 만원 이상 -> 천원 할인
        int age = 10; // 나이 10살 이하 -> 천원 할인

        int discount = 0;

        if(price >= 10000){
            discount += 1000;
            System.out.println("가격 만원 이상, 천원 할인! ");
        } else if (age <= 10){
            discount += 1000;
            System.out.println("나이 10살 이하, 천원 할인!");
        }else{
            System.out.println("할인 없음!");
        }
        System.out.println("총 할인 금액 = " +  discount); // 할인 금액 = 1000
        // 조건 하나만 맞으면 그냥 if 문에서 탈출 하기 때문!
    }
}
