package seventhday;

public class factorial {
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
        System.out.println(facto(b));
    }
}
