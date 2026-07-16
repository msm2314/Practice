import java.util.*;
public class MaxMin {
    /*public int max(int[] arr,int n){
        n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i]<arr[j]){
                    max=j;
                }
            }
        }
        return max;
    }*/
    public int[] max(int[] arr){
        int n=arr.length;
        int max=0;
        int min=0;
        for(int i=1;i<n;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
            if(arr[min]>arr[i]) min=i;
        }
        return new int[]{ arr[max] , arr[min] };
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MaxMin d=new MaxMin();
        int[] i=d.max(arr);
        System.out.println("Max:"+i[0]+" Min"+i[1]);
    }
}