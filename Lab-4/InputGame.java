import java.util.*;

public class InputGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prod = 1, count = 0, sum = 0;
        String temp;
        do {
            temp = sc.next();
            if (temp.equals("q"))
                break;
            count++;
            sum += Integer.parseInt(temp);
            prod *= Integer.parseInt(temp);
        } while (true);
        System.out.println("Average : " + (sum / (float) count));
        System.out.println("Product : " + prod);
        sc.close();
    }
}
