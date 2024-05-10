package loop;

public class Break3 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; ;i++) {
            sum += i;
            if(sum > 10) {
                System.out.println("합이 10보다 커지게 되는 i의 값 : " + i);
                break;
            }
        }
    }
}
