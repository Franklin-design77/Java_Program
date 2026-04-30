public class FindMissingNumber {
   public static void main(String[]args){
    int []arr={1,2,3,5};
    int n=arr.length+1;
    int sum=n*(n+1)/2;
    int pre=0;
    for(int num:arr){
         pre=pre+num;
    }
      int diff=sum-pre;
   System.out.println("the missing Num:"+diff);
   }
  
}