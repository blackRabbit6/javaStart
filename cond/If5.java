package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 11000; // 가격 만원 이상 -> 천원 할인
        int age = 10; // 나이 10살 이하 -> 천원 할인

        int discount = 0;

        if(price >= 10000){
            discount += 1000;
            System.out.println("가격 만원 이상, 천원 할인! ");
        }
        if(age <= 10){
            discount += 1000;
            System.out.println("나이 10살 이하, 천원 할인!");
        }
        System.out.println("총 할인 금액 = " +  discount); // 할인 금액 = 2000
    }
}
