import java.util.*;
class PalindromicString
{
    public static void main(String args[])
    {
        String s,temp="";
        int i,len;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");  
        s=sc.next();
        len=s.length(); 
        for(i=len-1;i>=0;i--)
        {
            temp = temp + s.charAt(i);
        }
        if(temp.equals(s))
        {
            System.out.println("The string is a palindrome");
        }
        else
        {
            System.out.println("The string is not a palindrome");
        }
    }    
}
