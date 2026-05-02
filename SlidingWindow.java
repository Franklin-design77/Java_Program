public class SlidingWindow{
    public static void main(String[]args){
        int[]nums={12,23,10,-4,45,-34,78,7};
        int k=3;
        int result=Sliding(nums,k);
        System.out.println("Max SubArray:"+result);
    }
    static int Sliding(int[]nums,int k){
        int mSum=Integer.MIN_VALUE;
        int wSum=0;
        for(int i=0;i<k;i++){
            wSum=wSum+nums[i];
        }
        for(int i=k;i<nums.length;i++){
            wSum=wSum-nums[i-k]+nums[i];
            mSum=Math.max(mSum,wSum);
        }
        return mSum;
    }
}