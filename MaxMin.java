import java.util.*;
public class MaxMin {
    /*public int[] max(int[] arr){
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
    }*/
    public ArrayList<Integer> minmax(int[] arr){
        ArrayList<Integer> ar=new ArrayList<>();
        for(int nums:arr){
            ar.add(nums);
        }
        Collections.sort(ar);
        ArrayList <Integer> r=new ArrayList<>();
        r.add(ar.get(0));
        r.add(ar.get(ar.size()-1));
        return r;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MaxMin d=new MaxMin();
        ArrayList<Integer> s=d.minmax(arr);
        //int[] i=d.max(arr);
        System.out.println("Max:"+s.get(0)+" Min:"+s.get(1));
    }
}