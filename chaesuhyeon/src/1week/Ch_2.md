# 글자 출력 print() , println()

- 화면에 글자를 출력할 때는 System.out.print() 사용 -> ()안에 출력하고자 하는 내용 넣기

```java
System.out.print("Hello, world")
System.out.print(2+2) // 화면에4출력
System.out.print("2+2") // 화면에 2+2 출력
```

#### print() , println()의 차이

```java
System.out.print() // 괄호 안의 내용을 출력하고 줄바꿈을 하지 않는다.
System.out.println() // 괄호 안의 내용을 출력하고 줄바꿈을 한다.
```

 ※ 자바는 대소문자 구분 하기 때문에 System을 system이라고 적으면 안됨



```java
class Ex2_1 {
    public static void main(String[] args){
        System.out.println("Hello, world");
        System.out.print("Hello");
        System.out.println("World");
    }
}

Hello, world
HelloWorld

```

 ※ 문장 끝에 ;(세미콜론) 꼭 넣기 !!



```java
class Ex2_2 {
    public static void main(String[] args){
        System.out.println("Hello, world");
        System.out.print("2+2=");
        System.out.println(2+2);
    }
}

Hello, world
2+2=4

```



---

# 덧셈 뺄셈 계산하기

- 괄호 안에 사칙연산 기호만 넣어주면 됨

```java
System.out.println(2+2);

class Ex2_3 {
    public static void main(String[] args){
        System.out.println(6+2);
        System.out.println(6-2);
        System.out.println(6*2);
        System.out.println(6/2);  // 정수 나누기 정수 = 정수 
    }
}

8
4
12
3
```



---

# 변수의 선언과 저장

- 변수 : 하나의 값을 저장할 수 있는 저장공간

```java
변수타입 변수이름; // 변수 선언하는 방법

// 변수는 변수에 저장할 값이 어떤 것이냐에 따라 달라지며, 
// 변수의 이름은 저장공간이 서로 구별될 수 있어야 하기 때문에 필요

EX)
int x; // 정수(integer)를 저장하기 위한 변수 x를 선언
x = 6; // 변수 x에 5를 저장
x = 2; // 변수 x에 3을 저장 , 기존 값은 지워짐

int x = 6; // 간단히 작성 

```



```java
class Ex2_4 {
    public static void main(String[] args){
        int x = 6;
        System.out.println(x);
        
        x = 2;  //기존의 6은 지워짐
        System.out.println(x);
        
    }
}

6
2
```

```java
class Ex2_5 {
    public static void main(String[] args){
        int x = 6;
        int y = 2;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        
    }
}


8
4
12
3
```



---

# 변수의 타입

```java
숫자 :int   -> 정수(integer)를 저장하기 위한 타입(20억이 넘을 땐 long)
숫자 :float/double -> 실수(floating-point number)를 저장하기 위한 타입. float는 오차없이 7자리, 
															double은 15자리

문자 :char  -> 문자(character)를 저장하기 위한 타입
문자 :String -> 여러 문자(문자열, string)를 저장하기 위한 타입

int x = 100;
double pi = 3.14; // 실수를 저장할 변수의 타입은 double로 함
char ch = 'a'; // 문자(1)개를 저장할 변수의 타입은 char로 함
String str = "abc"; // 여러 문자(0~n개)를 저장할 변수의 타입은 String으로 함
```

```java
class Ex2_6 {
    public static void main(String[] args){
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


100
3.14
a
abc
```

