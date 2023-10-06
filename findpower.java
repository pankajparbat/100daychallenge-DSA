package seventhday;

public class findpower {
    public static void main(String[] args) {
        int a=5,b=3;
        System.out.println(power(a,b));
    }
    public static int power(int a,int b)
    {
        if (b==0){
            return 1;
        } else if (b==1) {
            return a;
        }
        else {
            return a*power(a,b-1);
        }

    }

}
