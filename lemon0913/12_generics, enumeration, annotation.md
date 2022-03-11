# 12. 지네릭스, 열거형, 애너테이션(generics, enumeration, annotation)



## 지네릭 타입과 다형성 예제

```java
import java.util.*;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList  = new ArrayList<Tv>();
        // ArrayList<Product> tvList = new ArrayList<Tv>(); // 에러
        // List<Tv> tvList = new ArrayList<Tv>; // 에러아님. 다형성
        
        productList.add(new Tv());
        productList.add(new Audio());
        
        tvList.add(new Tv());
        tvList.add(new Tv());
        
        printAll(productList);
        // printAll(tvList); // 컴파일 에러 발생        
    }
    
    public static void printAll(ArrayList<Product> list) {
        for (Product p : list)
            System.out.println(p);
    }
}
```



## Iterator<E>

```java
import java.util.*;

class Ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("홍길동", 2, 1));
        
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
        //Student s = (Student)it.next(); // 지네릭스를 사용하지 않으면 형변환 필요
            Student s = it.next();
            System.out.println(s.name);
        }
    }
}

class Student {
    String name = "";
    int ban;
    int no;
    
    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}
```



## 제한된 지네릭 클래스 예제

```java
import java.util.ArrayList;

class Fruit implements Etable {
    public String toString() {return "Fruit";}
}
class Apple extends Fruit {public String toString() {return "Apple";}}
class Grape extends Fruit {public String toString() {return "Grape";}}
class Toy {public String toString() {return "Toy";}}

interface Eatable {}

class Ex12_3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        // FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 에러. 타입 불일치
        // FruitBox<Toy> toyBox = new FruitBox<Toy>(); // 에러.
        
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        // appleBox.add(new Grape()); // 에러. Grape는 Apple의 자손이 아님
        grapeBox.add(new Grape());
        
        System.out.println("fruitBox-"+fruitBox);
        System.out.println("appleBox-"+appleBox);
        System.out.println("grapeBox-"+grapeBox);
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {list.add(item);}
    T get(int i) {return list.get(i);}
    int size() {return list.size();}
    public String toString() {return list.toString();}
}
```



## 와일드 카드 예제

```java
import java.util.ArrayList;

class Fruit2 {public String toString() {return "Fruit";}}
class Apple2 extends Fruit2 {public String toString() {return "Apple";}}
class Grape2 extends Fruit2 {public String toString() {return "Grape";}}

class Juice {
    String name;
    
    Juice(String name) {this.name = name + "Juice";}
    public String toString() {return name;}
}

class Juicer {
    static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
        String tmp = "";
        
        for (Fruit2 f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
}

class Ex12_4 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
        FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
        
        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
        appleBox.add(new Apple2());
        
        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}

class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {list.add(item);}
    T get(int i) {return list.get(i);}
    ArrayList<T> getList() {return list;}
    int size() {return list.size();}
    public String toString() {return list.toString();}
}
```



## 열거형 예제

```java
enum Direction {EAST, SOUTH, WEST, NORTH}

class Ex12_5 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");
        
        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        System.out.println("d3="+d3);
        
        System.out.println("d1==d2 ? "+ (d1==d2));
        System.out.println("d1==d3 ? "+ (d1==d3));
        System.out.println("d1.equals(d3) ? "+ d1.equals(d3));
        // System.out.println("d2 > d3 ? "+ (d1 > d3)); // 에러
        System.out.println("d1.compareTo(d3) ? "+ (d1.compareTo(d3)));
        System.out.println("d1.compareTo(d2) ? "+ (d1.compareTo(d2)));
        
        switch(d1) {
            case EAST: // Direction.EAST라고 쓸 수 없음
                System.out.println("The direction is EAST."); break;
            case SOUTH:
                System.out.println("The direction is SOUTH."); break;
            case WEST:
                System.out.println("The direction is WEST."); break;
            case NORTH:
                System.out.println("The direction is NORTH."); break;
            default:
                System.out.println("Invalid direction."); break;
        }
        
        Direction[] dArr = Direction.values();
        
        for(Direction d : dArr)
            System.out.printf("%s=%d%n", d.name(), d.ordinal());        
    }
}
```



## 열거형에 멤버 추가하기 예제

```java
enum Direction2 {
    EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");
    
    private static final Direction2[] DIR_ARR = Direction2.values();
    private final int value;
    private final String symbol;
    
    Direction2(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }
    
    public int getValue() { return value; }
    public String getSymbol() { return symbol; }
    
    public static Direction2 of(int dir) {
        if (dir < 1 || dir > 4)
            throw new IllegalArgumentException("Invalid value :" + dir);
        return DIR_ARR[dir - 1];
    }
    
    public Direction2 rotate(int num) {
        num = num % 4;
        
        if(num < 0) num += 4;
        
        return DIR_ARR[(value-1+num) % 4];
    }
    
    public String toString() {
        return name()+getSymbol();
    }
}

class Ex12_6 {
    public static void main(String[] args) {
        for(Direction2 d : Direction2.values())
            System.out.printf("%s=%d%n", d.name(), d.getValue());
        
        Direction2 d1 = Direction2.EAST;
        Direction2 d2 = Direction2.of(1);
        
        System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
        System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
        System.out.println(Direction2.EAST.rotate(1));
        System.out.println(Direction2.EAST.rotate(2));
        System.out.println(Direction2.EAST.rotate(-1));
        System.out.println(Direction2.EAST.rotate(-2));
    }
}
```

