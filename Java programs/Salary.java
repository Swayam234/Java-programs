import java.util.*;
class Salary
{
    public static void main(String args[])
    {
        float basic,HRA,DA,Bonus,Com,tax,Gross_salary,Net_salary;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the basic salary:");
        basic=sc.nextFloat();
        System.out.print("Enter the HRA:");
        HRA=sc.nextFloat();
        System.out.print("Enter the DA:");
        DA=sc.nextFloat();
        System.out.print("Enter the bonus:");
        Bonus=sc.nextFloat();
        System.out.print("Enter the commission:");
        Com=sc.nextFloat();
        System.out.print("Enter the tax:");
        tax=sc.nextFloat();
        Gross_salary=basic+HRA+DA+Bonus+Com;
        System.out.println("The Gross salary is:"+Gross_salary);
        Net_salary=Gross_salary-tax;
        System.out.println("The Net salary is:"+Net_salary);
        if(Net_salary<=10000)
        {
            System.out.println("Others");
        }
        else if(Net_salary>10000 && Net_salary<=25000)
        {
            System.out.println("clerk");
        }
        else if(Net_salary>25000 && Net_salary<=40000)
        {
            System.out.println("staff");
        }
        else if(Net_salary>40000)
        {
            System.out.println("manager");
        }                      
    }
}
