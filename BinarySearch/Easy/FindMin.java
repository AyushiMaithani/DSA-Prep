import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMin {
    public static int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MAX_VALUE;
    
        while(low<=high){
            int mid=(low+high)/2;

        //whole array sorted
        if(nums[low]<=nums[high]){
            ans=Math.max(ans,nums[low]);
            break;
        }
        
        //left sorted
            if(nums[low]<=nums[mid]){
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }

            //right sorted
            else{
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers");
        List<Integer> numsList = new ArrayList<>();
        while (sc.hasNext()) 
                numsList.add(sc.nextInt());
                int[] nums = new int[numsList.size()];
                for (int i = 0; i < numsList.size(); i++) {
                    nums[i] = numsList.get(i);
                }
        System.out.println(findMin(nums));
        sc.close();
    }
}
