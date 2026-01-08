public class missing_no_array {
    public static void main(String[]args){
        int a[]={1,2,4,5};
        int num;
        int n=5;
        int sum=0;
        for (int i=0;i<a.length; i++){
            sum=sum+a[i];
        }
        num=(n*(n+1)/2)-sum;
        System.out.println("Missing number:"+num);
        }
    }

