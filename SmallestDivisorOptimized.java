// LeetCode 1283
class Solution {
    public int smallestDivisor(int[] arr, int th) {
        int n = arr.length , mx=Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            mx=Math.max(mx,arr[i]);
        }
        int lo = 1 , hi = mx ,ans=mx;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int sum=0;
            for(int i=0;i<n;i++){
                if(arr[i]%mid==0) sum+=(arr[i]/mid);
                else  sum+=(arr[i]/mid)+1;
            }
            if(sum<=th){
                ans=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return ans;
    }
}
