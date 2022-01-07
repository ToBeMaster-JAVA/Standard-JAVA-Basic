# 05.배열(Array)



[관련 velog 주소](https://velog.io/@mandarin913/Java-3-%EC%97%B0%EC%82%B0%EC%9E%90)


## 배열의 출력 예제
```java
import java.util.Arrays;
class Ex5_1 {
    public staic void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for(int i=0; i< iArr1.length; i++) {
            iArr1[i] = i+1;
        }

        for (int i=0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random()*10)+1;
        }

        for(int i=0; i < iArr1.lenth; i++) {
            System.out.print(iArr1[i]+",");
        }
        System.out.println();

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
    }
}
```
## 배열의 활용(1) - 총합과 평균
```java
class Ex5_2 {
    public staic void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i=0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float)score.length;

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);

    }
}
```

## 배열의 활용(2) - 최대값과 최소값
```java
class Ex5_3 {
    public staic void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        for(int i=1; i < score.length; i++) {
            if(score[i] > max) {
                max = score[i];
            } else if(score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("최대값 :" + max);
        System.our.println("최소값 :" + min);
    }
}
```

## 배열의 활용(3) - 섞기(shuffle)
```java
import java.util.Arrays;
class Ex5_4 {
    public staic void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for(int i=0; i < 100; i++) {
            int n = (int)(Math.random()*10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
```

## 배열의 활용(4) - 로또 번호 만들기
```java
class Ex5_5 {
    public staic void main(String[] args) {
        int ball = new int[45];

        for(int i=0; i < ball.length; i++)
            ball[i] = i+1;
        
        int tmp = 0;
        int j = 0;

        for(int i=0; i < 6; i++) {
            j = (int)(Math.random() * 45);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }
        
        for(int i=0; i < 6; i++) 
            System.out.printf("ball[%d] = %d%n", i, ball[i]);
    }
}
```

## String 배열의 초기화
```java
class Ex5_6 {
    public staic void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};

        for(int i=0; i < names.length; i++) 
            System.out.println("names["+i+"]:"+names[i]);
        
        String tmp = names[2];
        System.out.println("tmp:"+tmp);
        names[0] = "Yu";

        for(int i=0; i < names.length; i++)
            System.out.println(names[i]);
    }
}
```

## 커맨드 라인을 통해 입력받기
```java
class Ex5_7 {
    public staic void main(String[] args) {
        System.out.println("매개변수의 개수:"+args.length);
        for(int i=0; i<args.length; i++) {
            System.out.println("args[" +i+ "] = \""+ args[i] + "\"");
        }
    }
}
```