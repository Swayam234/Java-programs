import java.util.*;
class Function11
{
    public static void main(String args[])
    {
        double r;
        double result;
        Scanner sc = new Scanner(System.in);
        Function11 f10 = new Function11();
        System.out.print("Enter the radius of the circle:");
        r=sc.nextDouble();
        result=f10.area(r);
        System.out.print("The area is:"+result);
    }
    double area(double rad)
    {
        double a;
        a=3.14*rad*rad;
        return a;
    }
}
