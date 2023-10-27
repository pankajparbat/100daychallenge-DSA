package seventhday;

import java.util.Arrays;

public class reversethearray {
    public static void main(String[] args) {
        int []arr={5,6,8,9,10,11,12,13,14};
        int []arr1={1,2,3,5,6,7,8};
        //reverse(arr,3,7);
       // sum(arr);
        //sumfromstartoend(arr,3,6);
        findoutmissingnumberindex(arr1);
    }
    public static void reverse(int []arr,int start,int end)
    {
        while (start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void sum(int []arr)
    {
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    public static void sumfromstartoend(int []arr,int start,int end)
    {
        int sum=0;
        for (int i=start;i<end;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    public static void findoutmissingnumberindex(int []arr)
    {//int []arr1={1,2,3,5,6,7,8};
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i]!=(i+1))
            {
                System.out.println(i+1);
                break;
            }

        }
    }
}
