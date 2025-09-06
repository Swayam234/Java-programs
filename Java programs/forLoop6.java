import java.util.*;
class forLoop6
{
    public static void main(String args[])
    {
        int i;
        float basic,DA,bonus,tax,GS,NS;
        String name;
        Scanner sc=new Scanner(System.in);
        for(i=1;i<=3;i++)
        {
            System.out.print("Enter the name:");
            name=sc.next();
            System.out.print("Enter the basic salary:");
            basic=sc.nextFloat();
            System.out.print("Enter the bonus:");
            bonus=sc.nextFloat();
            System.out.print("Enter the DA:");
            DA=sc.nextFloat();
            System.out.print("Enter the tax:");
            tax=sc.nextFloat();
            GS=basic+bonus+DA;
            System.out.println("The Gross salary is:"+GS);
            NS=GS-tax;
            System.out.println("The Net salary is:"+NS);
        }    
    }
}
