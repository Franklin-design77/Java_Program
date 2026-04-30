import java.util.Scanner;
public class HappyNum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        while(num>9){
            int sum=0; 
            while(num>0){
                int digit=num%10;
                sum=sum+digit*digit;
                num/=10;
            }
           num=sum; 
        }
        
        if(num==1){
            System.out.println("HappyNum");
        }
        else{
            System.out.println("Not a happy number");
        }
    }
}