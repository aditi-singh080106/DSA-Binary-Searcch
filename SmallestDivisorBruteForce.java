// LeetCode 1238
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        int[] arr = {5,1,9,2};
        int th = 6; //threshold
        int n = arr.length , mx=Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            mx=Math.max(mx,arr[i]);
        }
        for(int d=1;d<=mx;d++){
            int sum=0;
            for(int i = 0; i< n ;i++){
                if(arr[i]%d==0) sum+=(arr[i]/d);
                else sum+=(arr[i]/d)+1;;
            }
            if(sum<th){
                System.out.println(d);
                break;
            }
        }
	}
}
