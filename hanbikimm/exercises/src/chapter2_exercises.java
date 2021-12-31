import java.util.Scanner;  // Scanner 사용을 위해 추가
public class chapter2_exercises {
    public static void main(String args[]) {

        // ex1
        System.out.println("Hello, World");
        System.out.print("Hello");
        System.out.println("World");

        // ex2
        System.out.print("3+5=");
        System.out.println(3+5);

        // ex3
        System.out.println(5-3);
        System.out.println(5*3);
        System.out.println(5/3);

        // ex4
        int a = 10;
        System.out.println(a);

        // ex5
        int b = 5;
        System.out.println(a+b);

        // ex7
        String name = "Ja"+"va"+" ";
        String str = name + 8.0;
        System.out.println(str);

        // ex8 - 두 변수의 값 바꾸기
        int x = 10, y = 5;
        System.out.println("x="+x);
        System.out.println("y="+y);

        int tmp = x; // x의 값을 tmp에 저장
        x =y;        // y의 값을 x에 저장
        y = tmp;     // tmp의 값을 y에 저장
        System.out.println("x="+x);
        System.out.println("y="+y);

        // ex9
        String url = "www.code.com";
        double d = 1.23456789;
        System.out.printf("d = %f%n", d);
        System.out.printf("[%-10s%n", url);

        // ex10
        Scanner scanner = new Scanner(System.in);
        System.out.print("두자리 정수 하나 입력하기 > ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        System.out.printf("num = %d%n", num);

        // ex11
        short sMin = -32768, sMax = 32767;
        System.out.println("sMin-1=" + (short)(sMin-1)); // sMin-1=32767
        System.out.println("sMax+1=" + (short)(sMax+1)); // sMax+1=-32768

        // ex12
        String type = "3";
        System.out.println(type.charAt(0) - '0');
        System.out.println('3' - '0' + 1);
        System.out.println("3" + 1);
        System.out.println((char)(3 +'0'));
    }
}