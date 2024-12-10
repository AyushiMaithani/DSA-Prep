package Sorting;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        } System.out.println("unsorted");
        for (int i : nums) {
         System.out.print(i+" ");
        }
        System.out.println("");

        for (int i = 0; i <=nums.length-2; i++) {
            int min=i;
            for (int j = i+1; j <=nums.length-1; j++) {
                if(nums[min]>nums[j]) min=j;
            }
            int temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
       System.out.println("sorted");
       for (int i : nums) {
        System.out.print(i+" ");
       }

    }
}
