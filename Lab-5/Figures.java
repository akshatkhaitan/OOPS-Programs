import java.util.*;
class Figure {
    int dim1 , dim2;
    Figure(int x, int y)
    {
        dim1 = x;
        dim2 = y;
    }
}
class Rectangle extends Figure {
    Rectangle(int side1, int side2)
    {
        super(side1, side2);
    }
    int getArea()
    {
        return dim1*dim2;
    }
}
class Triangle extends Figure{
    Triangle(int base, int height)
    {
        super(base, height);
    }
    int getArea()
    {
        return (dim1*dim2)/2;
    }
}
public class Figures {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 0)
        {
            int side1, side2;
            side1 = sc.nextInt();
            side2 = sc.nextInt();
            Rectangle ob = new Rectangle(side1, side2);
            System.out.println(ob.getArea());
        }
        else
        {
            int base, height;
            base = sc.nextInt();
            height = sc.nextInt();
            Triangle ob = new Triangle(base, height);
            System.out.println(ob.getArea()); 
        }
        sc.close();
    }
}
