import java.util.Scanner;
public class chapter3_exercises {
    public static void main(String args[]){
        // ex1
        int x, y;
        x = y = 3;
        System.out.println("x=" +x);
        System.out.println("y="+y);

        // ex2
        int i=5, j=0;
        j = i++;
        System.out.println("j = i++; 실행 후, i =" + i +", j="+ j);

        i=5;
        j=0;
        j = ++i;
        System.out.println("j = ++i; 실행 후, i =" + i +", j="+ j);

        // ex4
        i = -10;
        i = -i;
        System.out.println(i);

        // ex5
        double d = 85.4;
        int score = (int)d;
        System.out.println("score=" +score);
        System.out.println("d=" +d);

        // ex6
        int a = 10, b =4;
        System.out.printf("%d / %d = %d%n", a, b, a/b);
        System.out.printf("%d / %f = %f%n", a, (float)b, a/(float)b);

        // ex8
        byte w = 10, q = 30, z = (byte)(w*q);
        System.out.println(z);

        // ex10
        long integer = 1_000_000 * 1_000_000;
        long longer = 1_000_000 * 1_000_000L;
        System.out.println("integer="+integer);
        System.out.println("longer="+longer);

        // ex11
        double pi = 3.141592;
        double shortPi = Math.round(pi*1000) / 1000.0;
        System.out.println(shortPi);

        // ex13
        System.out.println(-10%8);
        System.out.println(10%-8);
        System.out.println(-10%-8);

        // ex14
        String str1 = "abc";
        String str2 = new String("abc");
        System.out.printf("str1 == abc ? %b%n", str1=="abc");
        System.out.printf("str2 == abc ? %b%n", str2=="abc");
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));

        // ex15
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("문자 하나 입력하세요 > ");
        String input = scanner.nextLine();
        ch = input.charAt(0);

        if('0' <= ch && ch <= '9'){
            System.out.printf("입력하신 문자는 숫자입니다.%n");
        }else {
            System.out.printf("입력하신 문자는 숫자가 아닙니다.%n");
        }



    }
}