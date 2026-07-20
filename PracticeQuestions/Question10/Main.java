package PracticeQuestions.Question10;

class Person {
    String name = "Ali";
}

public class Main {

    static void change(Person p) {
        p.name = "Ahmed";
        p = null;
    }

    public static void main(String[] args) {

        Person person = new Person();

        change(person);

        System.out.println(person.name);
    }
}
