# 7주차 : 『 Chapter 8. 예외처리』 ~ 『Chapter 9. java.lang패키지와 유용한 클래스』
## 《 Chap.1 : 프로그램 오류 ~ Chap.7 : `printStackTrace()`와 `getMessage()` 》

**Q1.예외처리의 정의와 목적에 대해 서술하시오.**
- 정의 : 프로그램 실행시 발생할 수 있는 예외 발생에 대비한 코드를 작성하는 것
- 목적 : 비정상적인 프로그램 종료를 막고, 정상적인 상태를 유지하는 것
<br>

**Q2.다음 중 `RuntimeException`클래스 계열을 고르시오.**
```
- ArrayIndexOutOfBoundsException (배열 범위 벗어남)
-NullPointerException (값이 null인 참조변수 멤버 호출)
-ClassCastException(클래스간 형변환 오류)
-ArithmeticException(정수를 0으로 나눔)
```

<br>

**Q3.다음 코드를 실행시키게된다면 어떻게 출력될지 적어보시오.**
```
동규의 나이는
2022년 기준
24살
입니다.
```
---

## 《 Chap.8 : 멀티 catch 블럭 ~ Chap.14 : finally 블럭 》
**Q1. 다음 중 옳지 않은 것을 고르시오. (1개)**
```
정답 : (4) : 관련없이 수행되어야 하는 코드를 넣어야 함

(1) 멀티 catch 블럭 : 내용이 같은 catch블럭을 하나로 합친 것(JDK1.7부터)으로 공통된 부분만 참조변수 사용 가능하고 부모자식 관계는 불가능하다.
(2) checked 예외 : 컴파일러가 예외 처리 여부를 체크 (예외처리필수) - Exception
(3) uncheked 예외 : 컴파일러가 예외 처리 여부를 체크하지 않음 (예외처리선택) - RuntimeException
(4) finally 블럭 : 예외 발생 여부와 연관지어 수행되어야 하는 코드를 넣음
```

<br>

**Q2.예외를 처리하는 방법은 (ㄱ) 직접처리, (ㄴ) 예외 떠넘기기(알리기), (ㄷ) 은폐 덮기(무시)로 3가지가 있다.
 이 중에서 try-catch문에 해당하는 방법과, 예외 선언하기에 해당하는 방법을 순서대로 적은 것은?**

```
정답 : (1)

(1) ㄱ-ㄴ
(2) ㄴ-ㄷ
(3) ㄷ-ㄱ
(4) ㄴ-ㄱ
```


---

##《 Chap.15 : 사용자 정의 예외 만들기 ~ (9장) Chap.5 Object클래스의 메서드 - `toString()`》
**Q1. 다음의 O/X 문제를 푸시오.**

```
1) O
2) X 양쪽에서 처리 가능하다.
3) X 메서드 선언부에는 'throws'이다.
4) O
5) X getCause()는 원인 예외를 반환하는 것, initCause()는 지정한 예외를 원인 예외로 등록하는 것이다.
```

**Q2.Object 클래스에 대해 옳은 것을 2가지 고르시오.**

```
1), 4)
2) equals()는 매개변수로 '객체의 참조변수'를 받아서 비교해 boolean으로 결과값을 알려준다.
3) equals()를 '오버라이딩'하여 주소가 아닌 객체에 저장된 내용을 비교하도록 변경할 수 있다.
5) toString()은 클래스 이름과 16진수의 해시코드를 반환한다. 하지만 오버라이딩되어 있어 문자열 반환이 가능하다.
```
<hr>

## 《 Chap.15 : 사용자 정의 예외 만들기 ~ (9장) Chap.5 Object클래스의 메서드 - `toString()`》
**Q1.다음의 O/X 문제를 푸시오.**

```
1) 사용자 정의 예외 클래스로 메세지를 저장하려면 String을 매개변수로 받는 생성자를 추가해야 한다. (O/X)
2) 예외가 여럿인 경우, try-catch문을 통한 예외처리하는 방법과 선언부에 지정해 호출한 메서드에서 예외처리, 2가지 방법을 사용할 수 있다. 예외가 발생한 경우, 예외는 둘 중 어느 방법이든 한 쪽에서만 처리 가능하다. (O/X)
3) 예외 되던지기 방법을 사용할 때, 메서드의 선언부에 발생할 예외를 'throw'로 지정해줘야 한다. (O/X)
4) 한 예외가 다른 예외를 발생시킬 수 있는 것을 '연결된 예외'라고 한다. (O/X)
5) Throwable 클래스의 getCause()는 지정한 예외를 원인 예외로 등록하는 것이고, initCause()는 원인 예외를 반환하는 것이다. (O/X)
```
<br>

**Q2.Object 클래스에 관해 맞는 것을 2가지 고르시오.**
```
1) object 클래스는 모든 클래스의 최고 조상이다.
2) equals()는 매개변수로 객체의 값을 받아서 비교해 boolean으로 결과값을 알려준다.
3) equals()를 오버로딩하여 주소가 아닌 객체에 저장된 내용을 비교하도록 변경할 수 있다.
4) hashCode()는 객체의 주소값을 이용해 해시코드를 만들기 때문에 서로 다른 객체는 같은 해시코드를 가질 수 없다.
5) object 클래스에 정의된 toString()에 의하면, 인스턴스가 갖고 있는 문자열을 반환한다.
```

---

## 《 Chap.6 : `toString()`의 오버라이딩 ~ Chap.12 : `join()`과 `StringJoiner` 》
**Q1.** String 클래스 내에는 많은 생성자와 메서드들이 있다. 그 중 문자열 중의 문자열(부분 or 전체)를 바꿀 수  있는 메서드가 존재하는데 replace와 replaceAll이다. 두 메서드 다 문자열의 부분이나 전체 문자열을 바꿀 수 있는 메서드이다.
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
replaceAll의 경우에는 regex(정규 표현식)이 사용이 가능하다. 아래의 코드를 보면 이해하기 쉽다.
```java
public static void main(String[] args) {
    String s = "abcababccddeefabc";
    String s2 = "abcababccddeefabc";
    s.replace("abc", "0");
    s2.replaceAll("[abc]", "0");
    //[abc]는 "a" or "b" or "c"의 의미를 가진다. 
		
    System.out.println(s)
    // 0ab0cddef0
    System.out.println(s2)
    // 000000000ddeef000
}
```
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
출력값: true, false
s1, s2의 경우 문자열 리터럴을 생성하는 방식이고
s3, s4의 경우는 String 클래스의 생성자를 사용하여 만드는 방식이다.

문자열 리터럴 방식을 사용하면 문자열 선언할 때 해당 문자열 객체가 String Constant Pool에 존재한다면 안에 있는 객체를 참조하고 String Constant Pool에 존재하지 않다면 새로 할당해준다. 따라서 둘은 같은 객체를 참조하게 되어 == 연산자를 사용했을 때 true가 나오는 것.

생성자를 통해 문자열을 만들 경우, 만들 때마다 새로운 인스턴스를 만드는 것이기 때문에 값은 같아도 주소가 달라지게 된다. 따라서 s3, s4는 서로 다른 인스턴스를 참조하기 때문에 ==연산자를 사용했을 때 false가 나온다.
<br>

**Q3.** StringJoiner 클래스 사용의 장점

StringBuilder나 StringBuffer 사용시 중간 중간 구분자를 넣어주어야하는 반면 StringJoiner의 경우 자동으로 붙여줄 수 있다. Prefix와 Suffix도 추가 가능한 장점이 있다.

---

## 《 Chap.13 : 문자열과 기본형 간의 변환 ~ Chap.20 : StringBuffer의 생성자와 메서드 예제 》
**Q1.**
정수형 데이터를 문자열로 변경하기 위해 다음 ()안을 채워라
```
int i = 100;
String str1 = i + ();
```
```
정답 : ""
자바에서 정수형 데이터를 문자열로 변경하는 방법에는 1)정수형에 빈 문자열""을 더하는 방법과 2)valueOf()를 사용하는 방법이 있다. 위의 경우 정수형에 빈 문자열을 더하는 예제이다.
```
<br>

**Q2.**
다음 코드의 출력 결과를 적어라
```
StringBuffer sb = new StringBuffer("abc");
StringBuffer sb2 = new StringBuffer("abc");

System.out.println(sb == sb2);
System.out.println(sb.equals(sb2));

String s = sb.toString();
String s2 = sb2.toString();
System.out.println(s.equals(s2));
```
```
false

false

true

sb와 sb2에는 각각 다른 인스턴스의 주소가 저장되어 등가비교연산자로 비교한 결과는 __false__이다. 
StringBuffer 클래스는 equals 메서드를 오버라이딩하지 않아서 equals메서드를 사용해도 __등가비교연산자로 비교한 것과 같은 결과__를 얻는다. 
반면에 toString()은 equals가 오버라이딩되어 있어 StringBuffer인스턴스에 toString()을 호출하여 담고있는 문자열을 String으로 변환한 뒤, 
equals 메서드를 사용한 결과는 __true__가 된다.
```
---

## 《 Chap.21 : StringBuilder ~ Chap.26 : 래퍼(wrapper) 클래스 예제 》
**Q1. StringBuffer와 StringBuilder의 공통점과 차이점을 각각 서술하시오.**

> StringBuffer는 멀티 쓰레드 환경에서 사용할 수 있도록 만든 것이고, StringBuilder는 StringBuffer에서 쓰레드 동기화 기능을 제거하고 만든 것이다. 따라서 StringBuffer가 thread-safe하고, StringBuilder는 그렇지 않은 점을 제외하면 모든 점이 동일하다.

<br>

**Q2. 다음 내용에 대하여 옳거나 틀린 문장을 구분하고, 틀린 것은 고쳐 바르게 서술하시오.**

> 1. 래퍼 클래스는 기본형을 클래스로 정의한 것이다. (O)
> 2. 기본형 값은 객체로 다뤄지는 것이 기본이다. (X)
> 	- 기본형 값이 객체로 다뤄질 때를 위해 래퍼 클래스가 정의되었다.
> 3. 래퍼클래스에는 toString()과 equals()가 기본적으로 오버라이딩 되어 있다. (O)
> 4. 래퍼클래스는 내부적으로 기본형 변수를 가지고 있어, 비교 연산자를 사용할 수 있다. (X)
> 	- 내부적으로 기본형 변수를 가지고 있지만, 비교 연산자를 사용할 수 없다.


---

## 《 Chap.27 : Number클래스 ~ Chap.31 : 오토박싱 & 언박싱 예제 》
**Q1. <  ㄱ   > 클래스는 추상클래스로 내부적으로 숫자를 멤버변수로 갖는 래퍼 클래스들의 조상이며, 자손으로 <  ㄴ   >과 <  ㄷ   >등이 있는데 
<  ㄴ   >은 long으로도 다룰 수 없는 큰범위의 정수를, <  ㄷ   >은 double로도 다룰 수 없는 큰 범위의 부동 소수점수를 처리하기 위한 것이다. <    >에 들어갈 정답을 각각 쓰시오.**

ㄱ : Number / ㄴ : BigInteger / ㄷ : BigDecimal

<br>

**Q2. 다음 항목에 대해 O, X를 표시하시오.**
```
1. 문자열을 숫자열로 변환하는 방법에는 '타입.parse타입(String s)' 도 포함된다. O
2. 문자열을 숫자열로 변환하는 방법에는 타입.valueOf( )도 포함된다. O
3. 만약 1번이 O라면 반환값의 타입은 참조형이다. X , '타입.parse타입(String s)' 의 반환값은 기본형
4. 만약 2번이 O라면 반환값의 타입은 참조형이다.O
5. 오토박싱이란 래퍼 클래스의 객체를 기본형 값으로 자동 변환해주는 것을 말한다. X , 언박싱에 대한 설명이며, 오토박싱은 이와 반대임(기본형 값을 래퍼 클래스의 객체로 자동변환)
```


---

