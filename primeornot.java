package seventhday;

public class primeornot {

    static boolean isprime(int a)
    {
        int i=1;
        if (a<=0)
        {
            return false;
        }
        if (a==2 && a==1)
        {
           return true;
        }
        for ( i=2;i<a;i++)
        {
            if (a%i==0)
            {
               return false;
            }
        }
            return true;
    }
    public static void main(String[] args) {
       for (int i=1;i<=100;i++)
       {
           if (isprime(i))
           {
               System.out.print(i+" ");
           }

       }
    }
}
