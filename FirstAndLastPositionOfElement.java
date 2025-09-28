// LEETCOD 34
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        int[] arr = {10,20,20,20,20,20,20,30,30,30,40,50,60,70,80};
        int x = 20;
        int n = arr.length;
        int lo = 0 , hi = n-1 ;
        int fp = -1;
        // first position
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==x){
                if(mid>0 && arr[mid]==arr[mid-1]){
                    hi=mid-1;
                }
                else{
                    fp=mid;
                    break;
                }
            }
            else if(arr[mid]>x) hi=mid-1;
            else lo=mid=1;
        }
        // last position
        lo = 0 ; hi = n-1 ;
        int lp = -1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==x){
                if(mid+1<n && arr[mid]==arr[mid+1]){
                    lo=mid+1;
                }
                else{
                    lp=mid;
                    break;
                }
            }
            else if(arr[mid]>x) hi=mid-1;
            else lo=mid+1;
        }
        System.out.println("first position :"+fp);
        System.out.println("last position :"+lp);
	}
}
