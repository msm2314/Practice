import java.util.*;

class Order123 {
    public int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Order123 d=new Order123();
        int[] dd=d.sort(arr);
        for (int i = 0; i < dd.length; i++) {
            System.out.print(dd[i] + " ");
        }
    }
}