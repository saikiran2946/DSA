import java.util.*;
public class arrays {
    public static void reverseOfArray_1(){
        int a[]={1,2,3,4,5};
        int start=0;
        int end=a.length-1;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void maxSubArray(int a[],int size){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<=size;i++){
            curr_sum+=a[i];
            if(max_sum<curr_sum){
                max_sum=curr_sum;
            }
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        System.out.println("maximum sum: "+max_sum);
    }
    public static void sortArray(int[] a, int size){
        int low=0;
        int high=size-1;
        int mid=0;
        while(mid<=high){
            if(a[mid]==0){
                int temp=a[low];
                 a[low]=a[mid];
                 a[mid]=temp; 
                 low++;
                 mid++;  
            }
            else if (a[mid]==1){
                mid++;
            }
            else if(a[mid]==2){
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
    }
    public static void printArray(int a[],int size){
        System.out.print("sorted array: ");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int majorityElement(int[] nums){
        int votes=1;
        int majorityelement=nums[0];
        for(int i=0;i<nums.length;i++){
            if(votes==0){
                majorityelement=nums[i];
                votes++;
            }
            else if(majorityelement!=nums[i]){
                votes--;
            }
            else {
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
        int a[]={4,2,3,2,3,2};
        int b[]={2,0,1,2,0};
        int n1=b.length-1;
        int n=a.length-1;

        //reverseOfArray_1();
        //maxSubArray(a,n);
        //sortArray(b,n1);
        //printArray(b,n1);
        majorityElement(a);
    }
}
