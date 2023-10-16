package seventhday;

public class print_min_total_of_sub_arrays {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        minimumarray(arr);
    }
    public static void minimumarray(int arr[])
    {
        int min=Integer.MAX_VALUE;
        int sum=0;
        for (int i=0;i< arr.length;i++)
        {
            for (int j=i;j< arr.length;j++)
            {
                for (int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    sum +=arr[k];
                }
                System.out.println();
                if (sum<min)
                {
                    min=sum;
                }
            }
            System.out.println();
        }
        System.out.println("the minimum value is "+min);
    }
}
