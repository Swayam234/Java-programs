import java.util.*;
class String2
{
    public static void main(String args[])
    {
        String s,lc;
        int i,len;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        s=sc.next();
        lc=s.toLowerCase();
        len=lc.length();
        for(i=0;i<len;i++)
        {
            ch=lc.charAt(i);
            if(ch == 'e')
              System.out.print("*");
            else
              System.out.print(ch);
        }
    }
}
