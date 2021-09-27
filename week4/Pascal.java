import java.util.*;
public class Pascal {
    int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
    public static void main(String[] args)
    {
        Pascal ob = new Pascal();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number of Rows: ");
        int n = sc.nextInt();
        int i, j;
        for(i=0;i<5;i++)
        {
            for(j= 0; j< n-i; j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print(" " + ob.factorial(i)/ (ob.factorial(i-j)*ob.factorial(j)));
            }
            System.out.println();
        }
        sc.close();
    }
    
}
