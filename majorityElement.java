import java.util.*;
public class majorityElement {
    public static int majorityElement(int[] nums){
        int votes=1;
        int majorityelement=nums[0];
        for(int i=1;i<nums.length;i++){
            if(votes==0){
                majorityelement=nums[i];
                votes++;
            }
            else if(majorityelement!=nums[i]){
                votes--;
            }
            else{
                votes++;
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==majorityelement){
                count++;
            }
        }
        if(count>nums.length/2){
            return majorityelement;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int majorityelement=majorityElement(a);
        System.out.println("majority element: "+majorityelement);

    }

}

