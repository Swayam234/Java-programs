class StringPattern3
{
    public static void main(String args[])
    {
        int i,j,l;
        String s="APPLE";
        l=s.length();    
        for(i=l;i>=0;i--)        
        {
            for(j=0;j<i;j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
