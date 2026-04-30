public class BinarySearch{
    public static void main(String[]args){
        int[]nums={10,20,30,40,50};
        int targert=50;
        int result=BinarySearch(nums,targert);
        if(result!=-1){
            System.out.println("the target element is present in:"+result);
        }
        else{
            System.out.println("the target element is not present in the array");
        }
        
    }
    public static int BinarySearch(int[]nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}