package cond;

public class CondEx2 {
    public static void main(String[] args) {
        //문제 2 - 거리에 관한 교통수단
        //int distance라는 변수 선언
        // 1km 이하 - 도보 , 10km 이하 - 자전거 , 100km 이하 - 자동차 , 100km 초과 - 비행기

        int distance = 90;
        if (distance <= 1){
            System.out.println("도보를 이용하세요");
        } else if (distance <= 10) {
            System.out.println("자전거를 이용하세요");
        }else if (distance <= 100) {
            System.out.println("자동차를 이용하세요");
        }else {
            System.out.println("비행기를 이용하세요");
        }
    }
}
