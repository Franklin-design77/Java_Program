public class SecondLagArray{
    public static void main(String[]args){
        int []arr={10,20,30,40,50,50};
        int max=0;
        int Second=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                Second=max;
                max=arr[i];
            }
            if(arr[i]>Second && arr[i]<max){
                Second=arr[i];
            }
        }
        System.out.println("Second Largest Number:"+Second);
    }
}