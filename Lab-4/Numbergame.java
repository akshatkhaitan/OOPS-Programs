import java.util.*;

public class Numbergame {
    public static void main(String[] args) {
        int score = 100;
        Scanner sc = new Scanner(System.in);
        int input;
        int flag = 1;
            do {
                System.out.println("Input : ");
                input = sc.nextInt();
                if (input == 0) {
                    break;
                }
                score += input;
                if(score < 0)
                {
                    flag = 0;
                    break;
                }
            } while (true);
        if (flag == 1)
            System.out.println("Final Score : " + score);
        else
            System.out.println("You have lost the game");
        sc.close();
    }
}
