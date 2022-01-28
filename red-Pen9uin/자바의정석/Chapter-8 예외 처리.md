# 「Chapter 8. 예외 처리」

![슬라이드1](Chapter-8 예외 처리/슬라이드1.PNG)

<br>

> **목차**
> [1. 예외처리(Exeption handling)](#1-예외처리exeption-handling)

<br>

# 1. 예외처리(Exeption handling)

## 01. 프로그램 오류

- **프로그램 실행 중 오작동이나 비정상적인 종료를 초래하는 원인**
- 발생시점에 따라 3종류로 나뉨 - **컴파일 에러**와 **런타임 에러**

1. 컴파일 에러(`compile-time error`)
   - 컴파일할 때 발생하는 에러
2. 런타임 에러(`runtime error`)
   - 실행할 때 발생하는 에러
2. 논리적 에러
   - 컴파일도, 실행도 잘 되지만 의도한 것과 다르게 작동하는 에러

---

- **Java의 런타임 에러: 에러(`error`)와 예외(`exception`)**
  - 모두 실행 시(runtime) 발생하는 오류이다.
  - 에러(`error`)는 어쩔 수 없지만, 예외(`exception`)는 처리해야 한다.

> 1. 에러(`error`)
>    - 프로그램 코드에 의해 **<u>수습될 수 없는</u>** 심각한 오류
> 2. 예외(`exception`)
>    - 프로그램 코드에 의해 **<u>수습될 수 있는</u>** 다소 미약한 오류

<br>

## 02. 예외 클래스의 계층구조

- 예외 클래스는 크게 두 그룹으로 나뉜다.
  - `RuntimeException`클래스와 그 자손들
  - `Exception`클래스와 그 자손들


![image-20220128132313128](Chapter-8 예외 처리/image-20220128132313128.png)

![image-20220128132318192](Chapter-8 예외 처리/image-20220128132318192.png)

<br>

## 03. `Exception`과 `RuntimeException`

- `RuntimeException`클래스와 그 자손들: **<u>프로그램의 실수</u>**로 발생하는 예외
  - 컴파일러가 예외 처리 여부를 확인하지 않는 **'unchecked 예외'**
  - 예외처리 선택(▶컴파일 에러 발생X)
- `Exception`클래스와 그 자손들: 사용자의 실수와 같은 **<u>외적인 요인</u>**에 의해 발생하는 예외 (`RuntimeException`제외)
  - 컴파일러가 예외 처리 여부를 확인하는 **'checked 예외'**
  - 예외처리 필수

<br>

## 04. 예외 처리하기 – `try - catch`문

- **예외처리(`Exeption handling`) 이란?**
  - 정의: 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
  - 목적: 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
  - 참고: 에러와 예외는 모두 실행 시(runtime) 발생하는 오류
- 예외를 처리하려면 `try - catch`문을 사용해야 한다.
  - `if`문과 달리 `try`블럭이나 `catch`블럭 내에 포함된 문장이 하나라고 해서 괄호`{}`를 생략할 수 없다.

```java
try {
    // 예외가 발생할 가능성이 있는 문장들을 넣는다.
} catch (Exeption1 e1) {
    // Exeption1이 발생했을 경우, 이를 처리하기 위한 문장을 적는다.
} catch (Exeption2 e2) {
    // Exeption2이 발생했을 경우, 이를 처리하기 위한 문장을 적는다.
...
} catch (ExeptionN eN) {
    // ExeptionN이 발생했을 경우, 이를 처리하기 위한 문장을 적는다.

} // End of try-catch
```



<br>

## 05. `try - catch`문에서의 흐름

- `try`블럭 내에서 예외가 발생한 경우
  1. 발생한 예외와 일치하는 `catch`블럭이 있는지 확인한다.
  2. 일치하는 `catch`블럭을 찾게 되면, 그 `catch`블럭 내의 문장들을 수행하고 전체 `try-catch`문을 빠져나가서 그 다음 문장을 계속해서 수행한다.
  3. 만일 일치하는 `catch`블럭을 찾지 못하면 예외는 처리되지 못한다.
- `try`블럭 내에서 예외가 발생하지 않은 경우
  1. `catch`블럭을 거치지 않고 전체 `try-catch`문을 빠져나가서 수행을 계속한다.

<br>

## 06. 예외의 발생과 `catch`블럭

- **`catch`블럭**은 **괄호`()`**와 **블럭`{}`** 두 부분으로 이루어져 있음
  - 괄호`()`내에는 **처리하고자 하는 예외와 같은 타입의 참조변수**를 선언해야 함
- 예외가 발생하면 발생한 예외에 해당하는 클래스의 인스턴스가 생성됨
- 괄호`()`내에 선언된 **참조변수의 종류**와 **생성된 예외클래스의 인스턴스**에 **`instanceof`연산자를 이용해서 검사**하게 되며,
- 이는 **검사결과가 true인 `catch`블럭을 만날 때까지 계속 수행**한다.
  - **모든 예외 클래스는 `Exception`클래스의 자손**
    - `Exception`은 예외의 최고 조상
    - 어떤 종류의 예외가 발생하더라도 `Exception`클래스 타입의 참조변수를 선언한 `catch`블럭이 처리할 수 있다.
    - `Exception`을 처리하는 `catch`블럭은 반드시 마지막이어야 한다.
- 발생한 예외 객체는 `catch`블럭의 참조변수로 접근할 수 있다.


<br>

## 07. `printStackTrace()`와 `getMessage()`

- `catch`블럭의 괄호`()`에 선언된 참조변수를 통해 예외 클래스의 인스턴스에 접근할 수 있다.
  - 이 참조변수는 선언된 `catch`블럭 내에서만 사용 가능하다.
  - 인스턴스에는 예외에 대한 정보가 저장되므로, 이것을 얻기 위해 다양한 메소드를 사용할 수 있다.
- 자주 사용되는 메소드
  - ① `printStackTrace()`
    - 예외발생 당시의 호출스택(`Call Strck`)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력합니다.
  - ② `getMessage()`
    - 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있습니다.

<br>

## 08. 멀티 `catch`블럭

- **<u>JDK 1.7 이상</u>**
- 여러 `catch`블력을 `|` 기호를 이용해 <u>하나의 `catch`블럭으로 합칠 수 있다.</u>
- 이를 `멀티 catch블럭`이라고 한다.

![img](Chapter-8 예외 처리/img.png)

- 연결할 수 있는 예외 클래스의 개수의 제한 없음
- 이를 통해 중복된 코드를 줄일 수 있다.
  - 연결한 예외 클래스가 서로 상속 관계에 있다면, 조상 클래스만 써주는 것과 동일하기에 **컴파일 에러 발생**
  - 멀티 `catch`블럭의 참조변수로는 공통 멤버만 사용할 수 있다.

<br>

## 09. 예외 발생시키기

- `throw`를 이용해 고의로 예외를 발생시킬 수 있다.

1. 먼저, 연산자 `new`를 이용해서 발생하려는 예외 클래스의 객체를 생성한다.
   - `Exception e = new Exceptino("고의로 발생시켰음")`
2. 키워드 `throw`를 이용해서 예외를 발생시킨다.
   - `throw e;`

```java
class ExceptionEx {
    public static void main(String args[]){
        try {
            Exception e = new Exception("고의로 발생시켰음");
            throw e; //예외 발생
            
            //위 두 문장과 기능상 동일:
            //throw new Exception("고의로 발생")
        } catch (Exception e) {
            System.out.println("에러 메세지 : ")
 + e.getMessage());
            e.printStackTrace();
        } // End of try-catch
        System.out.println("프로그램 정상 종료")
    }
}

```



<br>

## 10. `checked`예외, `unchecked`예외

- `checked 예외`:
  - 예외 클래스의 계층구조에서 **`Exception`클래스와 그 자손들**
  - 예외처리를 해주지 않으면 **<u>컴파일조차 되지 않는다.</u>**
- `unchecked 예외`:
  - **`RuntimeException`클래스와 그 자손들**
  - **프로그래머의 실수**로 발생하는 것
  - **<u>예외처리를 강제하지 않음</u>**

<br>

## 11. 메서드에 예외 선언하기

- 예외를 처리하는 또 다른 방법
- 예외를 처리하는 것이 아니라, **<u>호출한 메서드로 전달해주는 것</u>**
  - `method()`의 `throws`에 예외를 명시하는 것은 예외를 처리하는 것이 아니라, **<u>자신을 호출한 메서드에게 예외를 전달하여 예외 처리를 떠맡기는 것</u>**이다.
  - **<u>호출한 메서드에서 예외처리를 해야만 할 때 사용</u>**

- 메서드의 선언부에 키워드 `throws`를 사용해 메서드 내에서 발생할 수 있는 예외를 적어준다.
- 예외가 여러 개일 경우, 쉼표`,`로 구분한다.

```java
void method() throws Exception1, Exception2, ...ExceptionN {
    //메서드 구현부
}
```

- 모든 예외의 최고 조상인 `Exception` 클래스를 메서드에 선언하면, 이 메서드는 모든 종류의 예외가 발생할 가능성이 있다는 의미

```java
void method() throws Exception {
    //메서드 구현부
}
```

<br>

## 14. `finally`블럭

- `finally`블럭은 예외의 발생여부에 상관없이 **항상 실행되어야할 코드**를 포함시킨다.
- `try-catch`문의 끝에 선택적으로 덧붙여 사용
  - `try-catch-finally`의 순서로 구성
- `try`또는 `catch`블럭에서 <u>`return`문을 만나도 `finally`블럭은 수행된다.</u>

<br>

## 14-1. 자원 자동 반환 - `try with resources`

- **<u>JDK 1.7 이상</u>**
- `try with resources`라는 `try-catch`의 변형이 추가됨
- `try with resources`문의 괄호`()` 안에 객체를 생성하는 문장을 넣으면, `try`블럭을 벗어나는 순간 자동적으로 `close()`를 호출
- 그 다음에 `catch`나 `finally`블럭을 수행한다.
  - 자동으로 `close()`가 호출될 수 있으려면 클래스가 <u>`AutoCloseable`이라는 인터페이스</u>를 구현한 것이어야만 한다.

```java
public static void viewTable(Connection con) throws SQLException {

    String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";

    try (Statement stmt = con.createStatement()) {
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            String coffeeName = rs.getString("COF_NAME");
            int supplierID = rs.getInt("SUP_ID");
            float price = rs.getFloat("PRICE");
            int sales = rs.getInt("SALES");
            int total = rs.getInt("TOTAL");

            System.out.println(coffeeName + ", " + supplierID + ", " + 
                               price + ", " + sales + ", " + total);
        }
    } catch (SQLException e) {
        JDBCTutorialUtilities.printSQLException(e);
    }
}
```



<br>

## 15. 사용자 정의 예외 만들기

- 기존의 예외 클래스를 상속받아 새로운 예외 클래스 정의 가능
  - 보통 `Exception`또는 `RuntimeException`클래스를 상속 받음

- `Exception`클래스는 생성 시에 `String`값을 받아서 메세지로 저장할 수 있다.
  - 사용자 정의 예외 클래스도 메세지를 저장 할 수 있으려면, `String`을 매개변수로 받는 생성자를 추가해야 한다.
  - 에러코드를 저장할 수 있게 `ERR_CODE`와 `getErrCode()`를 멤버로 추가할 것

```java
class MyException extends Exception {
    private final int ERR_CODE;
    
    MyException(String msg) {//문자열을 매개변수로 받는 생성자
        super(msg); //조상인 Exception 클래스의 생성자를 호출
        ERR_CODE = 100; //100(기본값)으로 초기화
    }
    
    MyException(String msg, int errCode) {//문자열을 매개변수로 받는 생성자
        super(msg); //조상인 Exception 클래스의 생성자를 호출
        ERR_CODE = errCode; //errCode으로 초기화
    }
    
    public int getErrCode() {
        //에러 코드를 얻을 수 있는 메서드
        //주로 getMessage()와 함께 사용될 것
        return ERR_CODE;
    }
}
```

<br>

## 17. 예외 되던지기(exception re - throwing)

- 예외를 처리한 후에 **인위적으로 다시 예외를 생성**해서 **호출한 메서드로 전달**하는 것
- **예외가 발생한 메서드**와 호출한 메서드, **<u>양쪽에서 예외를 처리해야 하는 경우</u>**에 사용

![img](Chapter-8 예외 처리/img-16433508019772-16433508019773.png)

<br>

## 18. 연결된 예외(chained exception)

- **한 예외가 다른 예외를 발생시킬 수 있음**
- 예외 A가 예외 B를 발생시켰다면, A를 B의 원인 예외(`cause exception`)이라고 한다
- `Throwable initCause(Throwable Cause)`
  - 지정한 예외를 원인 예외로 등록
- `Throwable getCause()`
  - 원인 예외를 반환    

```java
try {
    startInstall(); //SpaceException 발생
    copyFiles();
} catch (SpaceException e) {
    InstallException ie = new InstallException("설치 중 예외 발생");
    ie.initCause(e); //InstallException의 원인을 SpaceException로 지정
    throw ie; // InstallException 발생
} catch (MemoryException me) {
    ...
}
```

- `Throwable`클래스는 `Exception`클래스의 조상이므로 모든 예외에서 사용가능
- 연결된 예외를 사용하는 이유
  - 여러가지 예외를 하나의 큰 분류의 예외로 묶어서, 연결된 예외로 처리하기 위함
  - `checked 예외`(필수 예외)를 `unchecked 예외`(선택 예외)로 바꿀 수 있도록 하기 위함

```java
static void startInstall() throws SpaceException {
    if(!enoughSpace()) //충분한 설치 공간이 없으면
        throws new SpaceException("설치할 공간이 부족합니다.");
    if(!enoughMemory()) //충분한 메모리가 없으면
        throws new RuntimeException(new MemoryException("메모리가 부족합니다."));
}
```

- `MemoryException`은 `Exception`의 자손이기 때문에 **반드시 예외를 처리해야함**
- 이 예외를 `RuntimeException`으로 감싸버렸기 때문에 **<u>unchecked 예외가 되었다.</u>**
  - 위 코드에서는 `initCause()` 대신 `RuntimeException`의 생성자를 사용
  - `RuntimeException(Throwable cause) //원인 예외를 등록하는 생성자`