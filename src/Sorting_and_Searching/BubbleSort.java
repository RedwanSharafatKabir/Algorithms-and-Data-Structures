package Sorting_and_Searching;
import java.util.*;
public class BubbleSort {
    public static void main(String args []){
        int n,i,j,temp;
        int a[] = new int [100];
        Scanner s = new Scanner (System.in);
        n = s.nextInt();
        for(i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
