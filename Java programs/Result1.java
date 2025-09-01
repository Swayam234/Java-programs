import java.util.*;
class Result1
{
    public static void main(String args[])
    {
        int marks;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of a student: ");
        name=sc.next();
        System.out.print("Enter the mark of a student: ");
        marks=sc.nextInt();
        if(marks>=35)
        {
            System.out.println("The student is passed");
        }
        else
        {
            System.out.println("The student is failed");
        }
        
    }
}
