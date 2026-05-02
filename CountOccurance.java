public class CountOccurance{
    public static void main(String[]args){
        int []arr={40,20,10,50,20,10,30,40};
        
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            boolean isRepeated=false;
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    isRepeated=true;
                    break;
                }
            }
            if(!isRepeated){
                System.out.println(arr[i]+"-"+count);
            }
        }
    }
}