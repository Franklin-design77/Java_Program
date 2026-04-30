public class ReverseArray{
public static void main(String[]args){
    int[]arr={10,20,30,40,50};
    int n=arr.length;
    int []arr1=new int [n];
    for(int i=0;i<n;i++){
        arr1[i]= arr[n-1-i];
        System.out.print(arr1[i]+" ");
    }

    
    }
}
