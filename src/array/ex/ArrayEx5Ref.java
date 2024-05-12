package array.ex;

import java.util.Scanner;

public class ArrayEx5Ref {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("입력받을 정수의 개수를 입력하세요: ");
        int index = input.nextInt();

        int[] num = new int[index];
        System.out.println(index + "개의 정수를 입력하세요: ");

        int sum = 0;
        for (int i = 0; i < index; i++) {
            num[i] = input.nextInt();
            sum += num[i];
        }
        double avg = (double) sum / num.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
