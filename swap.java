public class swap {
    public static void main(String[] args)
    {
        int a=200,b=300;
        System.out.println("A value before swapping is "+a+" and B value before swapping is "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("A value after swapping is "+a+" and B value after swapping is "+b);
    }
}