package seventhday;

public class findoutpower {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int res=1;
        while(b>0)
        {
            if ((b&1)!=0)
            {
                res=res*a;

            }
            a=a*a;
            b=b>>1;
        }
        System.out.println(res);
    }
}
