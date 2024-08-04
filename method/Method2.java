package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        System.out.println("= 프로그램 동작 중 =");
        printFooter();
    }

    public static void printHeader(){
        System.out.println("= 프로그랭 가동 =");
        return; // void 일 경우, 생략 가능
    }

    public static void printFooter(){
        System.out.println("= 프로그램 종료 =");
        return;
    }
}
