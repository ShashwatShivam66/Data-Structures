package Questions;

public class occurancesOfCharacter_string {
    public static void main(String[]args){
        String s="ssshhaaashwaaaattt";
        int a=s.length();
        int b=s.replaceAll("a","").length();
        int count=a-b;
        System.out.println(count);
    }
}
