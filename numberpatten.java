package seventhday;

public class numberpatten {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
          int j=1;
            for (int k=5;k>=i;k--)
            {
                System.out.print(j+" ");
                j++;
            }

            System.out.println();
        }
    }
}
