public class chapter6_exercises {
    public static void main(String[] args) {

        //ex1
        Tv t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + " 입니다.");


        //ex2
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");


        //ex3
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height =" + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다");
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");



        //ex4
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);


        //ex6
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);


        //ex7
        Data2 dd = new Data2();
        dd.x = 10;
        System.out.println("main() : x = " + dd.x);

        change(dd);
        System.out.println("After change(dd)");
        System.out.println("main() : x = " + dd.x);


        //ex8
        Data3 ddd = new Data3();
        ddd.x = 10;

        Data3 d2 = copy(ddd);
        System.out.println("d.x ="+ddd.x);
        System.out.println("d2.x="+d2.x);


        //ex9
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));

        MyMath2 m = new MyMath2();
        m.a = 200L;
        m.b = 100L;
        System.out.println(m.add());
        System.out.println(m.subtract());
        System.out.println(m.multiply());
        System.out.println(m.divide());


        //ex11
        Data_1 d1 = new Data_1();
        Data_2 d3 = new Data_2(10);


        //ex12
        Car car = new Car();
        car.color = "white";
        car.gearType = "auto";
        car.door = 4;

        Car car2 = new Car("white", "auto", 4);

        System.out.println("car의 color=" + car.color + ", gearType=" + car.gearType + ", door=" + car.door);
        System.out.println("car2의 color=" + car2.color + ", gearType=" + car2.gearType + ", door=" + car2.door);


        //ex13
        Car2 c = new Car2();
        Car2 cc = new Car2("blue");

        System.out.println("c의 color=" + c.color + ", gearType=" + c.gearType + ", door=" + c.door);
        System.out.println("cc의 color=" + cc.color + ", gearType=" + cc.gearType + ", door=" + cc.door);


        //ex14
        System.out.println("Ex6_14 bt = new Ex6_14(); ");
        chapter6_exercises bt = new chapter6_exercises();

        System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
        chapter6_exercises bt2 = new chapter6_exercises();
    }

        //ex6
        static void change(int x) {
            x = 1000;
            System.out.println("change() : x = " + x);
        }


        //ex7
        static void change(Data2 dd) {
            dd.x = 1000;
            System.out.println("Change() : x = " + dd.x);
        }


        //ex8
        static Data3 copy(Data3 ddd) {
            Data3 tmp = new Data3();

            tmp.x = ddd.x;

            return tmp;
        }


        //ex14
        static {
            System.out.println("static { }");
        }

    {
        System.out.println("{ }");
    }

        public chapter6_exercises() {
            System.out.println("생성자");
        }

}

    class Data {int x;}
    class Data2 {int x;}
    class Data3 {int x;}

    // ex1  ex2
    class Tv {
        String color;
        boolean power;
        int channel;

        void power() { power = !power; }
        void channelUp() { ++channel; }
        void channelDown() { --channel; }

    }


    //ex3
    class Card {
        String kind;
        int number;
        static int width = 100;
        static int height = 250;
    }


    //ex4
    class MyMath {
        long add(long a, long b) {
            long result = a + b;
            return result;
        }
        long subtract(long a, long b) { return a - b; }
        long multiply(long a, long b) { return a * b; }
        double divide(double a, double b) { return a / b; }
    }


    //ex9
    class MyMath2 {
        long a, b;

        long add() { return a + b; }
        long subtract() { return a - b; }
        long multiply() { return a * b; }
        double divide() { return a / b; }

        static long add(long a, long b) { return a + b; }
        static long subtract(long a, long b) { return a - b; }
        static long multiply(long a, long b) { return a * b; }
        static double divide(long a, long b) { return a / (double)b; }
    }


    //ex11
    class Data_1 {
        int value;
    }

    class Data_2 {
        int value;

        Data_2(int x) {
            value = x;
        }
    }


    //ex12
    class Car {
        String color;
        String gearType;
        int door;

        Car() {}

        Car(String c, String g, int d) {
            color = c;
            gearType = g;
            door = d;
        }
    }


    //ex13
    class Car2 {
        String color;
        String gearType;
        int door;

        Car2() {
            this("white", "auto", 4);
        }

        Car2(String color) {
            this(color, "auto", 4);
        }

        Car2(String color, String gearType, int door) {
            this.color = color;
            this.gearType = gearType;
            this.door = door;
        }
    }
