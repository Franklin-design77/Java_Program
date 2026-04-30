public class LinearSearch{
    public static void main(String[]args){
        int nums[]={10,20,30,40,50,60,70,80};
        int target=50;
        int result=LinearSearch(nums,target);
        System.out.println("the the element in the index of:"+result);
    }
    public static int LinearSearch(int[]nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return 0;
    }
}