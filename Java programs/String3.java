import java.util.*;
class String3
{
    public static void main(String args[])
    {
        int i;
        String s;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(Character.isUpperCase(ch)==true)
            {
                System.out.print(Character.toLowerCase(ch));
            }
            else
            {
                System.out.print(Character.toUpperCase(ch));
            }
        }
    }
}
