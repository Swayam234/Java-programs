import java.util.*;
class Function8
{
    public static void main(String args[])
    {
        int result,a,b;
        Scanner sc = new Scanner(System.in);
        Function8 f7 = new Function8();
        System.out.print("Enter number 1:");
        a=sc.nextInt();
        System.out.print("Enter number 2:");
        b=sc.nextInt();
        result=f7.sum(a,b);
        System.out.println("The sum is: "+result);  
    }
    int sum(int x ,int y)
    {
        return (x+y);
    }
}