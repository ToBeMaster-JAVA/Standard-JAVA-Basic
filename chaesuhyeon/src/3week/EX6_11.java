class Data_1 {
    int value;
}

class Data_2 {
    int value;

    Data_2(int x) { // 매개변수가 있는 생성자
        value = x;
    }
}


class EX6_11 {
    public static void main(String args[]) {
        Data_1 d1 = new Data_1();
//        Data_1 d2 = new Data_2(); // compile error 발생  (매개변수가 없어서)
        Data_2 d2 = new Data_2(10); // 정상 작동
    }
}