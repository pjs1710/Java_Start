package operator;

public class Operator2 {

    public static void main(String[] args) {

        String result1 = "hello " + "world!";
        System.out.println(result1);

        String s1 = "string1\n";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        String result3 = "a + b = " + 10; // 10을 문자열로 바꿈
        System.out.println(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num; // num => 문자열로 바꿈
        System.out.println(result4);
    }
}
