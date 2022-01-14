package week3;

import com.sun.org.apache.xml.internal.security.algorithms.implementations.SignatureECDSA;

// 메인(소스파일의 이름은 public class와 이름이 같아야함)
public class ObjectOrientedProgramming {
    // example 15
    static int[] arr = new int[10];

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public static void main(String[] args) {
        ObjectOrientedProgramming example = new ObjectOrientedProgramming();
        example.ex15();
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

        t1.channel = 7;
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

        System.out.printf("c1: " + c1.kind + c1.number + "%n크기: (" + c1.width + ", " + c1.height + ")%n%n");
        System.out.printf("c2: " + c2.kind + c2.number + "%n크기: (" + c2.width + ", " + c2.height + ")%n%n");
        // 클래스 변수가 변경되는 경우,
        System.out.println("c1의 크기 변경: 50, 80");
        c1.width = 50;
        c1.height = 80;

        System.out.printf("c1: " + c1.kind + c1.number + "%n크기: (" + c1.width + ", " + c1.height + ")%n%n");
        System.out.printf("c2: " + c2.kind + c2.number + "%n크기: (" + c2.width + ", " + c2.height + ")%n%n");
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

    void ex8() {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data3 copy(Data3 d) {
        Data3 tmp = new Data3();
        tmp.x = d.x;
        return tmp;
    }

    void ex9() {
        // 매개변수로만 사용 가능한 경우(인스턴스 x)
        System.out.println(MyMath2.add(200l,100l));
        System.out.println(MyMath2.subtract(200l,100l));
        System.out.println(MyMath2.multiply(200l,100l));
        System.out.println(MyMath2.divide(200.0, 100.0));

        //인스턴스 생성 후에만 호출이 가능
        MyMath2 mm = new MyMath2();
        mm.a = 200l;
        mm.b = 100l;

        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }

    void ex10() {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3, 3): " + mm.add(3,3));
        System.out.println("mm.add(3l, 3): " + mm.add(3l,3));
        System.out.println("mm.add(3, 3l): " + mm.add(3,3l));
        System.out.println("mm.add(3l, 3l): " + mm.add(3l,3l));

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a): " + mm.add(a));
    }

    void ex11() {
        Ex11_Data_1 d1 = new Ex11_Data_1();
        // int x의 값을 매개변수로 넣어 줘야 한다
        Ex11_Data_2 d2 = new Ex11_Data_2(10);
    }

    void ex12() {
        Ex12_Car c1 = new Ex12_Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Ex12_Car c2 = new Ex12_Car("white", "auto", 4);

        System.out.printf("c1.color: " + c1.color + "%nc1.gearType: " + c1.gearType + "%nc1.door: " + c1.door + "%n");
        System.out.println();
        System.out.printf("c2.color: " + c2.color + "%nc2.gearType: " + c2.gearType + "%nc2.door: " + c2.door + "%n");
    }

    void ex13() {
        Ex13_Car2 c1 = new Ex13_Car2();
        Ex13_Car2 c2 = new Ex13_Car2("blue");

        System.out.printf(c1.color + "%n" + c1.gearType + "%n" + c1.door + "%n%n");
        System.out.printf(c2.color + "%n" + c2.gearType + "%n" + c2.door + "%n%n");
    }

    void ex14() {
        System.out.println("Ex14 bt = new Ex14(); ");
        Ex14 bt = new Ex14();

        System.out.println("Ex14 bt2 = new Ex14(); ");
        Ex14 bt2 = new Ex14();
    }

    void ex15() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
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


class Data3 {
    int x;
}


class MyMath2 {
    long a, b; // instance 생성 후 생긴 인스턴스 변수 (매개 변수 필요 없음)

    long add() {
        long result = a + b;
        return result;
    }
    long subtract() {
        return a - b;
    }
    long multiply() {
        return a * b;
    }
    double divide() {
        return a / b;
    }

    // 아래부터는 매개변수만으로도 호출 가능
    static long add(long a, long b) {
        long result = a + b;
        return result;
    }
    static long subtract(long a, long b) {
        return a - b;
    }
    static long multiply(long a, long b) {
        return a * b;
    }
    static double divide(double a, double b) {
        return a / b;
    }

}


class MyMath3 {
    int add(int a, int b) {
        System.out.print("int add(int a, int b) -> ");
        return a + b;
    }

    long add(int a, long b) {
        System.out.print("long add(int a, long b) -> ");
        return a + b;
    }

    long add(long a, int b) {
        System.out.print("long add(long a, int b) -> ");
        return a + b;
    }

    long add(long a, long b) {
        System.out.print("long add(long a, long b) -> ");
        return a + b;
    }

    int add(int[] a) {
        System.out.print("int add(int[] a) -> ");
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}


class Ex11_Data_1 {
    int value;
}


class Ex11_Data_2 {
    int value;

    Ex11_Data_2(int x) {
        value = x;
    }
}


class Ex12_Car {
    String color;
    String gearType;
    int door;

    Ex12_Car() {}

    Ex12_Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}


class Ex13_Car2 {
    String color;
    String gearType;
    int door;

    Ex13_Car2() {
        this("white", "auto", 4);
    }

    Ex13_Car2(String color) {
        this(color, "auto", 4);
    }

    Ex13_Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}


class Ex14 {
    static {
        System.out.println("static { }");
    }

    {
        System.out.println("{ }");
    }

    public Ex14() {
        System.out.println("생성자");
    }
}
