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