// Leetcode 2064
import java.util.Scanner;
public class Main
{
    public static boolean isPossible(int[] arr , int pd , int store){
        int val=0;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i]%pd==0) val+=(arr[i]/pd);
            else val+=(arr[i]/pd)+1;
        }
        if(val<=store) return true;
        else return false;
    }
	public static void main(String[] args) {
        int [] arr={15,10,10};
        int n = arr.length, mx=Integer.MIN_VALUE;
        int store=7;
        for(int i=0;i<n;i++){
            mx=Math.max(arr[i],mx);
        }
        int lo=1,hi=mx,ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isPossible(arr,mid,store)){
                ans=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.print(ans);
	}
}
