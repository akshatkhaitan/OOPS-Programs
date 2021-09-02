import java.util.*;
public class Swap {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input for x: ");
        int x = sc.nextInt();
        System.out.println("Input for y: ");
        int y = sc.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        sc.close();
    }
}
