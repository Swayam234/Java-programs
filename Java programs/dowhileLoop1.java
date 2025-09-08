import java.util.*;
class dowhileLoop1
{
    public static void main(String args[])
    {
        int choice,discount,r,q,amount,Net_amount;
        Scanner sc = new Scanner(System.in);
        do
        {
        System.out.println("Discount");
        System.out.println("1.Bag");
        System.out.println("2.Bottle");
        System.out.println("3.Shoes");
        System.out.println("4.Shirt");
        System.out.println("5.Exit");
        System.out.print("Enter your choice:");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:System.out.print("Enter the quantity of the bag:");
                   q=sc.nextInt();
                   System.out.print("Enter the rate of the bag:");
                   r=sc.nextInt();
                   amount=r*q;
                   System.out.println("The amount is:"+amount);
                   discount=amount*10/100;
                   System.out.println("The discount is:"+discount);
                   Net_amount=amount-discount;
                   System.out.println("The Net amount is:"+Net_amount);
                   break;
            case 2:System.out.print("Enter the quantity of the  bottle:");
                   q=sc.nextInt();
                   System.out.print("Enter the rate of the  bottle:");
                   r=sc.nextInt();
                   amount=r*q;
                   System.out.println("The amount is:"+amount);
                   discount=amount*12/100;
                   System.out.println("The discount is:"+discount);
                   Net_amount=amount-discount;
                   System.out.println("The Net amount is:"+Net_amount);
                   break; 
            case 3:System.out.print("Enter the quantity of the shoes:");
                   q=sc.nextInt();
                   System.out.print("Enter the rate of the shoes:");
                   r=sc.nextInt();
                   amount=r*q;
                   System.out.println("The amount is:"+amount);
                   discount=amount*20/100;
                   System.out.println("The discount is:"+discount);
                   Net_amount=amount-discount;
                   System.out.println("The Net amount is:"+Net_amount);
                   break;
            case 4:System.out.print("Enter the quantity of the shirt:");
                   q=sc.nextInt();
                   System.out.print("Enter the rate of the shirt:");
                   r=sc.nextInt();
                   amount=r*q;
                   System.out.println("The amount is:"+amount);
                   discount=amount*18/100;
                   System.out.println("The discount is:"+discount);
                   Net_amount=amount-discount;
                   System.out.println("The Net amount is:"+Net_amount);
                   break;
            case 5:break;
            default:System.out.println("Invalid");               
        }
    }while(choice!=5);
 }
}
