package PracticeQuestions.Question12;

class Test {
    int x = 10;
}

public class Main {

    static void change(Test t) {
        t = new Test();
        t.x = 50;
    }

    public static void main(String[] args) {
        Test obj = new Test();
        change(obj);
        System.out.println(obj.x);
    }
}
