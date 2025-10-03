// leetcode 1539
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int[] arr={2,3,4,7,11};
	    int n = arr.length, k=5;
	    int lo=0,hi=n;
	    while(lo<=hi){
	        int mid=lo+(hi-lo)/2;
	        int missed=arr[mid]-mid-1;
	        if(missed<k) lo=mid+1;
	        else hi=mid-1;
	    }
	    System.out.println(k+lo);
	}
}
