package Questions;

public class oddEven_size_digit {
    public static void main(String[]args){
        int num=123456789;
        int n;
        int count_even=0;
        int count_odd=0;
        while(num>0){
            n=num%10;
            if(n%2==0){
                count_even++;
            }
            else {
                count_odd++;
            }
            num=num/10;
        }
        System.out.println("no of odd digits are:"+ " "+count_odd);
        System.out.println("no of even digits are:"+" "+count_even);
    }
}
