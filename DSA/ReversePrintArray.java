import java.util.Arrays;
public class ReversePrintArray {
    public static void main(String[]args){
        int a[]={10,20,30,40,50};
        System.out.println("Before reverse:"+Arrays.toString(a));
        for(int i=a.length-1; i>=0; i--){
            System.out.println(a[i]);
        }
    }
}
