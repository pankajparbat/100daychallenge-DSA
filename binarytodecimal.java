package seventhday;

public class binarytodecimal {
    public  static void decimal(int a)
    {
        int num=a;
        int deci=0;
        int pow=0;
        while (a>0)
        {
            int rem=a%10;
            deci=deci+rem*(int)Math.pow(2,pow);
            pow++;
            a=a/10;
        }
        System.out.println(deci);
    }

    public static void main(String[] args) {
        decimal(10);

    }
}
