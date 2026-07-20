package PracticeQuestions.Question1;

class Student {
    String name;
}

public class Main {

    static void change(Student s) {
        s.name = "Ahmed";
    }

    public static void main(String[] args) {

        Student st = new Student();
        st.name = "Ali";

        change(st);

        System.out.println(st.name);
    }
}
