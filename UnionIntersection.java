import java.util.*;
public class UnionIntersection {
    public void intersection(int[] arr1,int[] arr2){
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
    public void union(int[] arr1,int[] arr2){
        Set<Integer> ss=new HashSet<>();
        for(int nums:arr1) ss.add(nums);
        for(int nums:arr2) ss.add(nums);
        System.out.println(ss);
    }
    /*public void union(int[] arr1,int[] arr2){
        Set<Integer> ss=new HashSet<>();
        for(int nums:arr1){
            ss.add(nums);
        }
        Set<Integer> ss1=new HashSet<>();
        for(int nums:arr2){
        if(ss.contains(nums)){
            ss1.add(nums);
        }
        }
    } */
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
        d.intersection(arr1,arr2);
        d.union(arr1,arr2);
    }
}


/*
public void union(int[] arr1, int[] arr2) {

        ArrayList<Integer> ans = new ArrayList<>();

        // Add unique elements from arr1
        for (int i = 0; i < arr1.length; i++) {

            if (!ans.contains(arr1[i])) {
                ans.add(arr1[i]);
            }
        }

        // Add unique elements from arr2
        for (int i = 0; i < arr2.length; i++) {

            if (!ans.contains(arr2[i])) {
                ans.add(arr2[i]);
            }
        }

        System.out.println("Union = " + ans);
        System.out.println("Count = " + ans.size());
    } */