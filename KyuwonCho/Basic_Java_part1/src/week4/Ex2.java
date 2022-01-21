package week4;


class Parent {
    int x = 10;
}


class Child extends Parent {
    int x = 20;

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}

class Child2 extends Parent {
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}


public class Ex2 {
    public static void main() {
        Child ex = new Child();
        ex.method();
        System.out.println();
        Child2 ex2 = new Child2();
        ex2.method();
    }
}
