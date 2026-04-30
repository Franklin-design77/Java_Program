public class Unique{
    public static void main(String[]args){
        int n=12; int n1=n;
        int count1=0;
        int count2=0;
        while(n1>0){
            int digit1=n1%10;
            count1++;
            int n2=n;
            while(n2>0){
                int digit2=n2%10;
                if(digit1==digit2){
                    count2++;
                }
                n2=n2/10;
            }
            n=n/10;
            
            
        }
        if(count1==count2){
            System.out.println("Unique Number");
        }
        else{
            System.out.println(" Not Unique Number");
        }
    }
}