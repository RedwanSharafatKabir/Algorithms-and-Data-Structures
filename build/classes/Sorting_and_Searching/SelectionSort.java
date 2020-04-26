package Sorting_and_Searching;
import java.util.*;
public class SelectionSort {
    public static void main(String args []){
        Scanner s = new Scanner (System.in);
        int a[] = new int [100];
        int n,i,j,temp;
        n = s.nextInt();
        for(i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
