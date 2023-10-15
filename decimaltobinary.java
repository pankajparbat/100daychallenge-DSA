package seventhday;

public class decimaltobinary {
    public  static void baynare(int n)
    {
        int num1=n;
        int bayn1=0;
        int pow=0;
        while (n>0)
        {
            int rem1=n%2;
            bayn1=bayn1+(rem1*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println(bayn1);
    }
    public static void main(String[] args) {
        baynare(8);
    }
}
