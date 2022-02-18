# 08.예외처리(exception handling)



[관련 velog 주소](https://velog.io/@mandarin913/Java-8-%EC%98%88%EC%99%B8%EC%B2%98%EB%A6%AC)



## try-catch문에서의 흐름

```python
class Ex8_1 {
    public static void main(String args[]) {
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(3);
        } catch (Exception e) {
            System.out.println(4); # 실행 안 됨
        } # try-catch 끝
        System.out.println(5);
    }
}
```



```python
class Ex8_2 {
    public static void main(String args[]) {
        System.out.println(1);
        try {
            System.out.println(0/0); # 고의로 ArithmeticException 발생
            System.out.println(2); # 실행 안 됨
        } catch (ArithmeticException ae) {
            System.out.println(3);
        } # try-catch 끝
        System.out.println(4);
    }
}
```



## 예외의 발생과 catch블럭

```python
class Ex8_3 {
    public static void main(String args[]) {
        System.out.println(1);
        System.out.println(2);
        
        try {
            System.out.println(3);
            System.out.println(0/0); # 고의로 ArithmeticException 발생
            System.out.println(4); # 실행 안 됨
        } catch (Exception e) { # ArithmeticException 대신 Exception 사용
            System.out.println(5);
        } # try-catch 끝
        
        System.out.println(6);
    }
}
```



```python
class Ex8_4 {
    public static void main(String args[]) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); # 고의로 ArithmeticException 발생
            System.out.println(4);
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException)
            	System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e) { # ArithmeticException을 제외한 모든 예외를 처리
            System.out.println("Exception");
        } # try-catch 끝
        System.out.println(6);
    }
}
```



## printStackTrace()와 getMessage()

```python
class Ex8_5 {
    public static void main(String args[]) {
        System.out.println(1);
        System.out.println(2);
        
        try {
            System.out.println(3);
            System.out.println(0/0); # 고의로 ArithmeticException 발생
            System.out.println(4); # 실행 안 됨
        } catch (ArithmeticException ae) {
            ae.printStackTrace(); # 참조변수 ae를 통해 생성된 ArithmeticException 인스턴스에 접근 가능
            System.out.println("예외메시지 : " + ae.getMessage());
        } # try-catch 끝
        
        System.out.println(6);
    }
}
```



## 예외 발생시키기

```python
class Ex8_6 {
    public static void main(String args[]) {
        try {
            Exception e = new Exception("고의로 발생시킴");
            throw e; # 예외를 발생시킴
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음");
    }
}
```



## checked예외, unchecked예외

```python
class Ex8_7 {
    public static void main(String args[]) {
        throw new Exception(); # Exception을 고의로 발생시킨다.
    }
}
```



```python
class Ex8_8 {
    public static void main(String args[]) {
        throw new RuntimeException(); # RuntimeException을 고의로 발생시킨다.
    }
}
```



## 메서드에 예외 선언하기 예제1

```python
class Ex8_9 {
    public static void main(String args[]) throw Exception {
        method1();
    }
    
    static void method1() throws Exception {
        method2();
    }
    
    static void method2() throws Exception {
        throw new Exception();
    }
}
```



## 메서드에 예외 선언하기 예제2

```python
import java.io.*;

class Ex8_10 {
    public static void main(String args[]) {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage()+" 다시 입력해 주시기 바랍니다.");
        }
    }
    
    static File createFile(String fileName) throws Exception {
        if (fileName==null || fileName.equal(""))
        	throw new Exception("파일이름이 유효하지 않습니다.");
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}
```



## 사용자 정의 예외 만들기 예제

```python
class Ex8_11 {
    public static void main(String args[]) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        } catch (MemoryException me) {
            System.out.println("에러 메시지 : " + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도하세요.");
        } finally {
            deleteTempFiles();
        }
    }
    
    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace())
        	throw new SpaceException("설치할 공간이 부족합니다.");
        if (!enoughMemory())
        	throw new MemoryException("메모리가 부족합니다.");
    }
    
    static void copyFiles() {/*파일들을 복하사는 코드 적기*/}
    static void deleteTempFiles() { /*임시파일들을 삭제하는 코드 적기*/}
    
    staic boolean enoughSpace() {
        retrun true;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
```



## 예외 되던지기(exception re-throwing)

```python
class Ex8_12 {
    public static void main(String args[]) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
        }
    }
    
    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1메서드에서 예외가 처리되었습니다.");
            throw e;
        }
    }
}
```



## 연결된 예외(chained exception) 예제

```python
class Ex8_13 {
    public static void main(String args[]) {
        try {
            install();
        } catch(InstallException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException2 e) {
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(e);
            throw ie;
        } catch (MemoryException2 me) {
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }
    
    static void startInstall() throws SpaceException2, MemoryException2 {
        if(!enoughSpace()) {
            throw new SpaceException2("설치할 공간이 부족합니다.");
        }
        
        if (!enoughMemory()) {
            throw new MemoryException2("메모리가 부족합니다.");
        }
    }
    
    static void copyFiles() {/*파일들을 복하사는 코드 적기*/}
    static void deleteTempFiles() { /*임시파일들을 삭제하는 코드 적기*/}
    
    static boolean enoughSpace() {
        return false;
    }
    
    static boolean enoughMemory() {
        return true;
    }
}

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException2 extends Exception {
    SpaceException2(String msg) {
        super(msg);
    }
}

class MemoryException2 extends Exception {
    MemoryException2(String msg) {
        super(msg);
    }
}
```



