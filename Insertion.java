public class Insertion{
    public static void main(String[]args){
        int []arr={1,2,3,5,6,7};
        int index=3;
        int number=4;
        int arr1[]=new int[arr.length + 1];
        for(int i=0;i<index;i++){
            arr1[i]=arr[i];
            
        }
        arr1[index]=number;

        for(int i=index;i<=arr.length;i++){
            arr1[i+1]=arr[i];
            
        }
        for(int num:arr1){
            System.out.println(num+" ");
        }
    }
}