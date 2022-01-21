package week4;


class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}


class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}


public class Ex1 {
    public static void main() {
        CaptionTv ctv = new CaptionTv();
        // 상속받은 인스턴스 멤버(변수, 메서드)
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.channelDown();
        System.out.println(ctv.channel);
        // 상속 외 새로운 인스턴스 메서드
        ctv.displayCaption("Hello, World!");
        ctv.caption = true;
        ctv.displayCaption("Hello, World!");
    }
}