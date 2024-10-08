// package BinarySearch.Easy;

import java.util.Scanner;

public class BSSearchRotatedSortedArr_1 {
    public static int Search(int[] arr,int target){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(high+low)/2;

            //check arr[mid] is target 
            if(arr[mid]==target)  return mid;
            
            //left half is sorted
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]) high=mid-1;
                    else low=mid+1;
            }
            else{
                if(arr[mid]<=target && target<=arr[high]) low=mid+1;
                else high=mid-1;
            }
        }
        return -1;
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
