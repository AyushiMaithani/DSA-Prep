package Hashing;
import java.util.*;

public class NumberHashingUsingHahmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int freq=0;
            if (map.containsKey(nums[i])) {
                freq=map.get(nums[i]);
            }
            freq++;
            map.put(nums[i],freq);
        }
        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int number;
            number = sc.nextInt();
            if (map.containsKey(number)) System.out.println(number+"->"+map.get(number));
            else System.out.println(number+"->"+"0");
        }
    }
}
