import java.util.*;
class Function9
{
    public static void main(String args[])
    {
        int bonus,basic_sal,tax,N_sal,result;
        Scanner sc = new Scanner(System.in);
        Function9 f8 = new Function9();
        System.out.print("Enter the basic salary:");
        basic_sal=sc.nextInt();
        System.out.print("Enter the bonus:");
        bonus=sc.nextInt();
        System.out.print("Enter the tax:");
        tax=sc.nextInt();
        result=f8.Nsal(basic_sal,bonus,tax);
        System.out.println("The Net salary is:"+result);  
    }
    int Nsal(int a, int b,int c)
    {
        return ((a+b)- c);
    }
}