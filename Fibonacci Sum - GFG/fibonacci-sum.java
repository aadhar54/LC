//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution{
    static long fibSum(long N){
        //code here
        long a = 0;
        long b = 1;
        long next = 0;
        long sum = b;
        for(long count = 1; count <= N - 1; count++){
            next = (a + b) % (1000000007);
            sum+= next % (1000000007);
            a = b;
            b = next;
        }
        return sum % (1000000007);
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long N = Long.parseLong(read.readLine());
           
            Solution ob = new Solution();
            System.out.println(ob.fibSum(N));
        }
    }
}
// } Driver Code Ends