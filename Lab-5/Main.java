import java.util.*;
class MenuItem {
    protected int price;
    void setPrice(int price)
    {
        this.price = price;
    }
    int getPrice()
    {
        return this.price;
    }
}
class Combo extends MenuItem {
    private int comboPrice(MenuItem i1, MenuItem i2, MenuItem i3)
    {
       int smallet = (i1.getPrice() < i2.getPrice() ? (i1.getPrice() < i3.getPrice() ? i1.getPrice(): i2.getPrice()): (i2.getPrice() < i3.getPrice() ? i2.getPrice() : i3.getPrice()));
       int sum = i1.getPrice() + i2.getPrice() + i3.getPrice() ;
       return (sum - smallet); 
    }
    void makeCombo()
    {
        MenuItem i1 = new MenuItem();
        MenuItem i2 = new MenuItem();
        MenuItem i3 = new MenuItem();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of first Item : ");
        i1.price = sc.nextInt();
        System.out.println();
        System.out.print("Enter price of Second Item : ");
        i2.price = sc.nextInt();
        System.out.println();
        System.out.print("Enter price of Third Item : ");
        i3.price = sc.nextInt();
        System.out.println();
        int price_without_combo = i1.price + i2.price + i3.price ;
        int price_with_combo = comboPrice(i1,i2,i3);
        int saved = price_without_combo - price_with_combo ;
        System.out.println("Total without combo : Rs." + price_without_combo);
        System.out.println("Total with combo : Rs." + price_with_combo);
        System.out.println("You Save: Rs." + saved);
        sc.close();
    }
}
public class Main {
    public static void main(String[] args)
    {
        Combo c = new Combo();
        c.makeCombo();
    }
}
