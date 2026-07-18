import java.util.*;

class Order123 {
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void sort(int[] arr) {{
        int n=arr.length;
        int low=0,high=n-1,mid=0;
        while (mid <= high) {
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    /*public void sort(int[] arr) {
        int c0=0,c1=0,c2=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                c0++;
            }
            else if(arr[i]==1){
                c1++;
            }
            else{
                c2++;
            }
        }  //  2z 2 ones  1 2s
        System.out.println(c0+","+c1+","+c2);
        for(int i=0;i<c0;i++){   //0 to 1     
            arr[i]=0;
        }
        for(int i=c0;i<c1+c0;i++){  //2 to 3
            arr[i]=1;
        }
        for(int i=c1+c0;i<c0+c1+c2;i++){ //4 to 5
            arr[i]=2;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        /* Better idea to place the numbers
        int idx = 0;
      
        // place all the 0s
        for (int i = 0; i < c0; i++)
            arr[idx++] = 0;

        // place all the 1s
        for (int i = 0; i < c1; i++)
            arr[idx++] = 1;

        // place all the 2s
        for (int i = 0; i < c2; i++)
            arr[idx++] = 2; */
    }
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Order123 d=new Order123();
        d.sort(arr);
        sc.close();
    }
}