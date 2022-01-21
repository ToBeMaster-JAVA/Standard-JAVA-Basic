# 06.객체지향 프로그래밍2(Object-oriented Programming 2)



[관련 velog 주소](https://velog.io/@mandarin913/Java-7-%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D2)

## 상속 예제
```java
class Tv {
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class SmartTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

class Ex7_1 {
    public static void main(String args[]) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displayCaption("Hello, world"); // 출력 안됨
        stv.caption = true;
        stv.displayCaption("Hello, world");
    }
}
```

## 참조변수 super
```java
class Ex7_2 {
    public static void main(String args[]) {
        Child c = new Chile();
        c.method(); 
    }
}

class Parent {int x = 10;}

class Chile extends Parent {
    int x = 20;

    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x); // 20 출력
        Systen.out.println("super.x=" + super.x); // 10 출력
    }
}
```

```java
class Ex7_3 {
    public static void main(String args[]) {
        Child2 c = new Child2();
        c.method();
    }
}
class Parent2 {int x = 10;}

class Child2 extends Parent2 {
    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}
```

## super() - 조상의 생성자
```java
public class Ex7_4 {
    public static void main(String args[]) {
        Point3D p = new Point3D(1, 2, 3);
        System.out.println("x=" + p.x + ",y=" + p.y + ",z=" + p.z); 
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z;
    
    Point3D(int x, int y, int z) {
        super(x, y;
        this.z = z;)
    }
}
```

## 패키지의 선언
```java
package com.codechobo.book; // PackageTest 클래스가 속할 패키지를 선언

class PackageTest {
    public static void main(String args[]) {
        System.out.prinln("Hello World!");
    }
}
```

## static import문
```java
import static java.lang.System.out;
import static java.lang.Math.*;

class Ex7_6 {
    public static void main(String args[]) {
        out.println(random()); // System.out.println(Math.random());

        out.println("Math.PI :" + PI); // System.out.println("Math.PI :" + Math.PI);
    }
}
```

## 참조변수의 형변환 에제
```java
class Ex7_7 {
    public static void main(String args[]) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // car = (Car)fe; 에서 형변환이 생략됨
        //car.water(); 컴파일 에러 -> Car타입의 참조변수로는 water()을 호출 불가
        fe2 = (FireEngine)car; // 조상 -> 자손 타입으로 형변환은 생략 불가
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() { // 운전하는 기능
        System.out.println("drive, Brrrrr~");
    }

    void stop() { // 멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car { // 소방차
    void water() { // 물 뿌리는 기능
        System.out.println("water!!!");
    }
}
```

## 매개변수의 다형성 예제
```java
class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품 구매 시 제공하는 보너스 점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0); // 보너스 점수는 제품가격의 10%
    }
}

class Tv1 extends Product {
    Tv1() {
        // 조상 클래스의 생성자 Product(int price)를 호출
        super(100); // Tv의 가격을 100만원으로
    }

    // Object클래스의 toString()을 오버라이딩
    public String toString() {return "Tv1";}
}

class Computer extends Product {
    Computer() {super(200);}

    public String toString() {return "Computer";}
}

class Buyer { // 고객, 물건을 사는 사람
    int money = 1000; // 소유 금액
    int bonusPoint = 0; // 보너스 점수

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

class Ex7_8 {
    public static void main(String args[]) {
        Buyer b = new Buyer();

        b.buy(new Tv1());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
    }
}
```

## 여러 종류의 객체를 배열로 다루기 예제
```java
clas Product2 {
    int price; // 제품의 가격
    int bonusPoint; // 제품 구매 시 제공하는 보너스 점수

    Product2(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product2() {} // 기본 생성자
}

class Tv2 extends Product2 { // 조상 클래스의 생성자 Product2(int price)를 호출
    Tv2() {super(100);}

    public String toString() {return "Tv";}
}

class Computer2 extends Product2 {
    Computer2() {super(200);}
    public String toString() {return "Audio";}
}

class Buyer2 { // 고객, 물건을 사는 사람
    int money = 1000; // 소유 금액
    int bonusmoney = 0; // 보너스 점수
    Product2[] cart = new Product2[10]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; // Product배열에 사용될 카운터

    void buy(Product2 p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다
        bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가
        cart[i++] = p; // 제품을 Product[] cart에 저장
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() { // 구매한 물품에 대한 정보를 요약해서 보여줌
        int sum = 0; //  구입한 물건의 가격 합계
        String itemList = ""; // 구입한 물품 목록

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for(int i=0; i<cart.length; i++) {
            if(cart[i]==null) break;
            sum += cart[i].price;
            itemList += cart[i] + ", ";
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

class Ex7_9 {
    public static void main(String args[]) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.summary();
    }
}
```

## 추상클래스의 작성 예제
```java
class Ex7_10 {
    public static void main(String args[]) {
        Unit group = {new Marine(), new Tank(), new Dropship()};

        for (int i=0; i<group.length; i++)
            group[i].move(100, 200);
    }
}

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {/* 현재 위치에 정지 */}
}

class Marine extends Unit { // 보병
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + ",y=" + y + "]");
    }
    void stimPack() { /* 스팀팩을 사용한다 */}
}

class Tank extends Unit { // 탱크
    void move(int x, int y) {
        System.out.println("Tank[x=" + x + ",y=" + y + "]");
    }
    void changeMode() { /* 공격모드를 변환한다 */}
}

class Dropship extends Unit { // 수송선
    void move(int x, int y) {
        System.out.println("Dropship[x=" + x + ",y=" + y + "]");
    }
    void load() { /* 선택된 대상을 태운다 */}
    void unload() { /* 선택된 대상을 내린다 */}
}
```

## 디폴트 메서드와 static 메서드 예제
```java
class Ex711 {
    public static void main(Stirng[] args) {
        Child2 c = new Child3();
        c.method1(); // 구현한 클래스에서 오버라이딩한 것
        c.method2(); // 조상 클래스의 메서드
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in Child3"); // 오버라이딩
    }
}

class Parent3 {
    public void method2() {
        System.out.println("method2(0 in Parent3");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }

    default void method2() {
        System.out.println("mothod2() in MyInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}
```

## 내부 클래스의 제어자와 접근성 예제1
```java
class Ex7_12 {
    class InstanceInner { // 인스턴스 클래스
        int iv = 100;
        // static int cv = 100; 에러 -> 인스턴스 클래스라서 static 변수 선언 불가
        final static int CONST = 100; // final static(상수)은 선언 가능
    }

    static class StaticInner { // 스태틱 클래스
        int iv = 200;
        static int cv = 200; // stati 클래스는 static 멤버 정의 가능
    }

    void myMethod() {
        class LocalInner { // 지역 클래스
            int iv = 300;
            // static int cv = 300; 에러 -> 지역 클래스라서 static 변수 선언 불가
            fianl static int CONST = 300l // final static은 상수이므로 허용
        }
    }

    public static void main(String args[]) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
```

## 내부 클래스의 제어자와 접근성 예제2
```java
class Ex7_13 {
    class InstanceInner {} // 인스턴스 클래스
    static class StaticInner {} // 스태틱 클래스

    // 인스턴스 멤버 간에는 서로 직접 접근이 가능하다
    InstacneInner iv = new InstacneInner();
    // 스태틱 멤버 간에는 서로 직접 접근이 가능하다
    static StaticInner cv = new StaticInner();

    staic void staticMethod() { // 스태틱 메서드
        // 스태틱 멤버는 인스턴스 멤버에 직접 접근이 불가능하다
        // InstacneInner obj1 = new InstacneInner();
        // 스태틱 멤버 간에는 서로 직접 접근이 가능하다
        StaticInner obj2 = new StaticInner();

        // 스태틱 멤버가 인스턴스 멤버에 굳이 접근하려면 아래와 같이 객체 생성 과정이 필요
        // 인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성 가능
        Ex7_13 outer = new Ex7_13();
        InstacneInner obj1 = outer.new InstacneInner();
    }

    void instacneMethod() { // 인스턴스 메서드
        // 인스턴스메서드에서는 인스턴스멤버와 스태틱멤버에 모두 접근 가능하다
        InstacneInner obj1 = new InstacneInner();
        StaticInner obj2 = new StaticInner();
        // 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
        // LocalInner lv = new LocalInner();
    }

    void myMethod() {
        class LocalInner {} // 지역 클래스
        LocalInner lv = new LocalInner();
    }  
}
```

## 내부 클래스의 제어자와 접근성 예제3
```java
class Outer {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstacneInner { // 인스턴스 클래스
        int iiv = outerIv; // 외부클래스의 private 멤버에도 접근 가능
        int iiv2 = outerCv;
    }

    static class StaticInner { // 스태틱 클래스
        // 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근 불가능
        // int siv = outerIv;
        // 스태틱 클래스는 외부 클래스의 스태틱 멤버에는 접근 가능
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;
        fianl int LV = 0; // JDK1.8부터 fianl 생략 가능

        class LocalInner { // 지역 클래스
            int liv = outerIv;
            int liv2 = outerCv;
            // 외부 클래스의 지역 변수는 final이 붙은 변수(=상수)에만 접근 가능
            // int liv3 = lv; -> 에러인데 JDK1.8부터는 에러 아님
            int liv4 = Lv;
        }
    }
}
```

## 내부 클래스의 제어자와 접근성 예제4
```java
// 외부 클래스가 아닌 다른 클래스에서 내부 클래스를 생성하고 내부 클래스 멤버에 접근하는 예제
class Outer2 {
    class InstanceInner { // 인스턴스 클래스
        int iv = 100;
    }

    static class StaticInner { // 스태틱 클래스
        int iv = 200;
        static int cv = 300;
    }

    void myMethod() {
        clss LocalInner { // 지역 클래스
            int iv = 400;
        }
    }
}

class Ex7_15 {
    public static void main(String[] args) {
        // 인스턴스 클래스의 인스턴스를 생성하려면
        // 외부 클래스의 인스턴스를 먼저 생성해야 한다
        Outer2 oc = new Outer2();
        Outer2.InstanceInner ii = oc.new InstanceInner();

        System.out.println("ii.iv : "+ ii.iv);
        System.out.println("Outer2.StaticInner.cv : "+Outer2.StaticInner.cv);

        // 스태틱 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
        Outer2.StaticInner si = new Outer2.StaticInner();
        System.out.println("si.iv : "+ si.iv);
    }
}
```

## 내부 클래스의 제어자와 접근성 예제5
```java
// 내부 클래스와 외부 클래스에 선언된 변수의 이름이 같을 때 변수 앞에 'this'나 '외부 클래스명.this'를 붙여서 서로 구별할 수 있다
class Outer3 {
    int value = 10; // Outer.this.value

    class Inner {
        int value = 20; // this.value

        void method1() {
            int value = 30;
            System.out.println("value : " + value); // 30출력
            System.out.println("this.value :" + this.value); // 20출력
            System.out.println("Outer3.this.value :" + Outer3.this.value); // 10출력
        }
    } // Inner 클래스의 끝
} // Outer3 클래스의 끝

class Ex7_16 {
    public static void main(String args[]) {
        Outer3 outer = new Outer3();
        Outer3.Inner inner = outer.new Inner();
        inner.method1();
    }
}
```

## 익명 클래스(anonymous class)
```java
class Ex7_17 {
    Object iv = new Object() {void method(){}}; // 익명클래스
    static Object cv = new Object() {void method(){}} // 익명 클래스

    void myMethod() {
        Object lv = new Object() {  void method(){} }; // 익명 클래스
    }
}
```

## 익명 클래스(anonymous class) 예제
```java
import java.awt.*;
import java.awt.event.*;

class Ex7_18 {
    public static void main(String[] args) {
        Button b = new Button("Start"); 
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred!!!");
    }
}
```

```java
import java.awt.*;
import java.awt.event.*;

class Ex7_19 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionLister() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("ActionEvent occured!!!");
                }
            } // 익명 클래스의 끝
        );
    } // main의 끝  
}
```