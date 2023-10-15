package seventhday;

public class binomialcofficient {
    static int facto(int a)
    {
        int fact=1;
        for (int i=1;i<=a;i++)
        {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int b=5;
       int n=facto(b);
       int a=4;
       int r=facto(a);
       int diff=facto(b-a);
        System.out.println(n/(r*diff));

    }
}
