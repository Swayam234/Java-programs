import java.util.*;
class Function6
{
    public static void main(String args[])
    {
        int r,q;
        Scanner sc = new Scanner(System.in);
        Function6 f5 = new Function6();
        System.out.print("Enter the rate of the product: ");
        r=sc.nextInt();
        System.out.print("Enter the quantity of the product: ");
        q=sc.nextInt();
        f5.amount(r,q);  
    }
    void amount(int x,int y)
    {
        System.out.println("The amount is:"+(x*y));
    }
}