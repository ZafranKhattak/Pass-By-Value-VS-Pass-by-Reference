package PracticeQuestions.Question9;

class Test {
    int x = 5;
}

public class Main {

    static void fun(Test t) {
        t.x = 10;
        t = new Test();
        t.x = 20;
    }

    public static void main(String[] args) {

        Test obj = new Test();

        fun(obj);

        System.out.println(obj.x);
    }
}
