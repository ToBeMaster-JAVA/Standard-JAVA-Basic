package week3;

import java.sql.SQLOutput;

// 메인(소스파일의 이름은 public class와 이름이 같아야함)
public class Objects {
    public static void main(String[] args) {
        Objects example = new Objects();
        example.ex6();
        example.ex7();
    }

    void ex1() {
        // Tv 클래스에서 생성된 객체를 참조하기 위해 참조변수 t 선언
        // 클래스 타입으로 선언되었을 때 객체라고 부르고, 객체가 메모리에 할당되어 실제 사용될 때 인스턴스라고 한다

        // Ex1
        Tv t;
        // 객체 생성 (객체 주소를 참조변수에 저장) -> 인스턴스의 주소를 t에 저장
        t = new Tv();

        t.channel = 7;
        t.channelDown();
        System.out.printf("현재 채널 : %d", t.channel);
        System.out.println();
    }

    void ex2() {
        // Ex2 객체 생성했을 때 인스턴스 값은 0(int의 경우)

        // 인스턴스는 참조변수(ex, t1)를 통해서만 다룰 수 있으며，
        // 참조변수의 타입은 인스턴스의 타입과 일치해야 한다．
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.printf("t1의 채널: %d%n", t1.channel);
        System.out.printf("t2의 채널: %d%n", t2.channel);

        t1. channel = 7;
        System.out.printf("t1의 채널 변경: %d%n", t1.channel);

        System.out.printf("t1의 채널: %d%n", t1.channel);
        System.out.printf("t2의 채널: %d%n", t2.channel);
    }

    void ex3() {
        System.out.printf("Card.width = %d%n", Card.width);
        System.out.printf("Card.height = %d%n", Card.height);
        // 인스턴스 변수를 변경하는 경우,
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.printf("c1: "+ c1.kind + c1.number + "%n크기: ("+c1.width + ", " + c1.height + ")%n%n");
        System.out.printf("c2: "+ c2.kind + c2.number + "%n크기: ("+c2.width + ", " + c2.height + ")%n%n");
        // 클래스 변수가 변경되는 경우,
        System.out.println("c1의 크기 변경: 50, 80");
        c1.width = 50;
        c1.height = 80;

        System.out.printf("c1: "+ c1.kind + c1.number + "%n크기: ("+c1.width + ", " + c1.height + ")%n%n");
        System.out.printf("c2: "+ c2.kind + c2.number + "%n크기: ("+c2.width + ", " + c2.height + ")%n%n");
    }

    void ex4() {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5l, 3l);
        long result3 = mm.multiply(5l, 3l);
        double result4 = mm.divide(5l, 3l);

        System.out.printf("result1: %d%n", result1);
        System.out.printf("result2: %d%n", result2);
        System.out.printf("result3: %d%n", result3);
        System.out.println("result4: " + result4);
        // 소수점 6자리까지 표현하는 식, 변환지시자는 6자리까지, double은 16자리까지
        //System.out.printf("result4: %f%n", result4);
    }

    void ex5() {
        System.out.println("Hello");
    }

    void ex6() {
        Data d = new Data();
        d.x = 10;
        System.out.println("main(): x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main(): x = " + d.x);
    }
    // ex6: 기본형 매개변수 -> 여기서 변경된 x는 메서드 종료되면서 사라진다. temp 느낌?
    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }

    void ex7() {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main(): x = " + d.x);

        change2(d);
        System.out.println("After change(d.x)");
        System.out.println("main(): x = " + d.x);
    }

    static void change2(Data2 d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}

// Tv 클래스 생성
class Tv {
    String color; // initialize: null
    boolean power; // initialize: false
    int channel; // initialize: 0

    // method
    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}

// ex3
class Card {
    String kind;
    int number;

    static int width = 100;
    static int height = 250;
}

// ex4
class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
    }
    long subtract(long a, long b) {
        return a - b;
    }
    long multiply(long a, long b) {
        return a * b;
    }
    double divide(double a, double b) {
        return a / b;
    }
}

class Data {
    int x;
}

class Data2 {
    int x;
}
