
import java.util.*;
public class array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        maxSubArray(a, size);
    }
    public static void maxSubArray(int []a,int size){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            curr_sum+=a[i];
            if(max_sum<curr_sum){
            max_sum=curr_sum;
            }
            if(curr_sum<0){
            curr_sum=0;
            }
        }
        System.out.println("maxsum: "+max_sum);
   
    }
    
    

}
