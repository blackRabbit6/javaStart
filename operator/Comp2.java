package operator;

public class Comp2 {
    public static void main(String[] args) {
        // 문자열 비교할 때는 == 이 아닌 .equals() 매서드 사용
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); //리터럴 비교
        boolean result2 = str1.equals("문자열1"); //문자열 변수. 리터럴 비교
        boolean result3 = str1.equals(str2); // 문자열 변수 비교

        System.out.println("result1 = " + result1); // result1 = true
        System.out.println("result2 = " + result2); // result2 = true
        System.out.println("result3 = " + result3); // result3 = false
    }
}
