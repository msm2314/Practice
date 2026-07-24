import java.util.*;
public class RemoveElement {
    public void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int remove(int[] nums, int val) {
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            if (nums[left] == val) {
                while (left <= right && nums[right] == val) {
                    right--;
                }
                if (left <= right) {
                    swap(nums, left, right);
                    right--;
                }
            }
            left++;
        }
        return left;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Value:");
        int val=sc.nextInt();
        RemoveElement re=new RemoveElement();
        int element=re.remove(arr,val);
        System.out.println("Unique Number"+element);
    }
}
