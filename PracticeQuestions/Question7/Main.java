package PracticeQuestions.Question7;

class Box {
    int value = 10;
}

public class Main {

    static void change(Box b1, Box b2) {
        b1.value = 50;
        b2.value = 100;
    }

    public static void main(String[] args) {

        Box x = new Box();
        Box y = new Box();

        change(x, y);

        System.out.println(x.value + " " + y.value);
    }
}

