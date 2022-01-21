package week3;

public class Problems {
    public static void main(String[] args) {

    }
}

class Problem1_2_Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int sum() {
        return kor + eng + math;
    }

    float average() {
        return (float)sum()/3f;
    }

}
