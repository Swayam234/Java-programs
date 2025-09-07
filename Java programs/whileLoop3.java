import java.util.*;
class whileLoop3
{
    public static void main(String args[])
    {
        int salary,sum=0,i=1;
        String name;
        Scanner sc=new Scanner(System.in);
        while(i<=3)
        {
            System.out.print("Enter the name:");
            name=sc.next();
            System.out.print("Enter the salary:");
            salary=sc.nextInt();
            sum=sum+salary;
            i++;  
        }
        System.out.println("The sum is:"+sum);
    }
}
