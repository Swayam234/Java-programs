import java.util.*;
class String1
{
    public static void main(String args[])
    {
        String s;
        int i,v=0;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                v++;
        }
        System.out.println("The number of vowels are:"+v);
   }
} 