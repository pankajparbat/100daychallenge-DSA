package seventhday;

public class print_maxtotal_of_sub_arrays {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printpar(arr);
    }
    public static void printpar(int arr[])
    {
        int curat=0;
        int max=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++)
        {
            int start=i;
            for (int j=i;j< arr.length;j++)
            {

                int end=j;
                for (int k=start;k<= end;k++)
                {
                 //  System.out.print(arr[k]+" ");
                    curat=curat+arr[k];

                }
                if (max<curat)
                {
                    max=curat;
                }

              //  System.out.println();
            }
           // System.out.println();

        }
        System.out.print("Maximum number "+max);
    }
}
