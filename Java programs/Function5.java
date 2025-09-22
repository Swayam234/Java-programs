import java.util.*;
class Function5
{
    public static void main(String args[])
    {
        int r;
        Scanner sc = new Scanner(System.in);
        Function5 f4 = new Function5();
        System.out.print("Enter the radius of the circle: ");
        r=sc.nextInt();
        f4.area(r);
    }
    void area(int x)
    {
        System.out.println("The area of the circle is:" +(3.14*x*x));
    }
}
