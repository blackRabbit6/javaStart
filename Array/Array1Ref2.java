package Array;

public class Array1Ref2 {

    public static void main(String[] args) {
        int[] students; // 배열선언
        students = new int[5]; // 배열 크기 선언 및 생성

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for(int i = 0; i < students.length; i++){
            System.out.println("학생" + (i+1) + " 점수: " + students[i]);
        }
    }
}
