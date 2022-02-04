<h2> CLASS

- 정의

  - 객체지향이론적 관점

    객체에 대한 속성과 기능을 코드로 구현한 것. 즉, 객체를 정의(생성)하는 것.

  - 프로그래밍적 관점

    데이터 구조체(멤버 변수들)와 함수(메서드)의 결합 형태

    *구조체: 서로 관련된 여러 데이터를 종류에 관계없이 하나의 집합으로 저장할 수 있는 공간

  - 사용자 정의 타입

    서로 관련된 변수들을 묶어 하나의 타입으로 새로 추가하는 것. 즉, 자바에서는 클래스가 곧 사용자 정의 타입이다.



* 용어 정리
  * Member: 객체의 속성과 기능
    * Variable: 객체의 속성, 객체 고유의 데이터
    * Method: 객체의 기능
  * instance: class를 이용해서 만들어진 객체

- 클래스의 규칙
  - 파일의 이름은 public class명과 일치해야 한다. 대소문자 구분 가능하다.
  - Public class는 한 파일에 하나만 존재한다.
  - Public class가 없는 경우, 파일명은 파일 안의 어떤 class명을 사용해도 상관없다.
  - 보통 한 파일에 하나의 class를 생성한다.



<h2> 객체

```java
class Tv {
  	// 멤버 변수: 서로 다른 값 유지 가능
    String color;
    boolean power;
    int channel;
		
  	// 메서드: 모든 인스턴스에 동일
    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }

}
```

```java
   //  참조변수 / 인스턴스 생성 및 주소 저장
				Tv t1 = new Tv();
        t1.channel = 7;
        t1.channelDown();
        System.out.println("현재 채널은 " + t1.channel + " 입니다.");

				Tv t2 = new Tv();
        t2.channel = 50;
        t2.channelDown();
        System.out.println("현재 채널은 " + t2.channel + " 입니다.");
```

<img src="../../../Downloads/IMG_3753.jpg" alt="IMG_3753" style="zoom:50%;" />

**인스턴스는 참조변수를 통해서만 다룰 수 있다 **



<h2> 변수

- 선언 위치에 따른 변수 종류

  - 클래스 변수: 클래스가 메모리에 올라갈 때 생성

    클래스 영역에 선언. 모든 인스턴스가 공통된 저장공간을 공유함. 인스턴스 생성 없이 사용 가능.

  - 인스턴스 변수: 인스턴스가 생성되었을 때 생성

    클래스 영역에 선언. 인스턴스마다 독립적인 저장공간을 가져 서로 다른 값을 가질 수 있음. 

  - 지역 변수: 변수 선언문 수행될 때 생성

     클래스 영역 이외에 선언. 변수 선언문 내에서만 실행되고 사라짐.   Ex) 메서드, 생성자, 초기화 블럭 등

  ```java
  class Variables{
    int a; 						//인스턴스 변수
    static int b;			//클래스 변수(공유 변수, static 변수)
    
    void method(){
      int c = 0;			//지역 변수
    }
  }





<h2> 메서드

- 정의

  특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것. 

- 종류

  - Instance 메서드

    객체 생성해야만 호출 가능

  - Class 메서드(static 메서드)

    멤버 변수 중 모든 인스턴스에 공통으로 사용하는 것을 class 메서드로 사용

    객체 생성 없이 '클래스명.메서드명.(매개변수)' 형식으로 호출 가능

    인스턴스 변수나 메서드를 사용할 수 없음

- 특징
  - 반드시 호출해야 실행됨. 인자의 개수는 매개변수와 일치해야 함.
  - 입력값(매개변수)과 출력값은 없을 수도 있음.
  - 반환값(출력값)은 최대 1개만 허용.

- 용어

  - 반환타입 : 메서드의 실행이 종료되면서 호출부로 돌아갈 때 가져가는 값의 자료형

    반환값으로는 변수, 수식, 메서드, 조건연산자 등이 올 수 있음

    - 반환값 필수: 기본자료형, 참조자료형
    - 반환값 없음: void(자동으로 return; 추가)

  - 메서드명 : 메서드 호출(실행)시에 사용하는 이름

  - 매개변수(타입 변수명)  : 호출부에서 넘어오는 값을 보관하는 변수. 없을 수도 있음

``` java
class MyMath{
  
  // 인스턴스 메서드
  int add(int a, int b){  //선언부
    int result = a + b;   //구현부
    return result;
  }
  
  int absolute(int x){
    return abs(x);
    		// x >= 0 ? x : -x;
  }
  
  // 클래스 메서드
  static int add(int a, int b){
    int result = a + b;
    return result
  }
}
```

```java
class ex{
  public static void main(String[] args){
    
    // 인스턴스 메서드
    MyMath mm = new MyMath();
		int num = mm.add(6, 13);
    
    // 클래스 메서드
    int num = MyMath.add(6,13);
    
  }
}

```





<h2> 호출스택(call stack)

메서드의 작업에 필요한 메모리 공간을 제공함. 

메서드가 호출되면 그 메서드에게 메모리가 할당되고, 변수들, 연산 중간 결과 등이 저장됨. 

메서드가 작업을 마치면 할당되었던 메모리 공간은 다시 비워짐.





<h2> 매개변수

- 종류
  - 기본형: 변수값 읽기만 가능
  - 참조형: 변수값 읽기 및 변경 가능





<h2> overloading

- 성립 조건
  - **메서드 이름**이 같아야 함
  - **매개변수의 개수 또는 타입**이 달라야 함
  - 반환 타입은 관계없음

```java
int add(int a, int b){
  return a+b;
}

double add(double a, double b){
  return a+b;
}

void add(){
  System.out.println("add");
}
```





<h2> 생성자(constructor)

인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드. 

- 특징

  - 생성자를 정의하지 않아도 컴파일러가 제공하는 '기본생성자'가 자동으로 추가됨. 

  ​       반대로, 생성자를 정의하면 기본 생성자가 자동으로 추가되지 않음.

  - 오버로딩이 가능함.

  - 한 생성자에서 다른 생성자 호출이 가능함. 반드시 **첫 줄**에서!

    



- 조건
  - 생성자의 이름은 클래스의 이름과 같아야 함
  - return 값이 없음

```java
class Member{
  
  	String id;
		String name;
		int age;
  
    Member(){
			System.out.println(" - constructor - ");
			id = "-";
			name = "none";
			age = 0;
		}

		Member(String id, String name, int age){
			System.out.println(" -- constructor2 --");
			this.id = id;
			this.name = name;
			this.age = age;
		}
  
  	Member(String name){
      System.out.println(" --- constructor3 ---");
      this("003", name, 26)
    }
  
    Member(String id){
      this();
      System.out.println(" ---- constructor4 ----");
      this.id = id;
      //this();  error
    }
}
```

```java
public class MemberManager {

	public static void main(String[] args) {
		
		Member perA = new Member();
		Member perB = new Member("002", "Hanbi Kim", 25);
    Member perC = new Member("Jungkook Jeon")
    Member perD = new Member("004")
		
	}
}
```



- 종류

  - 기본 생성자

    클래스에 생성자를 정의하지 않으면 컴파일러가 자동으로 기본 생성자를 추가하여 컴파일 함.

    만약 클래스에 생성자를 정의하면, 기본 생성자는 추가되지 않음.

  - 매개 변수가 있는 생성자

    인스턴스를 생성하는 동시에 원하는 값으로 초기화 할 수 있게 됨.

    ```java
    class Car {
      String color;
      String gearType;
      int door;
      
      Car(String c, String g, ind d){
        color = c;
        gearType = g;
        door = d;
      }
    }
    
    Car c = new Car("White", "auto", 4)



<h2> this() 와 this

- this(): **생성자**

  생성자에서 다른 생성자를 호출할 때 사용함.

  생성자의 이름으로 클래스 이름 대신 this를 사용하고, 반드시 첫 줄에서만 호출이 가능함.

- this: **참조 변수**

  객체 자신을 가리키는 참조 변수이며 인스턴스의 주소가 저장되어 있음.

  this를 사용할 수 있는 것은 **인스턴스 멤버** 뿐임.

  이름이 같은 변수의 경우, 구별할 수 있도록 사용함.

  ```java
  class Car {
    String color;
    String gearType;
    int door;
    
    Car(String color, String gearType, ind door){
   // 인스턴스 변수   지역 변수
      this.color = color;
      this.gearType = gearType;
      this.door = door;
    }
    
    Car(){
      this("white", "auto", 4)
    }
    
    Car(String color){
      this(color, "auto", 4)
    }
  }
  



<h2>변수의 초기화
</h2>

변수를 선언하고 처음으로 값을 저장하는 것. 

가능하면 선언과 동시에 적절한 값으로 초기화 하는 것이 바람직함.

**멤벼변수(인스턴스 변수와 클래스 변수)와 배열**의 초기화는 **선택**이지만, **지역 변수**의 초기화는 **필수**임.

- 자료형의 기본값

  |      자료형      |    기본값     |
  | :--------------: | :-----------: |
  |     boolean      |     false     |
  |       char       |   '\u0000'    |
  | byte, short, int |       0       |
  |       long       |      0L       |
  |      float       |     0.0f      |
  |      double      | 0.0d  or  0.0 |
  |      참조형      |     Null      |



- 멤버 변수의 초기화

  - 순서

    클래스 변수(cv) 초기화 => 인스턴스 변수(iv) 초기화

    기본자료형 기본값 자동 초기화 => 명시적 초기화(간단) => 초기화 블럭, 생성자(복잡)

  - 용어 설명

    - 명시적 초기화

      변수를 선언과 동시에 초기화 하는 것. 가장 기본적이고 간단한 방법이므로 가장 우선적으로 고려되어야 함.

      ```java
      class Car {
        int door = 4;
        Engine e = new Engine();
      }

    - 초기화 블럭
      - 클래스 초기화 블럭: 클래스 변수의 복잡한 초기화에 사용
      - 인스턴스 초기화 블럭: 인스턴스 변수의 복잡한 초기화에 사용
