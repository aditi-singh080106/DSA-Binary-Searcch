import java.util.*;
class Main {
   public static void printList(List<Integer> li){
       Collections.sort(li);
       for(int ele : li){
           System.out.print(ele+"\t");
       }
       System.out.println();
   }
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        int x=6 ,k=5 ;
        int n = arr.length-1;
        List<Integer> li = new ArrayList<>();
        if(arr[0]>x){
            for(int i = 0 ; i < k ; i++){
                li.add(arr[i]);
            }
            printList(li);
        }
        if(arr[n]<x){
            for(int i=n;i>n-k;i--){
                li.add(arr[i]);
            }
            printList(li);
        }
        int lo=0,hi=n;
        int lb=-1;
        // find the lower bound or target ele
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>=x){
                lb=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(lb);
        int i = lb-1 , j = lb;
        while(i>=0 && j<=n && k>0){
            int di=Math.abs(arr[i]-x);
            int dj=Math.abs(arr[j]-x);
            if(di<=dj) li.add(arr[i--]);
            else li.add(arr[j++]);
            k--;
        }
        while(i<0&&k>0&&j<n){
            li.add(arr[j++]);
            k--;
        }
        while(i>0&&k>0&&j>n){
            li.add(arr[i--]);
            k--;
        }
        printList(li);
    }
}
