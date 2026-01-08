public class digit_size {
    public static void main(String[]args){
        int num=12340345;
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
