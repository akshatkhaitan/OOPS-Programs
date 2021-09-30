import java.util.*;
public class InchtoMeter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a value for inch: ");
        double inch = sc.nextDouble();
        double meter = inch * 0.0254 ;
        System.out.println(inch + " inches is " + meter + " meters.");
        sc.close();
    }
}