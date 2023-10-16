package seventhday;

public class binarysearch {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12};
        int key=8;
        int start=0,end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if ( arr[mid] ==key )
            {
                System.out.println("hello "+mid);
                break;
            } else if (arr[mid]<key) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
    }
}
