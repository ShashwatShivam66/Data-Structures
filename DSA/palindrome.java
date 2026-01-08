public class palindrome {
    public static void main(String[]args){
        int num=123212;
        int n=num;
        int rev=0;
        while (num>0){
            rev= rev*10+num%10;
            num=num/10;
        }
        if(n==rev){
            System.out.println(n+" "+"is a palindrome");
        }
        else {
            System.out.println(n+" "+"is not a palindrome");
        }

    }
}
