import java.util.*;
class Shop {
    public static void main(String[]args)
    {
        int unit_p, quant;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit Price : ");
        unit_p = sc.nextInt();
        System.out.print("Enter Quantity : ");
        quant = sc.nextInt();
        int discount;
        if(quant < 100)
        discount = 5;
        else if(quant>=100 && quant<=150)
        discount = 15;
        else
        discount = 20;
        int discount_amt = (int)Math.floor(quant*unit_p*discount/100.0);
        System.out.println("Revenue before discount : $" + (unit_p * quant));
        System.out.println("Discount Amount("+ discount +"%) : $" + discount_amt);
        System.out.println("Revenue after discount : $" + ((unit_p * quant) - discount_amt));
        sc.close();
    }
    
}
