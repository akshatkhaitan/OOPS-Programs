import java.util.*;
class A {
    interface NestedInterface {
        boolean isEven(int x);
    }
}

class B implements A.NestedInterface {
    public boolean isEven(int x) {
        if (x % 2 == 0)
            return true;
        else
            return false;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A.NestedInterface inf = new B();
        int input = sc.nextInt();
        if (inf.isEven(input))
            System.out.println("1");
        else
            System.out.println("0");
    sc.close();
    }
}
