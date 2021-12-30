package week1;

public class Operators {
    public static void main(String[] args) {
        /*
        사칙연산, 나머지연산 :                           + - * / %(나머지),
        bit 연산자(bitwise operator):                  <<(<) >>(>) (shift), & (and), | (or), ~(not)
        대입 연산자:                                    =
         */
        Operators examples = new Operators();
        examples.ex6();
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

    }
}
