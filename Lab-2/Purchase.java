import java.util.*;

class Shop {
    int itemCode;
    String itemName;
    int itemCost;
    int itemCount;

    Shop(int code, String name, int cost, int count) {
        itemCode = code;
        itemName = name;
        itemCost = cost;
        itemCount = count;
    }

    void display() {
        System.out.println("ItemCode : " + itemCode);
        System.out.println("ItemName : " + itemName);
        System.out.println("ItemCost : " + itemCost);
        System.out.println("ItemCount : " + itemCount);
    }

    boolean check(int quantity, int code) {
        if (code == itemCode) {
            if (quantity <= itemCount) {
                return true;
            } else {
                System.out.println("SORRY ONLY " + itemCount + " ITEMS AVAILABLE");
                return false;
            }
        } else {
            System.out.println("PLEASE ENTER CORRECT ITEM CODE");
            return false;
        }
    }

    void orderDetails(int quantity) {
        System.out.println("ItemCode : " + itemCode);
        System.out.println("ItemName : " + itemName);
        System.out.println("ItemCount : " + quantity);
        System.out.println("Cost : " + (quantity * itemCost));
        itemCount -= quantity;
    }
}

class Purchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code;
        String name;
        int cost;
        int count;
        System.out.println("Enter the Details of the Product In the Store");
        code = sc.nextInt();
        name = sc.next();
        cost = sc.nextInt();
        count = sc.nextInt();
        Shop Item = new Shop(code, name, cost, count);
        Item.display();
        int purchase_code, purchase_quant;
        while (true) {
            System.out.println("Enter the Code and Quantity of the Item to be purchased");
            purchase_code = sc.nextInt();
            purchase_quant = sc.nextInt();
            if (Item.check(purchase_quant, purchase_code)) {
                System.out.println("Order Details");
                Item.orderDetails(purchase_quant);
                System.out.println("Current Availability");
                Item.display();
                break;
            } else {
                continue;
            }
        }

        sc.close();
    }
}