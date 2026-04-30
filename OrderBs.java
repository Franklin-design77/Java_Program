public class OrderBs{
    public static void main(String[]args){
        int []arr={70,60,50,40,30,20,10};
        int target=10;
        int result=Search(arr,target);
        if(result != -1){
            System.out.println("the element present in:"+result);
        }
        else{
            System.out.println("the element is not present");
        }
        
    }
    static int Search(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        boolean isAsc=arr[left]<arr[right];
        while(left<=right){
            int mid=(left+right)/2;
            if(isAsc){
                if(arr[mid]<target){
                    left=mid+1;
                }
                else if(arr[mid]>target){
                    right=mid-1;
                }
                else{
                    return mid;
                }
            }
            else{
                if(arr[mid]<target){
                    right=mid-1;
                }
                else if(arr[mid]>target){
                    left=mid+1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
}