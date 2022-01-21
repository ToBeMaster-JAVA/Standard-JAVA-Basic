package week4;


import com.sun.corba.se.impl.resolver.LocalResolverImpl;

public class Ex13 {
    class InstanceInner {}
    static class StaticInner {}

    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
//        InstanceInner obj1 = new InstanceInner(); // static 메서드에서 인스턴스멤버 접근 불가
        StaticInner obj2 = new StaticInner();

        Ex13 outer = new Ex13();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
//        LocalInner lv = new LocalInner(); // 지역적으로 선언됬기 때문에 밖에서는 없음
    }

    void method() {
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }

}
