# 03.연산자(Operator)



[관련 velog 주소](https://velog.io/@mandarin913/Java-3-%EC%97%B0%EC%82%B0%EC%9E%90)



## 연산자의 결합규칙

```java
class Ex3_1 {
    public staic void main(String[] args) {
        int x, y;

        x = y = 3;
        System.out.println("x=", + x);
        System.out.println("y=", + y);
    }
}
```


## 증감 연산자 ++과 --
```java
class Ex3_2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++;
        System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);

        i = 5;
        j = 0;

        j = ++i;
        System.out.println("j=++i; 실행 후, i=", + i + ", j=" + j);
    }
}
```

```java
class Ex3_3 {
    public static void main(String[] args) {
        int i = 5, j = 5;
        System.out.println(i++);
        System.out.println(++i);
        System.out.println("i = " + i + ", j = " +j);
    }
}
```


## 부호 연산자
```java
class Ex3_4 {
    public static void main(String[] args) {
        int i = -10;
        i = +i; //부호연산자 +는 하는 일이 없다
        System.out.println(i);

        i = -10;
        i = -i;
        System.out.println(i);
    }
}
```


## 형변환 연산자
```java
class Ex3_5 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int) d;
        System.out.println("score=" + score);
        System.out.println("d=" + d);
    }
}
```


## 사칙 연산자
```java
class Ex3_6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n", a, b, a+b);
        System.out.printf("%d - %d = %d%n", a, b, a-b);
        System.out.printf("%d * %d = %d%n", a, b, a*b);
        System.out.printf("%d / %d = %d%n", a, b, a/b);
        System.out.printf("%d / %f = %f%n", a, (float)b, a/(float)b);
    }
}
```


## 산술 변환
```java
class Ex3_7 {
    public static void main(String[] args) {
        System.out.println(5/2);
        System.out.println(5/(float)2);
    }
}
```

```java
class Ex3_8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte)(a*b); //형변환 과정에서의 데이터 손실로 300이 아니라 44가 출력
        System.out.println(c);
    }
}
```

```java
class Ex3_9 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000; 

        long c = a * b; //2000000000000이 아닌 -1454759936이 저장됨.(int끼리의 연산이라서 a*b의 값이 int형으로 저장)
        
        System.out.println(c);
    }
}
```

```java
class Ex3_10 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
```


## Math.round()로 반올림하기

```java
class Ex3_11 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi*1000)/1000.0;
        System.out.println(shortPi);
    }
}
```


## 나머지 연산자
```java
class Ex3_12 {
    public static void main(String[] args) {
        int x = 10;
        int y = 8;

        System.out.printf("%d을 %d로 나누면, %n", x, y);
        System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x/y, x%y);
    }
}
```

```java
class Ex3_13 {
    public static void main(String[] args) {
        System.out.println(-10%8);
        System.out.println(10%-8); //음수로 나누기를 하려는 건 무시 됨
        System.out.println(-10%-8);
    }
}
```


## 문자열의 비교
```java
class Ex3_14{
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
        System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
        System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
    }
}
```


## 논리 연산자 && ||
```java
import java.util.Scanner;

class Ex3_15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';
        
        System.out.printf("문자를 하나 입력하세요.>");

        String input = scanner.nextLine();
        ch = input.charAt(0);

        if('0' <= ch && ch <= '9') {
            System.out.printf("입력하신 문자는 숫자입니다.%n");
        }

        if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.printf("입력하신 문자는 영문자입니다.%n");
        }
    }
}
```


## 논리 부정 연산자 !
```java
class Ex3_16 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';

        System.out.printf("b=%b%n", b);
        System.out.printf("!b=%b%n", !b);
        System.out.printf("!!b=%b%n", !!b);
        System.out.printf("!!!b=%b%n", !!!b);
        System.out.printf();

        System.out.printf("ch=%c%n", ch);
        System.out.printf("ch < 'a' || ch > 'z' =%b%n", ch < 'a' || ch > 'z');
        System.out.printf("!('a'<=ch && ch<='z')=%b%n", !('a'<=ch && ch<='z') );
        System.out.printf("    'a'<=ch && ch<='z' =%b%n", 'a'<=ch && ch<='z');
    }
}
```


## 조건 연산자
```java
class Ex3_17{
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;

        absX = x >= 0 ? x : -x;
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;
        signX = x > 0? '+' : ( x==0 ? ' ' : '-');
        signY = y > 0? '+' : ( y==0 ? ' ' : '-');
        signZ = z > 0? '+' : ( z==0 ? ' ' : '-');

        System.out.printf("x=%c%d%n", signX, absX);
        System.out.printf("y=%c%d%n", signY, absY);
        System.out.printf("z=%c%d%n", signZ, absZ);        
    }
}
```