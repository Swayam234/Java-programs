class StringPattern2
{
    public static void main(String args[])
    {
        int i,j,l;
        String s="GENIUS";
        l=s.length();  
        for(i=0;i<l;i++)   
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}