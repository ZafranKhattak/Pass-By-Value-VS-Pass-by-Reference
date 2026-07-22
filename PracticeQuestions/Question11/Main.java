package PracticeQuestions.Question11;

class Test {
    int x = 10;
}

public class Main {

    static void change(Test t) {
        t.x = 20;
    }

    public static void main(String[] args) {
        Test obj = new Test();
        change(obj);
        System.out.println(obj.x);
    }
}