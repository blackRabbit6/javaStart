package Array.ex;

import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개 정수 입력: ");

        int[] nums = new int[5];
        for(int i=0; i< nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("출력");
        for (int i=0; i< nums.length; i++){
            System.out.print(nums[i]);
            if(i < nums.length-1) {
                System.out.print(", ");
            }
        }
    }
}
