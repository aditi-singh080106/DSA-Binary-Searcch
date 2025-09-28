
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
        int[] arr = {10,20,20,30,50,35,25,25,27,20,4};
        int x = -1;
        int n = arr.length;
        int lo = 1 , hi = n-2;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]) {
                x=mid;
                break;
            }
            else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1]) lo=mid+1;
            else if(arr[mid]<arr[mid-1]&&arr[mid]>arr[mid+1]) hi=mid-1;
        }
       
        System.out.println(arr[x]);
	}
}
