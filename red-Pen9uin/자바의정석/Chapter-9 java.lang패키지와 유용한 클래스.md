# 「Chapter 9. java.lang패키지와 유용한 클래스」

![velog 표지용](Chapter-9 java.lang패키지와 유용한 클래스/velog 표지용.png)

<br>

> **목차**
> [1. Object 클래스](#1-object-클래스)
> [2. String 클래스](#2-string-클래스)
> [3. StringBuffer 클래스](#3-stringbuffer-클래스)
> [4. Math & wrapper 클래스](#4-math--wrapper-클래스)

<br>

> **작성에 참고한 링크**
> - [오늘부터 JAVA - 자바의 정석 (Chapter 9. java.lang 패키지와 유용한 클래스)](https://kevinntech.tistory.com/13)
> - [아마코딩 - [Java] 자바의 정석 (기초편) Chapter 9. java.lang패키지와 유용한 클래스](https://amacoding.tistory.com/14)

<br>

---

<br>

# 1. Object 클래스

- `java.lang` 패키지는 자바 프로그래밍에 가장 기본이 되는 클래스들을 포함하고 있으며, `import` 문 없이 바로 사용이 가능하다.

## 1.1 `Object` 클래스

- **<u>모든 클래스의 최고 조상.</u>** 멤버변수 없이 **오직 11개의 메서드만을 가지고 있다.**
- Object 클래스의 멤버들은 모든 클래스에서 바로 사용 가능하다.
- `notity()`, `wait()`등은 쓰레드와 관련된 메서드이다. 13장에서 자세히 설명.
- `equals()`, `hashCode()`, `toString()`은 적절히 오버라이딩해야 한다.

![image-20220204112815327](Chapter-9 java.lang패키지와 유용한 클래스/image-20220204112815327.png)

<br>

## 1.2 `Object` 클래스의 메서드 - `equals()`

- `equals(Object obj)`
- 객체 자신과 주어진 객체(obj)를 비교하고, 그 결과를 `boolean`으로 반환. 같으면 `true`, 다르면 `false`.
- Object 클래스에 정의된 `equals()`는 참조변수 값(객체의 주소)을 비교한다.
  - 따라서 서로 다른 두 변수를 `equals()`로 비교하면 항상 false를 반환

```java
public boolean equals(Object obj) {
    return (this==obj);
}
```



<br>

## 1.3 `equals()`의 오버라이딩

- `equals()`를 오버라이딩해서 인스턴스변수의 값을 비교하도록 바꾼다.

![image-20220204113623155](Chapter-9 java.lang패키지와 유용한 클래스/image-20220204113623155.png)

<br>

## 1.4 `Object` 클래스의 메서드 - `hashCode()`

- 객체 자신의 해시코드(`int` 타입의 정수)를 반환하는 메서드(해시함수)
- 다량의 데이터를 저장&검색하는 해싱기법에 사용된다.

```java
public class Object {
    //...
    public native int hashcode();
}
```

- `Object` 클래스의 `hashCode()`는 객체의 내부주소를 반환한다.
- 같은 클래스의 인스턴스변수 값으로 객체의 같고 다름을 반단해야 하는 경우, **두 객체가 같은 객체라면 해시코드가 같아야 한다.**
- 따라서, `equals()`를 오버라이딩하면 `hashCode()`도 같이 오버라이딩 해야 한다.

![image-20220204120559880](Chapter-9 java.lang패키지와 유용한 클래스/image-20220204120559880.png)

- `System.identityHashCode(Object obj)`는 `Object` 클래스의 `hashCode()`와 동일한 결과를 반환한다.

![image-20220204120715794](Chapter-9 java.lang패키지와 유용한 클래스/image-20220204120715794.png)

<br>

## 1.5 `Object` 클래스의 메서드 - `toString()`

- 객체(인스턴스)의 정보를 문자열(`String`)로 제공할 목적으로 정의된 메서드
- 대부분의 경우 **인스턴스 변수에 저장된 값들을 문자열로 표현**
- 클래스를 작성할 때, `toString()`을 오버라이딩하지 않고 호출하면 `클래스이름@16진수해시코드` 형태의 값을 반환한다.

```java
public String toString() { //Object 클래스의 toString()
    return getClass().getName() + "@"
        + Integer.toHexString(hashCode());
}
```

<br>

## 1.6 `toString()`의 오버라이딩

- 일반적으로 인스턴스나 클래스에 대한 정보, 또는 인스턴스 변수들의 값을 문자열로 변환하여 반환하도록 오버라이딩

![image-20220204121124840](Chapter-9 java.lang패키지와 유용한 클래스/image-20220204121124840.png)



<br>

## 1.+ `clone()`

- 객체 자신의 복사본(clone)을 반환, 새로운 객체를 생성하는 메소드
- `Cloneable`인터페이스를 구현한 클래스의 인스턴스만 복제할 수 있다.
- `Object` 클래스에 정의된 `clone()`은 인스턴수변수의 값만을 복제한다.
- <u>인스턴스 변수가 참조형일 때,  참조하는 객체도 복사되도록 오버라이딩 해야 함</u>
- `clone()` 사용 방법
  1. 복사할 클래스에 `Cloneable` 인터페이스를 구현한다.
  2. `clone()`을 오버라이딩 하면서 접근 제어자를 `protected`에서 `public`으로 변경
  3. `try-catch` 내에서 조상 클래스의 `clone()`을 호출
     - `Cloneable` 인터페이스를 구현하지 않은 클래스 내에서 호출되면 예외를 발생시키기 때문

<br>

## 1.+ 공변 반환 타입(covariant return type)

- '공변 반환 타입'은 **<u>오버라이딩 할 때 조상 메서드의 반환 타입을 자손 클래스 타입으로 변경할 수 있는 것</u>**
- 조상의 타입이 아닌, 실제로 반환되는 자손 객체의 타입으로 변환할 수 있어서 번거로운 형 변환이 줄어든다는 장점이 있다...

```java
public Point clone() { // (1) 반환 타입을 Object에서 Point로 변경
    Object obj = null;
    try {
        obj = super.clone();
    } catch(CloneNotSupportedException e) {}
    return (Point) obj; // (2) Point 타입으로 형변환
}
```



<br>

## 1.+ 얕은 복사와 깊은 복사

- 얕은 복사(shallow copy)
  - 객체에 저장된 값을 그대로 복제
  - 객체가 참조하고 있는 객체까지 복사하지는 않는다
    - `Object` 클래스의 `clone()`이 얕은 복사에 해당
- 깉은 복사(deep copy)
  - 원본이 참조하고 있는 객체까지 복제

![image-20220204122215605](Chapter-9 java.lang패키지와 유용한 클래스/image-20220204122215605.png)

<br>

## 1.+ getClass()

- 자신이 속한 클래스의 `Class`객체를 반환하는 메서드
- `Class`객체는 클래스의 모든 정보를 담고 있으며, 클래스당 단 1개만 존재
- 클래스파일(`*.class`)이 클래스 로더(Class Loader)에 의해 메모리에 로드될 때, 자동으로 생성된다
- **Class 객체를 얻는 여러가지 방법**

```java
// 생성된 객체로부터 얻는 방법
Card c = new Card();
Class cObj = c.getClass();

// 클래스 리터럴(*.class)로부터 얻는 방법
Class cObj = Card.class;
String className = cObj.getName();

// 클래스 이름으로부터 얻는 방법
class cObj = Class.forName("Card");
```

- forName()은 특정 클래스 파일, 예를 들어 데이터베이스 드라이버를 메모리에 올릴 때 주로 사용한다.
- Class 객체를 통해 객체를 생성하고 메서드를 호출하는 등 보다 동적인 코드를 생성할 수 있다.
  - 자세히 알고 싶다면 리플렉션 API (reflection API)로 검색.

```java
//new 연산자를 이용한 객체 생성
Card c = new Card();

// Class 객체를 이용한 객체 생성
Card C = Card.class.newInstance();
```



<br>

---

<br>

# 2. String 클래스

## 2.1 `String` 클래스

- **<u>변경 불가능한(immutable) 클래스</u>**
  - `String` 인스턴스의 내용은 바꿀 수 없다.
- 문자형 배열(`char[]`)과 그에 관련된 메서드들을 정의
  - 문자열을 위한 클래스
  - 문자형 배열 참조변수 `char[] value`를 인스턴수 변수로 정의
  - 인스턴스 생성 시 생성자의 매개변수로 입력받은 문자열은 이 인스턴스 변수(`value`)에 문자형 배열(`char[]`)로 저장
- 한 번 생성된 `String` 인스턴스가 가지고 있는 문자열은 읽어 올 수만 있고, 변경할 수 없다.
  - 예를 들어, + 연산자를 이용해 문자열을 결합하는 경우, 인스턴스 내의 문자열이 바뀌는 것이 아니라 <u>새로운 문자열이 담긴 `String` 인스턴스가 생성되는 것.</u>
  - `StringBuffer` 클래스를 이용하면 해당 인스턴스에 저장된 문자열 변경 가능

<br>

## 2.2 문자열(`String`)의 비교

- 문자열을 만드는 두 가지 방법
1. 문자열 리터럴을 지정하는 방법
   - 이미 존재하는 것을 재사용
2. `String`클래스의 생성자를 사용해서 만드는 방법
   - new 연산자로 메모리 할당이 이루어지므로 새로운 String 인스턴스가 생성

![image-20220204161115038](Chapter-9 java.lang패키지와 유용한 클래스/image-20220204161115038.png)

- `equals()`를 사용했을 때는 두 문자열의 내용을 비교하기 때문에 두 경우 모두 `true`를 반환
- 인스턴스 주소를 등가 비교 연산자`==`로 비교했을 때는 결과가 다르다!

<br>

## 2.3 문자열 리터럴(`String`리터럴)

- 자바 소스 파일에 포함된 모든 문자열 리터럴은 컴파일 시에 클래스 파일에 저장된다.
  - 문자열 리터럴도 String 인스턴스이고, 한 번 생성하면 내용을 변경할 수 없음
  - 하나의 인스턴스를 공유하기 위해 같은 내용의 문자열 리터럴은 한번만 저장된다.

<br>

## 2.4 빈 문자열(`empty string`)

- **내용이 없는 문자열.** 크기가 0인 char형 배열을 저장하는 문자열
- 크기가 0인 배열을 생성하는 것은 어느 타입이나 가능

```java
char[] cArr = new char[0];
int[] iArr = {};
```

- String과 char형의 초기화
  - `char c = '';`는 불가능(반드시 하나의 문자를 지정)
  - String은 참조형의 기본값인 `null` 보다 빈 문자열로 초기화할 것
  - char형은 기본값인 `\u0000`보다 공백으로 초기화할 것

```java
String s = null;
char c = '\u0000';

// 혹은...
String s = ""; // 빈 문자열로 초기화
char c = ' '; // 공백으로 초기화
```



<br>

## 2.5 `String` 클래스의 생성자와 메서드

![img](Chapter-9 java.lang패키지와 유용한 클래스/img-16439591264664.png)

![img](Chapter-9 java.lang패키지와 유용한 클래스/img-16439591068102.png)

![img](Chapter-9 java.lang패키지와 유용한 클래스/img-16439591413245-16439591413256.png)

<br>

## 2.6 `join()`과 `StringJoiner`

- `join()`: 여러 문자열 사이에 구분자를 넣어 결합하는 데 사용
- `StringJoiner`: 문자열을 결합하는데 사용

```java
String animals = "dog, cat, bear";
String[] arr = animals.split(",");

// join()
System.out.println(String.join(" - ", arr));

// Stringjoiner
Stringjoiner sj = new Stringjoiner("/", "[", "]");

for(String s : arr)
    sj.add(s);

System.out.println(sj.toString());
```

![img](Chapter-9 java.lang패키지와 유용한 클래스/img-164396325241615.png)

<br>

## 2.7 문자열과 기본형 간의 변환

- 기본형을 문자열로 변경하는 방법
  - 숫자에 빈 문자열`""`을 더해준다
  - `valueOf()`를 사용 (조금 더 빠름)

```java
int i = 100;
String str1 = i + "";
String str2 = String.valueOf(i);
```

- 문자열을 기본형으로 변경하는 방법
  - `parseInt()`를 사용
  - `valueOf()`를 사용 (JDK 1.5 이후)

```java
int i1 = Integer.parseInt("100");
int i2 = Integer.valueOf("100");
char c = "A".charAt(0);
```

![image-20220204162919851](Chapter-9 java.lang패키지와 유용한 클래스/image-20220204162919851.png)

<br>

## 2.+ 유니코드의 보충문자

- 유니코드는 원래 2byte(16bit) 문자 체계인데, 이걸로도 모자라서 20bit로 확장함
- 그래서 하나의 문자를 char타입으로 다루지 못하고 int 타입으로 다루게 된다
  - 보충 문자(supplementary characters): 확장에 의해 새로 추가된 문자들
  - String 클래스의 메서드 중에서 매개변수가 `int ch`인 것들은 보충 문자를 지원하는 것, `char ch`인 것들은 지원하지 않는 것들임

<br>

## 2.+ 문자 인코딩 변환

- `getBytes(String charsetName)`을 사용하면 문자열의 문자 인코딩을 다른 인코딩으로 변경할 수 있다.
- 자바가 `UTF-16`을 사용하지만, 문자열 리터럴에 포함되는 문자들은 OS의 인코딩을 사용한다.
- 서로 다른 문자 인코딩을 사용하는 컴퓨터 간에는 데이터를 주고받을 때 적절한 문자 인코딩이 필요함

```java
// 문자열을 UTF-8로 변환
byte[] utf8_str = "가".getBytes("UTF-8");
// byte 배열을 문자열로 변환
String str = new String(utf8_str, "UTF-8");
```

<br>

## 2.+ `String.format()`

- `format()`은 형식화된 문자열을 만들어낸다.
  - 포맷스트링 사용

<br>

---

<br>

# 3. StringBuffer 클래스

## 3.1 `StringBuffer` 클래스

- **<u>변경가능한(mutable) 클래스</u>**
- String처럼 문자형 배열(`char[]`)을 내부적으로 가지고 있다.
  - String과 달리 **<u>내용을 변경할 수 있음</u>**

<br>

## 3.2 `StringBuffer`의 생성자

- 인스턴스를 생성할 때, 문자열을 저장하고 편집하기 위한 공간(buffer)으로 사용되는 char형 배열이 생성
- 생성자 `StringBuffer(int length)`를 사용
- StringBuffer 인스턴스에 저장될 문자열의 길이를 고려해 충분히 여유있는 크기를 지정해주는 것이 바람직
  - 크기를 지정하지 않으면 16개의 문자를 지정할 수 있는 크기의 버퍼 생성
  - 버퍼가 작으면 작업 중에 더 큰 배열의 생성이 필요하게 되므로 성능을 저하시킴

![image-20220204164603005](Chapter-9 java.lang패키지와 유용한 클래스/image-20220204164603005.png)

<br>

## 3.3 `StringBuffer`의 변경

- `append()`: 매개변수로 입력된 값을 문자열로 변환하여 StringBuffer 인스턴스가 저장하고 있는 문자열 뒤에 덧붙인다.

```java
StringBuffer sb = new StringBuffer("abc");
sb.append("123");
// sb -> "abc123"
```



<br>

## 3.4 `StringBuffer`의 비교

- String 클래스와 달리 `equals()`를 오버라이딩하지 않았음
  - 등가비교 연산자`==`로 비교한 것과 같은 결과를 반환
- 비교하기 위해서는 StringBuffer 클래스에 오버라이딩 되어있는 `toString()`을 호출해 String인스턴스를 얻은 다음, `equals()`를 사용해야 함

<br>

## 3.5 `StringBuffer`의 생성자와 메서드

![img](Chapter-9 java.lang패키지와 유용한 클래스/img-16439610170287.png)

![img](Chapter-9 java.lang패키지와 유용한 클래스/img-16439610230479-164396102304710.png)

<br>

## 3.6 `StringBuilder`

- StringBuffer는 멀티 쓰레드에 안전(thread safe)하도록 동기화 되어있다.
  - 멀티 쓰레드로 작성된 프로그램이 아닐 경우, StringBuffer의 동기화는 불필요하게 성능만 떨어지게 함
- **`StringBuilder`는 StringBuffer에서 쓰레드의 동기화만 제거한 클래스**
  - 그 외에는 완전히 똑같은 기능
- StringBuffer도 충분히 성능이 좋기 때문에 **<u>성능 향상이 반드시 필요한 경우에만</u>** StringBuilder를 사용한다.

<br>

---

<br>

# 4. Math & wrapper 클래스

## 4.1 `Math` 클래스

- 기본적인 수학계산에 유용한 메서드로 구성
- 인스턴스 변수가 하나도 없음, 2개의 상수만을 정의

```java
public static final double E = 2.7180818284590452354; // 자연로그의 밑
public static final double PI = 3.1415926535897932846; //원주율
```

- **<u>`Math` 클래스의 메서드는 모두 static</u>**

<br>

## 4.+ 올림, 버림, 반올림

- `round()`: 항상 소수점 첫째자리에서 반올림을 해서 정수값(`long`)을 결과로 반환

<br>

## 4.+ 예외를 발생시키는 메서드

- **<u>Exact가 포함된 메서드들이 JDK1 1.8부터 추가됨</u>**
- 오버플로우 발생 시 예외(`ArithmeticException`) 발생

```java
int addExact(int x, int y); // x + y
int subtractExact(int x, int y); // x - y
int multiplyExact(int x, int y); // x * y
int incrementExact(int a); // a++
int decrementExact(int a); // a--
int negateExact(int a); // -a
int toIntExact(long value); // (int)value - int로의 형변환
```

<br>

## 4.+ StrictMath 클래스

- Math 클래스는 최대한의 성능을 얻기 위해 JVM이 설치된 OS의 메서드를 호출해서 사용
- 즉, **OS에 의존적인 계산을 진행**
- **<u>`StrictMath` 클래스는 어떤 OS에서 실행되어도 항상 같은 결과를 얻도록 Math 클래스를 새로 작성한 것</u>**

<br>

## 4.2 `Math`의 메서드

![img](Chapter-9 java.lang패키지와 유용한 클래스/img-164396125168011-164396125168212.png)

<br>

## 4.3 래퍼(`wrapper`) 클래스

- 기본형을 클래스로 정의한 것
- 기본형 값도 객체로 다뤄져야 할 때가 있다.

![img](Chapter-9 java.lang패키지와 유용한 클래스/img-164396172589513.png)

- 내부적으로 기본형(`primitive type`) 변수를 가지고 있다.

```java
public final class Integer extends Number implements Comparabl {
    //...
    private int value;
}
```



- 값을 비교하도록 `equals()`가 오버라이딩 되어 있다.
  - 주소가 아닌 객체가 가지고 있는 값을 비교
- 비교 연산자를 사용할 수 없다. 대신 `compareTo()`를 제공
  - `compareTo()`: 같으면 0, 왼쪽 값이 크면 양수, 왼쪽 값이 작으면 음수. 정렬에 사용됨.
- `toString()`도 오버라이딩 되어 있어서 객체가 가지고 있는 값을 문자열로 변환하여 반환
- `MAX_VALUE, MIN_VALUE, SIZE, BYTES, TYPE` 등의 static 상수를 공통적으로 가짐

<br>

## 4.4 `Number` 클래스

- 숫자를 멤버변수로 갖는 래퍼 클래스들의 조상(추상클래스)

![image-20220204170610104](Chapter-9 java.lang패키지와 유용한 클래스/image-20220204170610104.png)

- Number 클래스의 자손으로 래퍼 클래스, BigInteger, BigDecimal 등이 있다.
  - `BigInteger`: long으로도 다룰 수 없는 큰 범위의 정수 처리
  - `BigDecimal `: double로도 다룰 수 없는 큰 범위의 부동 소수점 수 처리
- 객체가 가지고 있는 값을 숫자와 관련된 기본형으로 변환하여 반환하는 메서드를 정의

![image-20220204170755984](Chapter-9 java.lang패키지와 유용한 클래스/image-20220204170755984.png)

<br>

## 4.5 문자열을 숫자로 변환하기

```java
int i1 = new Integer("100").intValue(); //floatValue(), longValue(), ...
int i2 = Integer.parseInt("100"); // 주로 이 방법을 많이 사용
Integer i3 = Integer.valueOf("100");
```

- 아래 표는 래퍼 클래스의 `type.parseType(String s)` 형식의 메서드와 `type.valueOf()`를 정리한 것이다.
  - 전자는 반환 값이 기본형이고 후자는 반환 값이 래퍼 클래스 타입이다.
  - JDK 1.5부터 도입된 오토박싱 기능 때문에 차이가 없어졌다. 단, 성능은 valueOf()가 조금 더 느리다.

| 문자열→기본형                                                | 문자열→래퍼 클래스                                           |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| byte b = Byte.parseByte("100");<br />short s = Short.parseShort("100");<br />int i = Integer.parseInt("100");<br />long l = Long.parseLong("100");<br />float f = Float.parseFloat("3.14");<br />double d = Double.parseDouble("3.14"); | Byte b = Byte.valueOf("100");<br />Short s = Short.valueOf("100");<br />Integer i = Integer.valueOf("100");<br />Long l = Long.valueOf("100");<br />Float f = Float.valueOf("3.14");<br />Double d = Double.valueOf("3.14"); |

- 문자열이 10진수가 아닌 다른 진법(radix)의 숫자일 때도 변환이 가능하도록 다음과 같은 메서드가 제공된다.

```java
static int parseInt(String s, int radix);
static Integer valueOf(String s, int radix);
```



<br>

## 4.6 오토박싱(autoboxing) & 언박싱(unboxing)

- **JDK 1.5 이전**에는 기본형과 참조형 간의 연산이 불가능했기 땜누에, 래퍼 클래스로 기본형을 객체로 만들어서 연산해야 했다.
- **그러나 이제는 기본형과 참조형 간의 연산이 가능하다**(오토박싱&언박싱 때문)
- 오토박싱(`autoboxing`): 기본형 값을 래퍼클래스의 객체로 자동 변환해주는 것
- 언박싱(`unboxing`): 래퍼 클래스 객체를 기본 자료형의 값으로 자동 변환하는 것
