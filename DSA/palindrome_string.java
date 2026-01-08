package Questions;

public class palindrome_string {
    public static void main(String[]args){
        /*
        String s="madam";
        String rev="";
        char a[]=s.toCharArray();
        for (int i=a.length-1; i>=0; i--){
            rev=rev+a[i];
        }
        if (rev.equals(s)){
            System.out.println(s+" "+"String is palindrome");
        }
        else {
            System.out.println(s+" "+"String is not palindrome");
        }

         */
        String s= "madam";
        String rev="";
        for (int i=s.length()-1; i>=0; i--){
            rev=rev+s.charAt(i);
        }
        if (rev.equals(s)){
            System.out.println(s+" "+"String is a palindrome");
        }
        else {
            System.out.println(s+" "+"String is not a palindrome");
        }
    }
}
