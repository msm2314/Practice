import java.util.*;
public class FibonacciDP {
    /*public int fibtopdown(int[] dp,int n){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        dp[n]= fibtopdown(dp,n-1)+ fibtopdown(dp,n-2);
        return dp[n];
    }
    public int fibbottomup(int[] dp,int n){
        if(n<=1){
            return n;
        }
        dp[1]=1;
        dp[0]=0;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }*/
    public int fibspacecomplex(int n){
        if(n<=1){
            return n;
        }
        int prev1=1;
        int prev2=0;
        for(int i=2;i<=n;i++){
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
        
    }
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        FibonacciDP fdp=new FibonacciDP();
        int n1=fdp.fibspacecomplex(n);
        System.err.println(n1);
    }
    /*public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        FibonacciDP fdp=new FibonacciDP();
        int n1=fdp.fibbottomup(dp,n);
        System.err.println(n1);
    }*/
}
// 0 1 1 2 3 5 8 13 21