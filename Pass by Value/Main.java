class PassByValue
{
    public static void change(int x)
    {
        x = 20;
    }
}

public class Main 
{
    public static void main(String args[])
    {
        int a = 10;
        PassByValue.change(a);
        System.out.print(a);
    }
}