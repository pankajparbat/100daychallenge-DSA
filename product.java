package seventhday;

import java.util.Scanner;

public class product {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=3,b=5;
        System.out.println(product(a,b));
    }
   static int product(int a,int b)
    {
      int prodi=a*b;
      return prodi;
    }
}
