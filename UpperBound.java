
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        int[] arr = {10,20,30,30,40,50,60,70,80};
        int n = arr.length;
        int ub = n ;
        int target = 35;
        int lo = 0 , hi = n-1 ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>target){
                ub=Math.min(ub,mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println("Upper bound is : "+ub+" and ele is : "+arr[ub]);
	}
}
