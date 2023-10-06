package seventhday;

public class findsum {
    public static void main(String[] args) {
        System.out.println(sum(4));
    }
   public static int sum(int n)
    {
        if (n==0)
        {
            return 0;
        } else if (n==1) {
            return 1;
        }
        else {
            return n + sum(n-1);
        }

    }
}
