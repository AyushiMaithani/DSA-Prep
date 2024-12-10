package Hashing;
import java.util.Scanner;

public class NumberHashingUsingArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        //pre-store
        int hash[]=new int[13];
        for(int i=0;i<n;i++){
           hash[nums[i]]++;
        }

        System.out.println("enter target");
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            while (q-- != 0) {
                int number;
                number = sc.nextInt();
                //fetch
                System.out.println(hash[number]);
            }
        }

        
        sc.close();
    }
}
