public class sortingDec{
    public static void main(String[]args){
        int []arr={4,9,6,2,1,6,8,3,10};
        int temp=0;
        System.out.print("before Sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Sorting:");
        for(int num:arr){
            
            System.out.print(num+" ");
        }
    }
}