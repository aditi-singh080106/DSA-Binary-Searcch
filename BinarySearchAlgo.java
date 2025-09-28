import java.util.Scanner ;
class Main {
    
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int[] arr = {10,12,32,41,62,63,78,84,96,102,145};
        int n = arr.length;
        int target = 41;
        int lo = 0 ,hi = n-1;
        boolean flag = false ; // false indicate that target s not present
        while(lo<=hi){
            int mid = lo+(hi-lo)/2 ;
            if(arr[mid]==target){
                flag=true;
                break;
            }
            else if(arr[mid]>target){
                // go left
                hi=mid-1;
            }
            else lo = mid+1;
        }
        if(flag) System.out.println("Element found");
        else     System.out.println("Element not found");
    }
}
