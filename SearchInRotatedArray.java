// LEETCODE 33
// Method 1 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr={7,8,9,10,1,2,3,4,5,6};
        int n = arr.length , target = 3;
        if(n<=2){
            for(int i = 0 ; i < n ; i++ ){
                if(arr[i]==target){
                    System.out.print(i);
                    break;
                }
            }
        }
        //finding the pivot index
        int pivot = -1 , lo = 1 , hi =n-2;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){
                pivot=mid;
                break;
            }
            else if(arr[mid]<arr[mid-1]&&arr[mid]<arr[mid+1]){
                pivot=mid-1;
                break;
            }
            else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1]){
                if(arr[mid]<arr[hi]){
                    // we are in the rigth sorted part
                    hi=mid-1;
                }
                else lo=mid+1;
            }
        }
        System.out.print(pivot);
       System.out.println();
        int left = bs(arr,target,0,pivot);
        if(left==-1){
            System.out.print(bs(arr,target,pivot+1,n));
        }
        else System.out.print(left);
	}
	public static int bs(int[] arr,int target , int lo , int hi){
	    while(lo<=hi){
	        int mid = lo+(hi-lo)/2;
	        if(arr[mid]==target) return mid;
	        else if(arr[mid] < target) lo=mid+1;
	        else hi=mid-1;
	    }
	    return -1;
	}
}
