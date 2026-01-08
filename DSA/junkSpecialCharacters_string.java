package Questions;

public class junkSpecialCharacters_string {
    public static void main(String[]args){
        String s="$$Sh**iva((((()))))m";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
