import java.util.*;

class Lines {
    public static void main(String[] args) {
        int a1, b1, c1, a2, b2, c2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coefficients of the first line :");
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.print("Enter the coefficients of the second line :");
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        c2 = sc.nextInt();
        if ((a1 == 0 && a2 == 0) || (b1 == 0 && b2 == 0))
            System.out.println("Invalid coefficients");
        else {
            if ((a1 * b2) == (a2 * b1)) {
                if ((b2 * c1) != (b1 * c2))
                    System.out.println("The lines are parallel");
                else
                    System.out.println("The lines are intersecting");
            } else {
                System.out.println("The lines are intersecting");
            }
        }
        sc.close();
    }

}
