package week6;


class Person {
    long id;

    public boolean equals(Object obj) {
        if (obj instanceof  Person) {
            return  id == ((Person)obj).id;
        } else {
            return false;
        }
    }

    Person(long id) {
        this.id = id;
    }
}

public class Ex2 {
    public static void main() {
        Person p1 = new Person(123456789L);
        Person p2 = new Person(123456789L);

        if (p1.equals(p2)) {
            System.out.println("same");
        } else {
            System.out.println("diff");
        }
    }
}
