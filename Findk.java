import java.util.*;
public class Findk {
    /*public void kkk(int[] arr,int k){
        int n=arr.length;
        Arrays.sort(arr);
        if(k<n && k>=1){
            System.out.println("Number"+arr[k-1]);
        }
        else{
            System.out.println("Error");
        }
    } */
    public int kkk(int[] arr,int k){
        if (k < 1 || k > arr.length) {
            System.out.println("Invalid value of k");
            return -1;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int val : arr) {
            pq.add(val);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter K:");
        int k=sc.nextInt();
        System.out.println("Enter Total Number Required:");
        int n=sc.nextInt();
        System.out.println("Enter Elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Findk dd = new Findk();
        int ans = dd.kkk(arr, k);
        System.out.println(k + "th smallest element is: " + ans);
    }
}