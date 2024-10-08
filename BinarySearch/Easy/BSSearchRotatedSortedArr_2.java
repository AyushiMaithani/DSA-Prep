import java.util.Scanner;
public class BSSearchRotatedSortedArr_2 {
    public static boolean Search(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==target) return true;

            //skip duplicates
            if(arr[low]==arr[mid] &&  arr[high]==arr[mid]){
                low++;
                high--;
                continue;
            }

            //left half is sorted
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[high]) high=mid-1;
                else low=mid+1;
            }
            //right half is sorted
            else{
                if(arr[mid]<=target && target<=arr[high]) low=mid+1;
                else high=mid-1;
            }
            }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target;
        System.out.println("enter target");
        target=sc.nextInt();
        System.out.println(Search(nums,target));
        sc.close();
    }
}
