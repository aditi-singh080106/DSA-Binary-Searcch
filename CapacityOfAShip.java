// LeetCode 1011
import java.util.Scanner;
public class Main
{
    public static boolean isPossible(int[] arr,int cap,int days){
        int load=0,day=1;
        for(int i =0 ; i<arr.length;i++){
		      if(load+arr[i]<=cap)  load+=arr[i];
		      else{
		          day++;
		          load=arr[i];
		      }
	    }
	    if(day>days) return false;
	    else return true;
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int n=arr.length;
		int days=5;
		int max=Integer.MIN_VALUE,sum=0;
		for(int i=0;i<n;i++){
		    max=Math.max(max,arr[i]);
		    sum+=arr[i];
		}
		int lo=max,hi=sum,ans=-1;
		while(lo<=hi){
		    int mid=lo+(hi-lo)/2; //cpacity
		    if(isPossible(arr,mid,days)){
		        ans=mid;
		        hi=mid-1;
		    }
		    else lo=mid+1;
		}
		System.out.print(ans);
	}
}
