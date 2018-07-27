package Sorting_and_Searching;
import java.util.*;
public class InsertionSort {
    public static void main(String args []){
        Scanner s = new Scanner (System.in);
        int a[] = new int [100];
        int i,key,n;
        n = s.nextByte();
        for(i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        for(i=0;i<n-1;i++){
            key = a[i+1];
            while(i>=0 && a[i]>key){
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = key;
        }
        System.out.print("Sorted array : ");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
