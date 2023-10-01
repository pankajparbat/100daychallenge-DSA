import java.util.Scanner;

public class find_bit {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no ");
        long n=sc.nextLong();
        int count=1;
        while(n>0)
        {
            if(((n&1)!=0))
            {

            }
            else if((n&1)==0)
            {
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
}
