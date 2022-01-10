class MyMath2 {
    long a , b;

    // 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요 없음
    long add() { return a + b; }
    long subtract() { return a - b; }
    long mutiply() { return a * b; }
    long divide()  { return a / b; }

    // 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능
    static long add(long a , long b) { return a + b; } // a,b는 지역변수
    static long subtract(long a , long b) { return a - b; }
    static long mutiply(long a , long b) { return a * b; }
    static long divide(long a , long b)  { return a / b; }

}

class EX6_9 {
    public static void main(String args[]) {
        // 클래스 메서드 호출. 인스턴스 생성 없이 호출 가능
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.mutiply(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));

        MyMath2 mm = new MyMath2(); // 인스턴스 생성
        mm.a = 200L;
        mm.b = 100L;

        //인스턴스메서드는 객체 생성 후에만 호출이 가능
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.mutiply());
        System.out.println(mm.divide());
    }
}