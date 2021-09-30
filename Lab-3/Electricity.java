import java.util.*; 
class Electricity {
     public static void main(String[]args)
     {
        double amount = 200;
        Scanner sc = new Scanner (System.in);
        double units = sc.nextDouble(); 
        if(units <= 100)
        amount += units*4;
        else if(units> 100 && units<=200)
        amount += 400 + (units-100)*6;
        else if(units>200)
        amount += 1000 + (units-200)*7;
        System.out.println(amount);
        sc.close();
     }
    
}
