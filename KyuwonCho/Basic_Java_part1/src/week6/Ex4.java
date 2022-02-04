package week6;


class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card (String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}
public class Ex4 {
    public static void main() {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
