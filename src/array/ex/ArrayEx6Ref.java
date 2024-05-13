package array.ex;

import java.util.Scanner;

public class ArrayEx6Ref {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("입력받을 정수의 개수를 입력하세요: ");
        int index = input.nextInt();

        int[] num = new int[index];
        System.out.println(index + "개의 정수를 입력하세요: ");

        for (int i = 0; i < index; i++) {
            num[i] = input.nextInt();
        }

        int max = num[0], min = num[0];
        for (int i = 0; i < index; i++) {
            if (min > num[i]) {
                min = num[i];
            }
            if (max < num[i]) {
                max = num[i];
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
