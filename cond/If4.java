package cond;

public class If4 {
    public static void main(String[] args) {
        int age = 20;

        if(age <= 7){
            System.out.println("미취학"); //여기서 만약 조건에 들어가지 않ㄴ으면 그 밑 else if 문으로 넘어감
        } else if (age <= 13) { // 여기다가 '8 <= age && age <= 13' 이 법위롷 하지 말것, 어차피 앞에서 조건이 거짓으로 넘어왔기 때문
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
