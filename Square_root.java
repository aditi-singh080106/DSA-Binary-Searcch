// LEETCODE 69
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Square root is : "+sqrt(num));
	}
	public static int sqrt(int x){
	    long lo = 0 , hi = x ;
        while(lo<=hi){
            long mid = lo+ (hi-lo)/2;
            if(mid*mid==x) return (int)mid;
            else if(mid*mid > x) hi = mid-1;
            else lo = mid+1;
        }
        return (int)hi;
	}
}
