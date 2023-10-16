package seventhday;

import java.util.Arrays;

public class reverse_the_array {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,10,12,14};
        int start=0,end=arr.length-1;
        while (start<=end){
            int temp=arr[start];
           arr[start] =arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
