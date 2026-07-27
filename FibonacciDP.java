import java.util.*;
public class FibonacciDP {
    public int fib(int[] dp,int n){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        dp[n]= fib(dp,n-1)+ fib(dp,n-2);
        return dp[n];
    }
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        FibonacciDP fdp=new FibonacciDP();
        int n1=fdp.fib(dp,n);
        System.err.println(n1);
    }
}
// 0 1 1 2 3 5 8 13 21