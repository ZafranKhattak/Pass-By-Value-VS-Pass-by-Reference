package PracticeQuestions.Question15;

class Test {
    int x = 10;
}

public class Main {

    static void change(Test t) {
        t.x = 20;
        t = null;
        t = new Test();
        t.x = 30;
    }

    public static void main(String[] args) {
        Test obj = new Test();

        change(obj);

        System.out.println(obj.x);
    }
}
