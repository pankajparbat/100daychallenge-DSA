package seventhday;

import java.util.Scanner;

public class printthestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solution(n);
    }
    public static void solution(int a)
    {
        while (1<=a && a<=100)
        {
           if (a%2!=0)
           {
               System.out.println("Weird");
               break;
           } else if (a%2==0 && a>=2 && a<=5 ) {
               System.out.println("Not Weird");
               break;
           }
           else if (a%2==0 && a>=6 && a<=20 ) {
               System.out.println("Weird");
               break;
           }
           else if (a%2==0 && a>20 ) {
               System.out.println("Not Weird");
               break;
           }

        }
    }
}
