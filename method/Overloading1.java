package method;

public class Overloading1 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }

    // 첫 번째와 두 번째 매서드의 이름은 같지만, 매개변수 목록이 다르기 때문에 각각 매개변수 목록에 맞게 나옴
    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a+b;
    }

    public static int add(int a, int b, int c){
        System.out.println("2번 호출");
        return a+b+c;
    }
}
