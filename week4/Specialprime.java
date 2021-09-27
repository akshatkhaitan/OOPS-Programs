import java.util.*;

public class Specialprime {

    public static boolean isPrime(int x) {
        int i;
        if (x == 1)
            return false;
        for (i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isSpecial(int n) {
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (isPrime(i))
                    count++;
                if ((i != (n / i)) && isPrime(n / i))
                    count++;
            }
        }
        if (count != 0 && n % count == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        int i;
        int count = 0;
        for (i = 2; i <= n; i++) {
            if (isSpecial(i))
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}
