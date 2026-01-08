import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
public class sorting_array {
    public static void main(String[]args){
/*
        Integer a[]={20,60,10,50,40};
        System.out.println("Before Sorting:"+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting:"+ Arrays.toString(a));
        Arrays.sort(a,Collections.reverseOrder());          // built in method for descending order

 */

        // BUBBLE SORT

    Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.print("Enter the value:");
        for (int i=0; i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Before Sorting:"+" "+Arrays.toString(a));
        int n=a.length;

        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (a[j]>a[j+1]){
                    int temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Elements after sorting:"+Arrays.toString(a));
    }
}
