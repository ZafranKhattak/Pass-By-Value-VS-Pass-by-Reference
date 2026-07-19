package PassbyReference;

class Student
{
    String name;
}
class PassbyReference
{
    public static void change(Student st)
    {
        st = new Student();

        st.name = "ZafranKhan";
    }
}
public class Main {
    public static void main(String args[])
    {
        Student s = new Student();
        s.name = "Farhan";

        PassbyReference.change(s);

        System.out.print(s.name);
    }
}
