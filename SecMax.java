public class SecMax{
    public static void main(String[]args){
        int arr[]={10,20,30,40,50};
        int max=0;
        int secMax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            if(arr[i]>secMax && arr[i]<max){
                secMax=arr[i];
            }
        }
        System.out.println(secMax);
    }
}