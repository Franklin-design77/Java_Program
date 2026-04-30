public class skip{
    public static void main(String[]args){
        int []arr={1,2,3,4,5,6,7,8,9};
        int skipnum=2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==skipnum){
                continue;
            }
            System.out.println(arr[i]+" ");
        }
    }
}