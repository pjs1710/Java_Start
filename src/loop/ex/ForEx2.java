package loop.ex;

public class ForEx2 {

    public static void main(String[] args) {
        int even = 2;

        for (int count = 1; count <= 10; count++) {
            System.out.println(even);
            even += 2;
        }

        // for (int even = 2, count = 1; count <= 10; even += 2, count++) {
        //     System.out.println(even);
        // }
        // for 조건식 안에 여러개 넣어도 됨. 별로 좋은 코드는 아님
    }
}
