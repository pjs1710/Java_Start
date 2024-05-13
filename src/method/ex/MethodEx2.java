package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        printMessage(5,"hello, world!");
    }

    public static void printMessage(int n, String message) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
