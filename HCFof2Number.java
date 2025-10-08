// GCD
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lo = 1 , hi = Math.min(a,b), ans = 1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(a%mid==0 && b%mid==0){
                ans=mid;
                lo=mid+1;
            }
            else hi=mid-1;
        }
        System.out.println(ans);
    }
}
