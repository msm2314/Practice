import java.util.*;
public class Maxof3 {
    //Brute Force
    /*public void maxi(int[] nums){
        int p=0;
        int r=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    p=nums[i]*nums[j]*nums[k];
                    r=Math.max(p,r);
                }
            }
        }
        System.out.println(r);
    }*/
   public void maxi(int[] nums){
        int n=nums.length;
        Arrays.sort(nums);
       // [0,1,2,3,4,5] n=6
        if(n>=3)System.out.println(nums[n-3]);
        else System.out.println("Invalid");
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Maxof3 d=new Maxof3();
        d.maxi(arr);
    }
}
