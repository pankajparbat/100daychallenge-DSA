package seventhday;

import java.util.Arrays;

public class primenumber {
    public static void main(String[] args) {
        boolean isPrime[]=seiveoferatosthe(20);
        for (int i=0;i<=20;i++)
        {
            System.out.println(i+" "+isPrime[i]);
        }

    }
    static boolean [] seiveoferatosthe(int n)
    {
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=true;
        for (int i=2;i*i<=n;i++)
        {
            for (int j=2*i;j<=n;j+=i)
        {
            isPrime[j]=false;
        }
        }//C:\Users\lenovo\IdeaProjects\dsastart100daychalleng100\seventhday
        return isPrime;
    }
}
