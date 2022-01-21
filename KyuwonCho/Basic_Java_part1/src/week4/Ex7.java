package week4;


import java.sql.SQLOutput;

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }

    void stop() {
        System.out.println("Stop!");
    }
}


class FireEngine extends Car {
    void water() {
        System.out.println("Water!!!!");
    }
}


public class Ex7 {
    public static void main() {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // ==> car = (Car)fe;
//        car.water(); // 불가 -> Car타입은 water가 없기 때문
        fe2 = (FireEngine)car; // car를 FireEngine으로 형변화 시킨 것을 fe2에 저장
        fe2.water();
    }
}
