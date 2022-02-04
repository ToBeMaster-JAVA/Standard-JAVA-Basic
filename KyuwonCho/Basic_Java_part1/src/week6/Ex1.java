package week6;


class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
}
public class Ex1 {
    public static void main() {
        Value v1 = new Value(10); // v1에는 인스턴스의 참조값
        Value v2 = new Value(10); // v2에는 다른 인스턴스의 참조값

        if (v1.equals(v2)) {
            System.out.println("same");
        } else {
            System.out.println("diff");
        }
    }
}
