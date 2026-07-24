
import java.util.*;
public class BuySellStock {
    public int remove(int[] nums, int n) {
        int maxi=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]-nums[i]>maxi){
                    maxi=Math.max(maxi,nums[j]-nums[i]);
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BuySellStock re=new BuySellStock();
        int element=re.remove(arr,n);
        System.out.println("Maximum:"+element);
    }
}
