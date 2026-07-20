package PracticeQuestions.Question6;
public class Main {

    static void change(String s) {
        s = "World";
    }

    public static void main(String[] args) {

        String str = "Hello";

        change(str);

        System.out.println(str);
    }
}