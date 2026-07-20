package PracticeQuestions.Question5;

class Box {
    int value = 10;
}

public class Main {

    static void change(Box b) {
        b.value = 20;
        b = new Box();
        b.value = 30;
    }

    public static void main(String[] args) {

        Box box = new Box();

        change(box);

        System.out.println(box.value);
    }
}
