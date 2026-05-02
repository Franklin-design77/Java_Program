public class DEC_BIN{
    public static void main(String[]args){
        int dec=10;
        int temp=dec;
        String binary="";
        while(dec>0){
            int rem=dec%2;
            binary=rem+binary;
            dec/=2;
        }
        System.out.printf("The binary of %d is %s",temp,binary);
    }
}