import java.util.Scanner;
public class Dupicate{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of element:");
        int n=sc.nextInt();
        System.out.println("Enter the element:");
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Dupilicate element:"+arr[i]);
                }
                
            }
            
        }
        
    }
}