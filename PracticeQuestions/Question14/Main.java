package PracticeQuestions.Question14;

class Test {
    int x = 5;
}

public class Main {

    static void change(Test a, Test b) {
        a.x = 15;
        b.x = 25;
        a = new Test();
        a.x = 50;
    }

    public static void main(String[] args) {
        Test obj1 = new Test();
        Test obj2 = new Test();

        change(obj1, obj2);

        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}
