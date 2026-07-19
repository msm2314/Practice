import java.util.*;

class NegativePositive {
    public void sort(int[] arr) {
        int c1=0,c2=0;
        int n=arr.length;
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                arr2[c1++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                arr2[c1++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+",");
        }
    }
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        NegativePositive nn=new NegativePositive();
        nn.sort(arr);
    }
}