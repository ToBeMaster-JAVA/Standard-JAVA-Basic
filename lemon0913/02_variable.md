# 02.변수(Variable)

[관련 velog 주소](https://velog.io/@mandarin913/Java-2-%EB%B3%80%EC%88%98)

## 화면에 글자 출력하기 - print()과 println()

```java
class Ex2_1 {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        System.out.print("Hello");
        System.out.println("World");
    }
}
```

```java
class Ex2_2 {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        System.out.print("3+5=");
        System.out.print(3+5);
    }
}
```





## 덧셈 뺄셈 계산하기

```java
class Ex2_3 {
    public static void main(String[] args) {
        System.out.println(5+3);
        SYstem.out.println(5-3);
        System.out.println(5*3);
        System.out.println(5/3);
    }
}
```





## 변수의 선언과 저장

```java
class Ex2_4 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        
        x = 10;
        SYstem.out.println(x);
    }
}
```



```java
class Ex2_5 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
    }
}
```





## 변수의 타입

```java
class Ex2_6 {
    public static void main(String[] args) {
        int x = 100;
        double pi = 3.14;
        char ch = 'a';
        String str = "abc";
        
        System.out.println(x);
        System.out.println(pi);
        System.out.println(ch);
        System.out.println(str);
    }
}
```





## 문자열 결합

```java
class Ex2_7 {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 8.0;
        
        System.out.println(name);
        System.out.println(str);
        System.out.println(7+" ");
        System.out.println(" "+7);
        System.out.println(7+"");
        System.out.println(""+7);
        System.out.println(""+"");
        System.out.println(7+7+"");
        System.out.println(""+7+7);
    }
}
```





## 두 변수의 값 바꾸기

```java
class Ex2_8 {
    public static void main(String[] args) {
        int x = 10, y = 5;
        System.out.println("x="+x);
        System.out.println("y="+y);
        
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
```





## printf를 이용한 출력 예제

```java
class Ex2_9 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";
        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789f;
        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
        System.out.printf("d=%f%n", d);
        System.out.printf("d=%14.10f%n", d);
        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url);
        System.out.printf("[%.8s]%n", url);        
    }
}
```





## 화면으로부터 입력받기

```java
import java.util.Scanner; //Scanner을 사용하기 위해 추가
class Ex2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("두자리 정수를 하나 입력해주세요");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input); //입력받은 문자열을 숫자로 변환
        
        System.out.println("입력내용 : "+input);
        System.out.printf("num=%d%n", num);
    }
}
```





## 부호있는 정수의 오버플로우

```java
class Ex2_11 {
    public static void main(String[] args) {
        short sMin = -32768, sMax = 32767;
        char cMin = 0, cMax = 65535;
        
        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1 = " + (short)(sMin-1));
        System.out.println("sMax = " + sMax);
        System.out.println("sMax+1 = " + (short)(sMax+1));
        System.out.println("cMin = " + (int)cMin);
        System.out.println("cMin-1 = " + (int)--cMin);
        System.out.println("cMax = " + (int)cMax);
        System.out.println("cMax+1 = " + (int)++cMax);
    }
}
```





## 타입 간의 변환 방법

```java
class Ex2_12 {
    public static void main(String[] args) {
        String str = "3";
        
        System.out.println(str.charAt(0) - '0');
        System.out.println('3' - '0' + 1);
        System.out.println(Integer.parseInt("3") + 1);
        System.out.println("3" + 1);
        System.out.println((char)(3 + '0'));
    }
}
```

