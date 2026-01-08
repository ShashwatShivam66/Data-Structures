package Questions;

public class countWords_string {
    public static void main(String[]args){
        /*
        String s= "I am Shivam Kumar tt";
        int count=1;
        for (int i=0; i<=s.length()-1;i++){
            char alpha=s.charAt(i);
            if (alpha==' '){
                count++;
            }
        }
        System.out.println(count);

         */

        // More effective method
        String s="I am Shivam Kumar j j";
        int count=1;
        for (int i=0; i<=s.length()-1;i++){
            if (s.charAt(i)==' '&& s.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
