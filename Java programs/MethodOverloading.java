import java.util.*;
class MethodOverloading
{
    public static void main(String args[])
    {
    int n,n1,n2;
    char c,d;
    String s1,s2;
    Scanner sc=new Scanner(System.in);
    MethodOverloading m = new MethodOverloading();
    System.out.print("Enter the integer: ");
    n=sc.nextInt();
    System.out.print("Enter a character: ");
    c=sc.next().charAt(0);
    System.out.print("Enter the integer: ");
    n1=sc.nextInt();
    System.out.print("Enter the integer: ");
    n2=sc.nextInt();
    System.out.print("Enter a character: ");
    d=sc.next().charAt(0);
    System.out.print("Enter a string: ");
    s1=sc.next();
    System.out.print("Enter a string: ");
    s2=sc.next();
    m.num_cal(n,c);
    m.num_cal(n1,n2,d);
    m.num_cal(s1,s2);
    }
    void num_cal(int num,char ch)
    {
        if(ch=='s')
        {
            System.out.println("The square of the integer is: " +(num*num));
        }
        else
        {
            System.out.println("The cube of the integer is: " +(num*num*num));
        }
    }
    void num_cal(int a,int b,char ch)
    {
        if(ch=='p')
        {
            System.out.println("The product of the  two integers is: " +(a*b));
        }
        else
        {
            System.out.println("The addition of the  two integers is: " +(a+b));
        }
    }
    void num_cal(String str1,String str2)
    {
        if(str1.equals(str2))
        {
            System.out.println("The Strings are equal");
        }
        else
        {
            System.out.println("The Strings are not equal");
        }
    }  
}