import java.util.*;
class Function10
{
    public static void main(String args[])
    {
        int b;
        String name,result;
        Scanner sc = new Scanner(System.in);
        Function10 f9 = new Function10();
        System.out.print("Enter the name of a person: ");
        name=sc.next();
        System.out.print("Enter the age of a person: ");
        b=sc.nextInt();
        result=f9.status(b);
        System.out.println("The status of the person is: "+result);
    }
    String status(int a)
    {
        String s;
        if(a<18)
        {
           s="minor";
        }
        else
        {
           s="major";
        }
        return s;
    }
}