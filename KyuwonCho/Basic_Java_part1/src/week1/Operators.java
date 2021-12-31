package week1;

import java.awt.*;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        /*
        사칙연산, 나머지연산 :                           + - * / %(나머지),
        bit 연산자(bitwise operator):                  <<(<) >>(>) (shift), & (and), | (or), ~(not)
        대입 연산자:                                    =
         */
        Operators examples = new Operators();
        examples.ex17();
    }

    public void ex1() {
        /*
        이행 속도면에서 연산마다 순서가 있다.
        단항 연산(부호) -> 곱셈,나눗셈 -> 덧셈, 뺄셈 -> 비교 -> 논리 -> 대입 순으로 진행 (괄호 없을 시)
         */
        // 오른쪽부터 연산이 진행된다. 예를 들어 float 사용시, 제일 오른쪽에 f(F)를 붙여 float임을 표시하듯
        int x, y;

        x = y = 3; // 3을 y에, 그리고 x에.
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public void ex2() {
        int i = 5, j = 0;
        // j에 i 값을 대입 후 +1
        j = i++;
        System.out.printf("j=i++ %ni = %d %nj = %d%n", i, j);

        i = 5;
        j = 0;
        // j에 i 값을 대입 전 +1
        j = ++i;
        System.out.printf("j=++i %ni = %d %nj = %d%n", i, j);
    }

    public void ex3() {
        int i = 5, j = 5;
        // 출력 후 증가
        System.out.println(i++);
        // 출력 전 증가
        System.out.println(++j);
        System.out.println("i = " + i + ", j = " + j);
    }

    public void ex4() {
        // i = +i -> +1 * i
        // i = -i -> (-1) * i
        // boolean, char 빼고 기본형 타입에 사용
        int i = -10;
        i = +i;
        System.out.println(i);

        i = -10;
        i = -i;
        System.out.println(i);
    }

    public void ex5() {
        // variable 클래스에서 했던 것처럼, 간단 버전은 알고 잇으면 실수가 적을 것
        // 실수 -> integer시 소숫점 잘라낸다. (round x)
        double d = 85.4;
        int score = (int)d;
        System.out.println("score = " + score);
        System.out.println("d = " + d);

        // float f = 1233; 등으로 맞지 않게 쓸 경우, 자동으로 값이 제일 보존 잘 되는 형태로 변환된다.

    }

    public void ex6() {
        //사칙연산에서 가장 중요한 것은 integer/integer의 결과값은 interger만 오기 때문에 소숫점은 버려진다.
        // int/float float/int 등은 제대로 소숫점 나온다
        int a = 5;
        int b = 4;
        System.out.println("a / b = " + (a/b)); // 1
        System.out.println("(float)a / (float)b = " + ((float)a/(float)b)); // 1.25
    }

    public void ex7() {
        // 피연산자 타입의 크기가 int의 크기인 4byte보다 작으면 연산시 int로 변환된다.
        // ex) byte, short, char 는 연산시 각각 int로 변환되어 계산된다
        // 4byte 이상인 경우, 피연산자 중 큰 타입으로 변환된다.
        // ex) long + int => long + long = long
        byte a = 10;
        byte b = 30;
        // byte + byte는 자동으로 int + int로 변환되기 때문에 byte로 변환을 시켜줘야 c에 바이트 타입으로 저장 가능
        byte c = (byte)(a * b);
        System.out.println(c); // 44 출력
        // byte -> int는 데이터 손실이 없지만, 결과값인 int 300을 byte로 바꾸면서 손실이 생김
    }

    public void ex9() {
        int a = 1_000_000;
        int b = 2_000_000;
        long c = a * b; // 오버플로우 발생: c에 저장되기 전 int인 a와 b의 결과값은 이미 int로 나왔기 때문에 발생
        long d = (long)a * b; // 둘 중 하나를 long으로만 바꿔줘도 더 큰 타입인 long으로 계산 되기 때문에 오버플로우 미발생
        System.out.println(c);
        System.out.println(d);
    }

    public void ex10() {
        long a = 1_000_000 * 1_000_000; //정수는 기본형이 int이기 때문에 결과값은 이미 int로 나옴
        long b = 1_000_000 * 1_000_000L; // 뒤에 L을 붙임으로 long타입으로 변환하여 결과값이 long으로 나옴
        System.out.println(a);
        System.out.println(b);
    }

    public void ex11() {
        double pi = 3.141592;
        double roundedPi = Math.round(pi); // 소수 첫째자리 기준으로 반올림
        double shortPi = Math.round(pi * 1000) / 1000.0; // 소수 넷째자리 기준으로 반올림
        System.out.println(roundedPi);
        System.out.println(shortPi);

    }

    public void ex13() {
        System.out.println(-10%8); // -2
        System.out.println(10%-8); // 2
        System.out.println(-10%-8); // -2
        // 왼쪽 항에 있는 -는 음수로, 오른쪽항에 있는 것은 결국 절대값으로 나눈 것. 그래서 1, 3번이 같은 결과를 가져옴
    }

    public void ex14() {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\" == \"abc\"? %b%n", "abc" == "abc");
        System.out.printf("str1 == \"abc\"? %b%n", str1 == "abc");
        System.out.printf("str2 == \"abc\"? %b%n", str2 == "abc");
        System.out.println(str1 == str2); // false: str1과 str2는 다른 객체이기때문에 (저장된 주소가 다름)
        System.out.println(str1.equals("abc"));
        System.out.println(str2.equals("abc"));
        System.out.println(str1.equals(str2)); //true: 안의 내용물이 같으면 true
        // 따라서 값 자체를 비교하기 위해서는 equals를 사용, 같은 객체임을 확인하려면 == 사용용    }
    }

    public void ex15() {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("문자 1개 입력.>");
        String input = scanner.nextLine();
        ch = input.charAt(0);//입력받은 문자열의 0번째 index

        if ('0' <= ch && ch <= '9') {
            System.out.printf("숫자!");
        } else if ('a' <= ch && ch <= 'z') {
            System.out.printf("영소문자!");
        } else {
            System.out.printf("몰러~");
        }
    }

    public void ex17() {
        // javascript에서도 유용하게 썼던 삼항연산자로 true, false가 조건식으로 나올시 간단하게 적용 가능
        int a = 6;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 하나 입력 바람");
        b = scanner.nextInt();
        scanner.close();

        if (a < b) {
            System.out.println("a는 b보다 작거나 같다");
        } else {
            System.out.println("a는 b보다 크다");
        }

        String str = (a < b) ? "a는 b보다 작거나 같다"
                : "a는 b보다 크다";
        System.out.println(str);

    }

}
