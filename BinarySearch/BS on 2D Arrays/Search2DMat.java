//package BinarySearch.BS on 2D Arrays;
import java.util.Scanner;
public class Search2DMat {
          
    public static boolean searchMatrix(int[][] matrix, int target){
    int m=matrix.length;
    int n=matrix[0].length;

    int low=0,high=m*n-1;

    while(low<=high){

        int mid=(low+high)/2;
        int midElement=matrix[mid/n][mid%n];
        if(midElement==target) return true;
        else if(midElement<target) low=mid+1;
        else high=mid-1;
    }

    return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        int n=sc.nextInt();
        System.out.println("enter no of cols");
        int m=sc.nextInt();
        int[][] nums=new int[n][m];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        int target;
        System.out.println("enter target");
        target=sc.nextInt();
        System.out.println(searchMatrix(nums,target));
        sc.close();
    }
}
