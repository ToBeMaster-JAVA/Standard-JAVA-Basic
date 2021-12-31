1. 화면 입력

   ```java
   import java.util.Scanner;  // Scanner 사용을 위해 추가
   class ex2_10{
     public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);  // 객체 생성
       
       // 입력 방법 예시 1
       String input = scanner.nextLine();  // 입력받은 내용 input에 저장
       int num = Integer.parseInt(input);  // input을 int 타입으로 변환
       
       //입력 방법 예시 2
       int number = scanner.nextInt();  // 처음부터 정수를 입력받아 저장
     }
   }
   ```

   

2. 화면 출력

   - System.out.println();

     - 변수값 그대로 내용 출력 + 줄바꿈

   - System.out.print();

     - 변수값 그대로 내용 출력

   - System.out.printf();

     - '지시자(specifier)'를 통해 변수값의 형식을 변환해 출력

     - 'println()'처럼 줄바꿈을 원하면 '%n'을 추가

       ex) System.out.printf("age:%d%n", 14)

       

3. 지시자

   - %f: 

     - 소수점 6자리까지 반올림해 출력
     - 자리수 지정 가능   ex) %14.10f.  => 전체 14자리 중 소수점 아래 10자리

   - %s:

     - 출력 공간 확보 가능   

       ex) [%s]  => 문자열 길이만큼 

       ​	   [%20s]  => (우측 정렬) 최소 20글자 출력 공간 확보

       ​	   [%-20s]  => (좌측 정렬) 최소 20글자 출력 공간 확보

     - 부분 출력 가능

       ex) [%.8s]  => 왼쪽에서 8글자만 출력 

   | 지시자 | 설명                             |
   | ------ | -------------------------------- |
   | %d     | 10진(decimal) 정수 형식          |
   | %x     | 16진(hexa-decimal) 정수 형식     |
   | %f     | 부동 소수점(floating-point) 형식 |
   | %c     | 문자(character) 형식             |
   | %s     | 문자열(string) 형식              |

   

4. 자주 쓰이는 변수(variable)의 타입

   - 숫자형(**기본 자료형**)

     - 정수: **int** / long(20억이 넘을 경우 사용)
     - 실수: float(오차없이 7자리) / **double(오차없이 15자리)**

   - 문자형

     - 문자: char(1글자)

     - 문자열: string(여러 글자)

       

5. 상수(constant)

   - 변수와 달리 한 번 값을 저장하면 다른 값으로 변경 불가능. 고정된 값. 

     상수명은 대문자로 해야하고, 여러 단어로 이루어진 경우 '_'로 구분.

     ex)   final int MAX_SPEED = 10;

     

6. 리터럴(literal)

   1. 리터럴의 타입
      - 논리형: true, false
      - 정수형: 1, 0xFF, 100L 등
      - 실수형: 3.14, 1.4f, 1.618d 등
      - 문자형: 'A', '1', '\n' 등
      - 문자열: "ABC", "123", "A", "true" 등

   2. 리터럴의 접미사

      - 정수형에서 **'L' 또는 'l'**은 long, 실수형에서 **'F' 또는 'f'**는 float, 'D' 또는 'd'는 double을 뜻함

      - 정수형에서 int가 기본형이듯 실수형에서는 double이 기본형이기에 D/d는 생략 가능

        ex)   float pi = 3.14f;     long big = 100L;

        

7. 문자형과 문자열

   - 문자열은 빈 문자열(empty string)을 허용하지만 문자형은 빈 문자형이 아닌 공백(blank)만 허용

     ex) String str = "";        char ch = '   ';

     

8. 자료형

   1. 기본형: 실제 값(data)을 저장  ex) 논리형, 정수형, 실수형, 문자형, 문자열 등 총 8개

      - 종류와 범위 **(정리 필요)**

   2. 참조형: 어떤 값이 저장되어 있는 주소(memory address)를 값으로 저장  ex) 8개의 기본형을 제외한 나머지

      - 기본형 변수와 다르게 참조형 변수 간은 연산을 할 수 없음

        

9. 오버플로우(overflow): 타입이 표현할 수 있는 값의 범위를 넘어서는 것

   - 범위는 최소값에서 최대값을 이어 놓았다고 생각하면 됨

     즉, 최대값 + 1 = 최소값 / 최소값 - 1 = 최대값

     ``` java
     class ex2_11{
     	public static void main(String[] args){
         short sMin = -32768, sMax = 32767;
         System.out.println("sMin-1=" + (short)(sMin-1)); // sMin-1=32767
         System.out.println("sMax+1=" + (short)(sMax+1)); // sMax+1=-32768
       }
     }
     ```



10. 타입 간의 변환 방법

    1. 숫자 => 문자: 

       - (char)(3+'0') => '3'

    2. 문자 => 숫자: 

       - '3' - '0' => 3

    3. 숫자 => 문자열: 

       - 3 + "" => "3"

    4. 문자열 => 숫자: 

       - Integer.parseInt("3")  => 3 

       - Double.parseDouble("3.14") => 3.14

    5. 문자열 => 문자: 

       - "3".charAt(0) => '3'

    6. 문자 => 문자열: 

       - '3' + "" => "3"