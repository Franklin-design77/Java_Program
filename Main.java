
import java.util.Arrays;
public class Main{
public static void main(String[]args){
    int[]nums={1,2,4,4,7,8,11,12};
    int target=8;
    int []result=BinarySearch(nums,target);
       System.out.println(Arrays.toString(result));
    }
    public static int[] BinarySearch(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                return new int[]{left,right};
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
            
        }
        return  new int[]{-1,-1};
    }
        
}
