package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {
        message("Hello, World", 3);
        message("Hello, World", 5);
        message("Hello, World", 7);
    }

    public static void message(String message, int times){
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
        System.out.println("NEXT");
    }
}
