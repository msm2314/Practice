import java.util.*;

public class RemoveDuplicates {

    public int rd(int[] nums) {
        int i=0,j=0;
        int n=nums.length;
        Arrays.sort(nums);
        while(j<n){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        for(int num:nums){
            System.out.print(num+",");
        }
        return i+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        RemoveDuplicates rmm = new RemoveDuplicates();
        int k = rmm.rd(arr);
        System.out.println("Unique elements = " + k);
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        while(j<nums.length){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        return i+1;
    } 
}
