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
    /*public ArrayList<Integer> max(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> s=new ArrayList<>();
        s.add(arr[0]);
        s.add(arr[n-1]);
        return s;
    }*/
   /*
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
    } */
    public ArrayList<Integer> mm(ArrayList<Integer> arr,int low,int high){
        ArrayList<Integer> a= new ArrayList<>(Arrays.asList(0, 0)); 
        if(low==high){
            a.set(0, arr.get(low));
            a.set(1, arr.get(high));
            return a;
        }
        if(high==low+1){
            if(arr.get(low)<arr.get(high)){
                a.set(0,arr.get(low));
                a.set(1,arr.get(high));
            }
            else{
                a.set(0,arr.get(high));
                a.set(1,arr.get(low));
            }
            return a;
        }
        int mid=(high+low)/2;
        ArrayList<Integer> left=mm(arr,low,mid);
        ArrayList<Integer> right=mm(arr,mid+1,high);
        int min = Math.min(left.get(0), right.get(0));
        int max = Math.max(left.get(1), right.get(1));
        a.set(0, min);
        a.set(1, max);

        return a;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        MaxMin d=new MaxMin();
        ArrayList<Integer> t = d.mm(arr, 0, n - 1);
        //int[] i=d.max(arr);
        System.out.println("Max:"+t.get(0)+" Min:"+t.get(1));
    }
}