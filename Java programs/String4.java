import java.util.*;
class String4
{
    public static void main(String args[])
    {
        int i,u=0,l=0,d=0;
        String s;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(Character.isUpperCase(ch)==true)
                u++;
            if(Character.isLowerCase(ch)==true)
               l++;
            if(Character.isDigit(ch)==true)
               d++;
        }
        System.out.println("The number of uppercase letters:"+u);
        System.out.println("The number of lowercase letters:"+l);
        System.out.println("The number of digits in the string:"+d);
        
    }
}
