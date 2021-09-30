import java.util.*;

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void details() {
        System.out.println(title + "  " + author + "  " + price);
    }
}

class Details {    
    public static void main(String[] args) {
        String t, a;
        double p;
        Scanner sc = new Scanner(System.in);
        Book books[] = new Book[2];
        for (int i = 1; i <= 2; i++) {
            System.out.println("Title of Book " + i);
            t = sc.nextLine();
            System.out.println("Author of Book " + i);
            a = sc.nextLine();
            System.out.println("Price of Book " + i);
            p = sc.nextDouble();
            books[i - 1] = new Book(t, a, p);
            sc.nextLine();
        }
        System.out.println("TITLE AUTHOR PRICE");
        for (int i = 0; i < 2; i++) {
            books[i].details();
        }
        sc.close();
    }
}
