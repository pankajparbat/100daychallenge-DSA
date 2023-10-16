package seventhday;

public class find_out_total_pairs {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printpar(arr);
    }
    public static void printpar(int arr[])
    {
        int tp=0;
        for (int i=0;i< arr.length;i++)
        {
            int cur=arr[i];
            for (int j=i;j< arr.length;j++)
            {
                tp++;
            }

        }
        System.out.println(tp);
    }
}
