import java.util.*;
class StringPattern1
{
    public static void main(String args[])
    {
        int i,l;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");  
        s=sc.next();
        l=s.length();  
        for(i=0;i<l;i++)
        {
            System.out.println(s.charAt(i));
        }  
    }
}
