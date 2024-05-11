package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCost = 0;
        int count = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.print("상품명을 입력하세요: ");
                    String item = input.nextLine();

                    System.out.print("상품의 가격을 입력하세요: ");
                    int itemPrice = input.nextInt();

                    System.out.print("구매 수량을 입력하세요: ");
                    int quantity = input.nextInt();

                    totalCost += itemPrice * quantity;
                    System.out.println("상품명: " + item + " 가격: " + itemPrice + " 수량: " + quantity + " 합계: " + itemPrice * quantity);
                    break;
                case 2:
                    System.out.println("총 비용: " + totalCost);
                    totalCost = 0;
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    count = 1;
                    break;
                default:
                    System.out.println("올바른 옵션을 선택해주세요.");
                    break;
            }
            if (count == 1) break;
        }
    }
}
