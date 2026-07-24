import java.util.*;
public class MoveZeroes {
    public void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int move(int[] nums) {
        int i=0,j=0;
        int n=nums.length;
        while(j<n){
            if(nums[j]!=0){
                swap(nums,i,j);
                i++;
            }
            j++;
        }
        for(int ns:nums){
            System.out.print(ns+",");
        }
        System.out.println();
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        MoveZeroes re=new MoveZeroes();
        int element=re.move(arr);
        System.out.println(element);
    }
}