package loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {
        int i = 1, sum = 0, max = 100;

        while (max >= i) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
