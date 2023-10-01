import java.util.Scanner;
//https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1?page=1&difficulty[]=-1&difficulty[]=0&category[]=Bit%20Magic&sortBy=submissions
public class power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value ");
        long n= sc.nextLong();
        int power=0;
        while((long)Math.pow(2,power )<=n)

        {
            if((long)Math.pow(2,power )==n)
            {
                System.out.println("Yes");
            }
            power++;
        }
        System.out.println("No");
    }
}
