class EX6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = "+ Card.width);
        System.out.println("Card.height = "+ Card.height);
        // class변수(static 변수)는 객체 생성 없이 `클래스이름.클래스변수`로 사용가능
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade"; // 인스턴스 변수의 값을 변경
        c2.number = 4; // 인스턴스 변수의 값을 변경

        System.out.println("c1은 "+ c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width +"," + c1.height + ")" ) ;
        System.out.println("c2는 "+ c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width +"," + c2.height + ")" ) ;

        System.out.println("c1의 width와 height를 각각 50,80으로 변경합니다");
        c1.width = 50; // 클래스 변수의 값을 변경
        c1.height = 80; // 클래스 변수의 값을 변경

        System.out.println("c1은 "+ c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width +"," + c1.height + ")" ) ;
        System.out.println("c2는 "+ c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width +"," + c2.height + ")" ) ;


    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}