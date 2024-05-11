package scanner.ex;

public class ChangeVarEx {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        temp = b;
        b = a;
        a = temp;

        System.out.println("== a 와 b 변수 값 교환 ==");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
