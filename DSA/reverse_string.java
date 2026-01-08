package Questions;

import java.util.Scanner;
public class reverse_string {
    public static void main(String[]args){
        /*
        Scanner sc=new Scanner(System.in);
        String rev="";
        System.out.println("Write the string:");
        String s=sc.nextLine();
        for (int i=s.length()-1; i>=0; i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);

         */
        /*
        Scanner sc=new Scanner(System.in);
        String rev="";
        System.out.println("Write the String:");
        String s=sc.nextLine();
        char a[]=s.toCharArray();
        for (int i=a.length-1; i>=0; i--){
            rev=rev+a[i];
        }
        System.out.println(rev);

         */
/*
        StringBuffer s= new StringBuffer("Shivam");
        System.out.println(s.reverse());

 */

        StringBuilder s= new StringBuilder("Shivam");
        System.out.println(s.reverse());
    }
}
