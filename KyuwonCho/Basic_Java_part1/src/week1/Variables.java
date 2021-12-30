package week1;
import java.util.Scanner;
// psvm은 main함수 추가해준다
public class Variables {
    public static void main(String args[]) {
        Variables problems = new Variables();
        problems.ex12();
    }

    public void ex1() {
        System.out.println("Hello, world!");
        System.out.println("Hello");
        System.out.println("World!");
    }

    public void ex2() {
        // printf와 println의 차이점은 print는 문장 끝에 줄넘김이 없고 println은 줄넘김이 있다.
        // 또한 printf의 기능으로는 다른 형식으로 데이터를 출력할 수가 있다.
        System.out.println("Hello, world!");
        System.out.print("3 + 5 = ");
        System.out.println(3+5);
    }

    public void ex3() {
        System.out.println(5+3);
        System.out.println(5-3);
        System.out.println(5*3);
//      파이썬과 달리 자바에서는 정수끼리의 나눗셈은 정수로 나온다 따라서 5/3은 1로 표현. 파이썬의 5//3과 같을 듯.
        System.out.println(5/3);
    }

    public void ex4() {
        int x = 5;
        System.out.println(x);

        x = 10;
        System.out.println(x);
    }

    public void ex5() {
        int x = 10;
        int y = 5;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
    }

    public void ex6() {
        int x = 100;
        // 20억 정도(2^31)가 넘어가는 수는 long이라는 variable을 사용하고 숫자 뒤에 L을 붙여 long타입인 것을 명시해준다.
        // integer: 4byte = 32 bit -> 1bit는 sign을 위해(0 positive 1 negative) -> -2^31 ~ 2^31 -1의 범위
        long x_2 = 10000000000L;
        // long: 8byte = 64 bit -> -2^6 ~ 2^63 - 1
        // signed unsigned 둘 다 구현이 가능하지만 왠만하면 그냥 int, long으로만 사용하는 것이 오류가 적다
        double pi = 3.14d;
        // 실수형의 기본 자료형 타입으로 d(D)를 생략해도 된다.
        float pi_2 = 3.141598F;
        // double(기본 8byte) 메모리를 적게 사용하는 float를 사용하기 위해선 뒤에 f(F)를 붙여준다
        // 대충 실수에서 float는 소수점 9자리, double은 소수점 18자리까지 표현 가능
        // 정확한 수가 아니라 근접한 수를 주는 것으로 해당 소수점이 넘어가면 오차가 생긴다.
        char ch = 'a';
        // string은 쌍따옴표가 꼭 와야됨... 일반 따옴표는 문자 하나 표현할 때 쓰는 듯 싶다.
        String str = "abc";

        // 위에 예시는 변수를 지정하는 예시
        // 상수를 지정하기 위해서는 앞에 final을 붙여주면 된다.
        // 상수로 지정했을 시 값을 변경 해줄 수가 없다
        // 변수: variable 상수: constant 값: literal

        final int z = 20;
        // z = 30; 불가!!!

        System.out.println(x);
        System.out.println(x_2);
        System.out.println(pi);
        System.out.println(ch);
        System.out.println(str);
    }

    public void ex7() {
        // 파이썬에서는 문자열 + 정수는 불가했지만 자바에서는 문자열을 더해주면 다른 타입을 문자열로 바꾸고 더하기를 실행해준다
        // string + string = string
        String name = "Ja" + "va";
        // string + integer = string
        String str = name + 1.8;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + "");
        System.out.println("" + 7);
        System.out.println("" + "");
        // 왼쪽부터 더해지므로 정수 + 정수 = 정수, 정수 + 빈칸 = 문자열
        System.out.println(7 + 7 + "");
        System.out.println("" + 7 + 7);
    }

    public void ex8() {
        int x = 10, y = 5;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // python에서는 x, y = y, x가 가능했는데 여기서는 따로 변수를 만들어서 저장을 해줘야한다.
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public void ex9() {
        String url = "www.codechobo.com";
        float f1 = .10f;
        float f2 = 2e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789;

        // printf를 통해 같은 f1을 float, 부동소수점 실수 출력, float과 부동소수점 중 짧은 것으로 표현
        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
        System.out.printf("d = %f%n", d);
        // 총 14자리 숫자 중 10자리를 소수점에 할애
        System.out.printf("d = %14.10f%n", d);
        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
        // 총 20글자의 공간을 마련, 우정렬
        System.out.printf("[%20s]%n", url);
        // 위와 같은 것을 좌정렬
        System.out.printf("[%-20s]%n", url);
        // 왼쪽에서부터 8글자 출력
        System.out.printf("[%.8s]%n", url);
    }

    public void ex10() {
        // line 2에서처럼 자바 유틸에서 스캐너(입력기능)을 import 해준다
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요> ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 :" + input);
        System.out.printf("num = %d%n", num);

    }
    public void ex11() {
        // 오버플로우란 max + 1 = min, min -1 = max가 되는 현상. 최대(최소)가 넘어가면서 제일 앞의 부호가 바뀌게 되기 때문에 발생
        // 부호에 따라 2진수 계산 값이 달라진다. 0111 = 7, 1000 = -8, 1111 = -1
        short sMin = -32768, sMax = 32767;
        char cMin = 0, cMax = 65535;

        System.out.println("sMin: " + sMin);
        System.out.println("sMin - 1: " + (short)(sMin - 1));
        System.out.println("sMin: " + sMax);
        System.out.println("sMin: " + (short)(sMax + 1));
        System.out.println("cMin: " + (int)(cMin));
        System.out.println("cMin - 1: " + (int)--cMin);
        System.out.println("sMax: " + (int)(cMin));
        System.out.println("sMax + 1: " + (int)++cMin);
    }

    public void ex12() {
        /*  간단한 타입변환을 알아두면 편하게 사용 가능하다
            (char)(3 + '0') = '3' 숫자 -> 문자
            '3' - '0' = 3 문자 -> 숫자
            3 + "" = "3" 숫자 -> 문자열
            Integer.parseInt("3") = 3 문자열 -> 숫자(int)
            Double.parseDouble("3") = 3 문자열 -> 숫자(double)
            "3".charAt(0) = '3' 문자열 -> 문자
            '3' + "" = "3" 문자 -> 문자열
        */
        String str = "3";
        String str_test = "123";

        System.out.println(str.charAt(0));
        System.out.println(str_test.charAt(1));
        System.out.println('3' - '0' + 1); // 문자 -> 숫자 , + 1
        System.out.println(Integer.parseInt(str) + 1);
        System.out.println(str + 1); // 문자열 + 숫자 = 문자열 + 문자열(숫자)
        System.out.println((char)(3 + '0'));
        System.out.println('A' + 'B'); // ASCII코드 A는 65, B는 66. 'A' + 'B' = 131
        System.out.println('1' + 2); // ASCII코드 1은 49. '1' + 2 = 51
        System.out.println('1' + '2'); // ASCII코드 1은 49 2는 50. '1' + '2' = 99
        //System.out.println(true + null); null은 reference 타입이기때문에 불가
        // Byte != byte, Byte는 class, byte는 primitive
    }
}
