import java.util.*;
public class ReverseString {
      public void swap(char[] arr,int a,int b){
        char temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void strrev(String str){
        int n=str.length();
        int i=0;
        int left=0;
        char arr[]=str.toCharArray();
        while(i<=n){
            if(i==n || arr[i]==' '){
                int l=left;
                int r=i-1;
                while(l<r){

                    swap(arr,l,r);
                    r--;
                    l++;
                }
                left=i+1;
            }
            i++;
        }
        for(char nn:arr){
            System.out.print(nn);
        }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        ReverseString rs=new ReverseString();
        rs.strrev(str);
    }
}
