package cond;

public class If1 {

    public static void main(String[] args) {

        int age = 20;

        if( age >= 18){
            System.out.println("성인입니다.");
        } // -> 이 부분 '성인입니다.' 만 출력됨 -> 참이기 때문
        if(age < 18){
            System.out.println("미성년자입니다.");
        }
    }

}
