import java.util.*;
public class UnionIntersection {
    public void rr(int[] arr1,int[] arr2){
        Set<Integer> ss=new HashSet<>();
        int n1=arr1.length;
        int n2=arr2.length;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    ss.add(arr1[i]);
                    ss.add(arr2[j]);
                }
            }
        }
        System.out.println(ss);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("n1:");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("n2:");
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        UnionIntersection d=new UnionIntersection();
        d.rr(arr1,arr2);
    }
}
