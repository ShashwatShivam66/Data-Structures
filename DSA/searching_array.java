public class searching_array {
    public static void main(String[]args){
      /*  int arr[]={44,55,98,59,100};
        int s=98;
        boolean search=false;
        for(int i=0; i<=arr.length-1;i++){
            if(s==arr[i]){
                System.out.println("Element found");
                search=true;
                break;
            }
        }
        if(search==false){
            System.out.println("Element not found");
        }

       */

        int a[]={100,200,300,400};
        int s=300;
        boolean search=false;
        for(int i:a){
            if(i==s){
                System.out.println("Element found");
                search=true;
                break;
            }
        }
        if(search==false){
            System.out.println("Element not found");
        }
    }
}
