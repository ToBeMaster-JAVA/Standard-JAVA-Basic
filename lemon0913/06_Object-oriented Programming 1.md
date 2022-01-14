# 06.객체지향 프로그래밍1(Object-oriented Programming 1)



[관련 velog 주소](https://velog.io/@mandarin913/Java6-%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D1)

## 객체의 생성과 사용
```java
class Ex6_1 {
    public static void main(String[] args) {
        Tv t;
        t = new TV();
        t.channel = 7;
        t.channelDonw();
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}

class TV {
    String color;
    boolean power;
    int channel;

    void power() {power != power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}

}
```

## 객체의 생성과 사용 예제
```java
class Ex6_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        TV t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다."); //0이 출력
        System.out.println("t2의 channel값은 " + t2.channel + "입니다."); //0이 출력

        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다."); // 7이 출력
        System.out.println("t2의 channel값은 " + t2.channel + "입니다."); //0이 출력
    }
}
```

## 클래스 변수와 인스턴스 변수 예제
```java
class Ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height =" + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다");
        c1.width = 50;
        c1.heigth = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
```

## 메서드의 실행 흐름 예제
```java
class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);

    }
}

class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
    }
    long subtract(long a, long b) {return a - b;}
    long multiply(long a, long b) {return a * b;}
    double divide{double a, double b} {return a / b;}
}
```

## 호출스택(call stack)
```java
class Ex6_5 {
    public static void main(String[] args) {
        Systen.out.println("Hello");
    }
}
```

## 기본형 매개변수
```java
class Data {int x;}

class Ex6_6 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
```

## 참조형 매개변수
```java
class Data2 {int x;}

class Ex6_7 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data2 d) {
        d.x = 1000;
        System.out.println("Change() : x = " + d.x);
    }
}
```

## 참조형 반환타입
```java
class Data3 {int x;}

class Ex6_8 {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);
        System.out.println("d.x ="+d.x);
        System.out.println("d2.x="+d2.x);
    }

    static Data3 copy(Data3 d) {
        Data3 tmp = new Data3();

        tmp.x = d.x;

        return tmp;
    }
}
```

## static 메서드와 인스턴스 메서드 예제
```java
class MyMath2 {
    long a, b;

    long add() { return a + b;}
    long subtract() {return a - b;}
    long multiply() {return a * b;}
    double divide() {return a / b;}

    static long add(long a, long b) {return a + b;}
    static long subtract(long a, long b) {return a - b;}
    static long multiply(long a, long b) {return a * b;}
    static double divide(long a, long b) {return a / (double)b;}
}
class Ex6_9 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));

        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
```

## 오버로딩(overloading) 예제
```java
class Ex6_10 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3,3) 결과:" + mm.add(3,3));
        System.out.println("mm.add(3L,3) 결과:" + mm.add(3L,3));
        System.out.println("mm.add(3,3L) 결과:" + mm.add(3,3L));
        System.out.println("mm.add(3L,3L) 결과:" + mm.add(3L,3L));

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) 결과: " + mm.add(a));
    }
}

class MyMath3 {
    int add(int a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a+b;
    }
    long add(int a, long b) {
        System.out.print("long add(int a, long b) - ");
        return a+b;
    }
    long add(long a, int b) {
        System.out.print("long add(long a, int b) - ");
        return a+b;
    }
    long add(long a, long b) {
        System.out.print("long add(long a, long b) - ");
        return a+b;
    }

    int add(int[] a) {
        System.out.print("int add(int[] a) = ");
        int result = 0;
        for (int i=0; i < a.length; i++)
            result += a[i];
        
        return result;
    }
}
```

## 기본 생성자(default constructor)
```java
class Data_1 {
    int value;
}

class Data_2 {
    int value;

    Data_2(int x) {
        value = x;
    }
}

class Ex6_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(); // 컴파일 에서 발생
    }
}
```

## 매개변수가 있는 생성자 예제
```java
class Car {
    String color;
    String gearType;
    int door;

    Car() {}

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

class Ex6_12 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4);

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
    }
}
```

## 생성자에서 다른 생성자 호출하기 - this()
```java
class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "auto", 4);
    }

    Car2(String color) {
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class Ex6_13 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
    }
}
```

## 멤버변수의 초기화 예제1
```java
class Ex6_14 {
    static {
        System.out.println("static { }");
    }

    {
        System.out.println("{ }");
    }

    public Ex6_14() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("Ex6_14 bt = new Ex6_14(); ");
        Ex6_14 bt = new Ex6_14;

        System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
        Ex6_14 bt2 = new Ex6_14;
    }
}
```

## 멤버변수의 초기화 예제2
```java
class Ex6_15 {
    static int[] arr = new int[10];

    static {
        for(int i =10; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10 + 1);
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < arr.length; i++) 
            System.out.println("arr["+i+"] :" + arr[i]);
    }
}
```