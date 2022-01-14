class MyPoint {
    int x; // 인스턴스 변수
    int y; // 인스턴스 변수
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // 답
    double getDistance(int x1, int y1) { // 인스턴스 메서드
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y는 인스턴스 변수
    }
}
class Exercise6_6 {
    public static void main(String args[]) {
        MyPoint p = new MyPoint(1,1);
        System.out.println(p.getDistance(2,2));
    }
}

