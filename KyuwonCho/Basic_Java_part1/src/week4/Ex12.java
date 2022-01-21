package week4;


public class Ex12 {
    class InstanceInner {
        int iv = 100;
//        static int cv = 100; // static 선언 불가
        final static int CONST = 100; // final static은 상수 => 가능
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
//            static int cv = 300; // static 클래스 아니라 불가
            final static int CONST = 300;
        }
    }
    public static void main() {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
