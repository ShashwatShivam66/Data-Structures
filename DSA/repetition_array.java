public class repetition_array {
    public static void main(String[]args){
        int a[]={10,20,30,30,30,40,50,50};
        int s=30;
        int i=0;
        int j=0;
        while(i<=a.length-1){
            if(s==a[i]){
                j++;
            }
            i++;
        }
        System.out.println(j);
    }
}
