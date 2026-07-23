import java.util.*;

public class RemoveDuplicates {

    public int rd(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }

        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        return i + 1;
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