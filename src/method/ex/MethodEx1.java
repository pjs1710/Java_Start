package method.ex;

public class MethodEx1 {

    public static void main(String[] args) {
        System.out.println("평균값: " + avg(1,2,3));
        System.out.println("평균값: " + avg(15,25,35));
    }

    public static double avg(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
