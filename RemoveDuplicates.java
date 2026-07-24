import java.util.*;

public class RemoveDuplicates {

    public int rd(int[] nums) {
        int left=0,left1=0;
        int n=nums.length;
        Arrays.sort(nums);
        while(left1<n){
            if(nums[left1]!=nums[left]){
                left++;
                nums[left]=nums[left1];
                left1++;
            }
            left1++;
        }
        for(int num:nums){
            System.out.print(num+",");
        }
        return left+1;
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
/*class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int i = 0;
        for (int num : set) {
            nums[i++] = num;
        }

        return set.size();
    }
} */