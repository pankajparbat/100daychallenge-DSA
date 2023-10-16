package seventhday;

public class print_the_pair_in_array {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printpar(arr);
    }
    public static void printpar(int arr[])
    {
        for (int i=0;i< arr.length;i++)
        {
            int cur=arr[i];
            for (int j=i;j< arr.length;j++)
            {
                System.out.print("("+cur+","+arr[j]+")  ");
            }
            System.out.println();
        }
    }
}
