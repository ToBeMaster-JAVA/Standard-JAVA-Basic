# 7주차 : 『 Chapter 8. 예외처리』 ~ 『Chapter 9. java.lang패키지와 유용한 클래스』
## 《 Chap.1 : 프로그램 오류 ~ Chap.7 : `printStackTrace()`와 `getMessage()` 》

**Q1.예외처리의 정의와 목적에 대해 서술하시오.**

> 예외처리는 프로그램 실행 중 발생할 수 있는 에러들에 대해 대처하기 위해 진행하는것?
> 오류가 발생하여 비정상 종료되는 것을 막기 위함??

<br>

**Q2.다음 중 `RuntimeException`클래스 계열을 고르시오.**
```
-ArrayIndexOutOfBoundsException (배열 범위 벗어남)
-FileNotFoundException (존재하지 않는 파일 이름 입력)
-ClassNotFoundException (잘못된 클래스이름 입력)
-IOException (잘못된 입출력)
-NullPointerException (값이 null인 참조변수 멤버 호출)
-ClassCastException (클래스간 형변환 오류)
-OutOfMemoryError (메모리부족)
-ArithmeticException(정수를 0으로 나눔)
```

> -ArrayIndexOutOfBoundsException (배열 범위 벗어남)
> -NullPointerException (값이 null인 참조변수 멤버 호출)
> -ClassCastException (클래스간 형변환 오류)
> -OutOfMemoryError (메모리부족)
> -ArithmeticException(정수를 0으로 나눔)

<br>

**Q3.다음 코드를 실행시키게된다면 어떻게 출력될지 적어보시오.**
```java
class Test {
    public static void main(String[] args) {
        System.out.println("동규의 나이는");
        try {
            System.out.println("2022년 기준") ;
            System.out.println(0/0);
            System.out.println(23+"살") ;
        }catch ( Exception e ) {
            System.out.println(24+"살") ;
        }
        System.out.println("입니다.") ;
    }
}
```

> 동규의 나이는
> 2022년 기준
> 24살

<br>

---

## 《 Chap.8 : 멀티 catch 블럭 ~ Chap.14 : finally 블럭 》
**Q1. 다음 중 옳지 않은 것을 고르시오. (1개)**
```
(1) 멀티 catch 블럭 : 내용이 같은 catch블럭을 하나로 합친 것(JDK1.7부터)으로 공통된 부분만 참조변수 사용 가능하고 부모자식 관계는 불가능하다.
(2) checked 예외 : 컴파일러가 예외 처리 여부를 체크 (예외처리필수) - Exception
(3) uncheked 예외 : 컴파일러가 예외 처리 여부를 체크하지 않음 (예외처리선택) - RuntimeException
(4) finally 블럭 : 예외 발생 여부와 연관지어 수행되어야 하는 코드를 넣음
```

> (4)

<br>

**Q2.예외를 처리하는 방법은 (ㄱ) 직접처리, (ㄴ) 예외 떠넘기기(알리기), (ㄷ) 은폐 덮기(무시)로 3가지가 있다.
 이 중에서 try-catch문에 해당하는 방법과, 예외 선언하기에 해당하는 방법을 순서대로 적은 것은?**

```
(1) ㄱ-ㄴ
(2) ㄴ-ㄷ
(3) ㄷ-ㄱ
(4) ㄴ-ㄱ
```

> (1)

<br>

---

## 《 Chap.15 : 사용자 정의 예외 만들기 ~ (9장) Chap.5 Object클래스의 메서드 - `toString()`》
**Q1.다음의 O/X 문제를 푸시오.**

```
1) 사용자 정의 예외 클래스로 메세지를 저장하려면 String을 매개변수로 받는 생성자를 추가해야 한다. (O/X)
2) 예외가 여럿인 경우, try-catch문을 통한 예외처리하는 방법과 선언부에 지정해 호출한 메서드에서 예외처리, 2가지 방법을 사용할 수 있다. 예외가 발생한 경우, 예외는 둘 중 어느 방법이든 한 쪽에서만 처리 가능하다. (O/X)
3) 예외 되던지기 방법을 사용할 때, 메서드의 선언부에 발생할 예외를 'throw'로 지정해줘야 한다. (O/X)
4) 한 예외가 다른 예외를 발생시킬 수 있는 것을 '연결된 예외'라고 한다. (O/X)
5) Throwable 클래스의 getCause()는 지정한 예외를 원인 예외로 등록하는 것이고, initCause()는 원인 예외를 반환하는 것이다. (O/X)
```

> X
> X
> X
> O
> X

<br>

**Q2.Object 클래스에 관해 맞는 것을 2가지 고르시오.**

```
1) object 클래스는 모든 클래스의 최고 조상이다.
2) equals()는 매개변수로 객체의 값을 받아서 비교해 boolean으로 결과값을 알려준다.
3) equals()를 오버로딩하여 주소가 아닌 객체에 저장된 내용을 비교하도록 변경할 수 있다.
4) hashCode()는 객체의 주소값을 이용해 해시코드를 만들기 때문에 서로 다른 객체는 같은 해시코드를 가질 수 없다.
5) object 클래스에 정의된 toString()에 의하면, 인스턴스가 갖고 있는 문자열을 반환한다.
```

> (1), (3)

<br>

---

## 《 Chap.6 : `toString()`의 오버라이딩 ~ Chap.12 : `join()`과 `StringJoiner` 》
**Q1.** String 클래스 내에는 많은 생성자와 메서드들이 있다. 그 중 문자열 중의 문자열(부분 or 전체)를 바꿀 수  있는 메서드가 존재하는데 replace()와 replaceAll()이다. 두 메서드 다 문자열의 부분이나 전체 문자열을 바꿀 수 있는 메서드이다.

```java
public static void main(String[] args) {
    String s = "Hello Python World!";
    String s2 = "Hello JavaScript World!";
    s.replace("Python", "Java");
    s2.replaceAll("JavaScript", "Java");
    
    System.out.println(s);
    //Hello Java World!
    System.out.println(s2)
    //Hello Java World!
}
```

그렇다면 둘의 차이점은 무엇일까?

> replace()는 최초로 발견한 문자열(부분/전체) 1회에 대해서만 replace를 수행하고, replaceAll()은 전체 문자열 내에서 검색해 모든 일치하는 case에 대해 replace를 수행한다..

<br>

**Q2.** 아래 코드의 출력값은? 해당 출력이 나오는 이유도 설명하시오(두 방법 모두 설명).

```java
public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "abc";
    String s3 = new String("abc");
    String s4 = new String("abc");

    System.out.println(s1 == s2);
    // 출력값 1: ?
    System.out.println(s3 == s4);
    // 출력값 2: ?
}
```

> 비교연산자 ==의 경우, String클래스를 대상으로 비교를 수행하면 그 참조변수가 가진 주소값을 이용해 비교연산을 수행한다.
> 출력값 1: true (상수 "abc"는 단 1회만 저장되므로 s1과 s2에 동일한 주소값 저장)
> 출력값 2 : false (new로 선언해 새로 생성하였으므로 서로 주소값이 다르다)

<br>

**Q3.** StringJoiner 클래스 사용의 장점



---

## 《 Chap.13 : 문자열과 기본형 간의 변환 ~ Chap.20 : StringBuffer의 생성자와 메서드 예제 》
**Q1.** 정수형 데이터를 문자열로 변경하기 위해 다음 ()안을 채워라

```java
int i = 100;
String str1 = i + ();
```

> ""

<br>

**Q2.** 다음 코드의 출력 결과를 적어라
```java
StringBuffer sb = new StringBuffer("abc");
StringBuffer sb2 = new StringBuffer("abc");

System.out.println(sb == sb2);
System.out.println(sb.equals(sb2));

String s = sb.toString();
String s2 = sb2.toString();
System.out.println(s.equals(s2));
```

> false
> true
> true

---

## 《 Chap.21 : StringBuilder ~ Chap.26 : 래퍼(wrapper) 클래스 예제 》
**Q1. StringBuffer와 StringBuilder의 공통점과 차이점을 각각 서술하시오.**

<br>

**Q2. 다음 내용에 대하여 옳거나 틀린 문장을 구분하고, 틀린 것은 고쳐 바르게 서술하시오.**

> 1. 래퍼 클래스는 기본형을 클래스로 정의한 것이다.
> 2. 기본형 값은 객체로 다뤄지는 것이 기본이다.
> 3. 래퍼클래스에는 toString()과 equals()가 기본적으로 오버라이딩 되어 있다.
> 4. 래퍼클래스는 내부적으로 기본형 변수를 가지고 있어, 비교 연산자를 사용할 수 있다.


---

## 《 Chap.27 : Number클래스 ~ Chap.31 : 오토박싱 & 언박싱 예제 》
**Q1. <  ㄱ   > 클래스는 추상클래스로 내부적으로 숫자를 멤버변수로 갖는 래퍼 클래스들의 조상이며, 자손으로 <  ㄴ   >과 <  ㄷ   >등이 있는데 
<  ㄴ   >은 long으로도 다룰 수 없는 큰범위의 정수를, <  ㄷ   >은 double로도 다룰 수 없는 큰 범위의 부동 소수점수를 처리하기 위한 것이다. <    >에 들어갈 정답을 각각 쓰시오.**

> ㄱ: Number
> ㄴ: Integer
> ㄷ: Double

<br>

**Q2. 다음 항목에 대해 O, X를 표시하시오.**
```
1. 문자열을 숫자열로 변환하는 방법에는 '타입.parse타입(String s)' 도 포함된다. 
2. 문자열을 숫자열로 변환하는 방법에는 타입.valueOf( )도 포함된다. 
3. 만약 1번이 O라면 반환값의 타입은 참조형이다.
4. 만약 2번이 O라면 반환값의 타입은 참조형이다.
5. 오토박싱이란 래퍼 클래스의 객체를 기본형 값으로 자동 변환해주는 것을 말한다.
```

> O
> X
> O?
> X?
> X

