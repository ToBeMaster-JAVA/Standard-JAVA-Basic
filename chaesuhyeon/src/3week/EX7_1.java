class Tv1 {
    boolean power; // 전원상태(on/off)
    int channel; // 채널

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class CaptionTv extends Tv1 { // CaptionTvsms Tv에 캡션(자막)을 보여주는 기능 추가
    boolean caption; // 캡션 상태(on/off)
    void displayCaption(String text) {
        if (caption) { // caption이 true(on)일 때만 text보여줌
            System.out.println (text);
        }
    }
}

class EX7_1 {
    public static void main(String args[]) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, world");
        ctv.caption = true; // caption true(on)
        ctv.displayCaption("Hello, world!");

    }
}