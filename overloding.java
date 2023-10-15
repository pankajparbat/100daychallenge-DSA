package seventhday;

public class overloding {
    public static int multi(int a,int b)
    {
        int mul=a*b;
        return mul;
    }
    public static int multi(int a,int b,int c)
    {
        int mul=a*b*c;
        return mul;
    }
    public static int multi(float a,float b)
    {
        int mul=(int)(a*b);
        return mul;
    }

    public static void main(String[] args) {
        System.out.println(multi(2,4));
        System.out.println(multi(2,4,8));
        System.out.println(multi(2.3f,4.4f));

    }
}
