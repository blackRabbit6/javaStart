package Array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하시오: ");
        int count = scanner.nextInt();

        System.out.println(count + "개의 정수를 입력하시오: ");

        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = scanner.nextInt();
        }

        // 변수 생성 및 초기화 해야됨
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min){
                min = nums[i];
            }else if (nums[i] > max){
                max = nums[i];
            }

        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
