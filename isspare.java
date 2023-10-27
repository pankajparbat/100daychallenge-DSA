package seventhday;

public class isspare {
    public static void main(String[] args) {
        int n=3;
        if((n&n<<1)==0)
        {
            System.out.println("this is isspare");
        }
        else
        {
            System.out.println("this is not isspare");
        }
    }
}
