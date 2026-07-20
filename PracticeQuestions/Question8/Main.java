package PracticeQuestions.Question8;

class Student {
    String name = "Ali";
}

public class Main {

    static void change(Student s) {
        s.name = "Ahmed";
        s = new Student();
        s.name = "Bilal";
    }

    public static void main(String[] args) {

        Student st = new Student();

        change(st);

        System.out.println(st.name);
    }
}
