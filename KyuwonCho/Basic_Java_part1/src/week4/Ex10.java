package week4;


abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        /* 현재 위체에 정지 */
    }
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x= " + x + ", y = " + y + "]");
    }
    void stimPack() {
//        스팀팩 사용
    }
}

class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank[x= " + x + ", y = " + y + "]");
    }

    void changeMode() {
//        공격 모드 변환
    }
}
class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship[x= " + x + ", y = " + y + "]");
    }

    void load() {
//        대상 태우기
    }

    void unload() {
//        대상 내리기
    }
}


public class Ex10 {
    public static void main() {
        Unit[] group = { new Marine(), new Tank(), new Dropship() };

        for (int i = 0; i < group.length; i++) {
            group[i].move(100,200);
        }
    }
}
