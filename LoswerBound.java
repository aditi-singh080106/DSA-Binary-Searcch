public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		        // System.out.println("Try programiz.pro");
        // int[] arr = {10,12,32,41,62,63,78,84,96,102,145};
        int[] arr = {10,20,30,30,40,50,60,70};
        int n = arr.length;
        int target = 35;
        int lo = 0 ,hi = n-1;
        // lower bound
        int lb = n ; 
        while(lo<=hi){
            int mid = lo + (hi-lo)/2 ;
            if(arr[mid]>=target){
                lb = Math.min(lb,mid);
                hi=mid-1;
            }
            else lo=mid+1; 
        }
        System.out.println("Element found "+lb+" "+arr[lb]);
    
	}
}
