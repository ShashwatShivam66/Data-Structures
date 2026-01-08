public class SumOfDigits {
    public static void main(String[]args){
        int num=123456;
        int sum=0;
        int n;
        while (num>0){
            n=num%10;
            sum=n+sum;
            num=num/10;
        }
        System.out.println(sum);
    }
}
