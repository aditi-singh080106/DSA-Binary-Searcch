import java.util.Scanner;
class Main {
   
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int[] arr = {7,8,9,10,1,2,3,4,5,6};
        int target=3;
        int n = arr.length;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<arr[hi]){
                // we are in the right sorted
                if(arr[mid]<target&&target<=arr[hi]) lo = mid+1;
                else hi=mid-1;
            }
            else if(arr[mid]>arr[hi]){
                // we are in the left sorted part
                if(target<=arr[mid]&&target>=arr[lo]) hi=mid-1;
                else lo=mid+1;
            }
        }
    }
}
