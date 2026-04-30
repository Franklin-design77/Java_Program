public class Selection{
    public static void main(String[]args){
        int nums[]={6,5,2,8,9,4};
        int temp=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
            
        }
        
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}