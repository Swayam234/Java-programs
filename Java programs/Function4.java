import java.util.*;
class Function4
{
    public static void main(String args[])
    {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        Function4 f3 = new Function4();
        System.out.print("Enter the first number:");
        n1=sc.nextInt();
        System.out.print("Enter the second number:");
        n2=sc.nextInt();
        f3.sum(n1,n2);
        
    }
    void sum(int x,int y)
    {
        System.out.println("The sum is: "+(x+y));
    }
}