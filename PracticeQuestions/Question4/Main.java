package PracticeQuestions.Question4;

public class Main {

    static void change(int[] arr) {
        arr = new int[]{50, 60, 70};
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 30};

        change(a);

        System.out.println(a[0]);
    }
}
