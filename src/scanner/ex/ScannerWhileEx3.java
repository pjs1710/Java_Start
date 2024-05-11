package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");

        double sum = 0;
        int count = 0;

        while (true) {
                double num = input.nextDouble();

                if (num == -1) {
                    break;
                }

                sum += num;
                count++;
        }

//        double input = 0;
//        while ((input = input.nextDouble()) != -1){
//            sum += input;
//            count++;
//        }

        double avg = sum / count;

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}
