package PracticeQuestions.Question13;

class Test {
    int x = 10;
}

public class Main {

    static void change(Test t) {
        t.x = 30;
        t = new Test();
        t.x = 40;
    }

    public static void main(String[] args) {
        Test obj = new Test();
        change(obj);
        System.out.println(obj.x);
    }
}