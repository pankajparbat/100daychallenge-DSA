package seventhday;

public class sum_of_array {

    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
       maximumarray(arr);
        //kadanes(arr);
    }
    public static void kadanes(int arr[])
    {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for (int i=0;i< arr.length;i++)
        {
            cs=cs+arr[i];
            if (cs<0)
            {
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Maximum sum is "+ms);
    }
    public static void maximumarray(int arr[])
    {
        int curransum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int [arr.length];

        prefix[0]=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int i=0;i< arr.length;i++)
        {
            int start=i;
            for (int j=i;j< arr.length;j++)
            {
                int end=j;
                curransum=0;

                curransum=start==0?prefix[end]:prefix[end]-prefix[start-1];
              //  System.out.println(curransum);
                if (maxSum<curransum)
                {
                    maxSum=curransum;
                }
            }
            System.out.println();
        }
        System.out.println("the maximum value is "+maxSum);
    }
}
