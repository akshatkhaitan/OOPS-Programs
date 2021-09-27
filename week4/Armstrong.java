public class Armstrong {
    static boolean arm(int n)
    {
        int copy = n, sum = 0;
        while(copy > 0)
        {
            sum += Math.pow(copy % 10 , 3);
            copy /= 10;
        }
        if(sum == n)
        return true;
        else
        return false;
    }
    public static void main(String [] args)
    {
        for(int i = 100; i<= 500 ; i++)
        {
            if(arm(i))
            System.out.println(i);
        }
    }
}
