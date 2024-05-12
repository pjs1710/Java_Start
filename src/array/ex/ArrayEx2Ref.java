package array.ex;

import java.util.Scanner;

public class ArrayEx2Ref {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i < num.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
