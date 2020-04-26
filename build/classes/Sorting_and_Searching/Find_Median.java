package Sorting_and_Searching;
import java.util.*;
public class Find_Median {
    public static void main(String args []){
        Scanner s = new Scanner (System.in);
        int i, a[] = {1,2,3,4,5,99,101};
        double median;
        
        System.out.println("Sorted array: ");
        
        for(i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        median=a.length;
        System.out.println("\nMedian: "+median/2.00);
    }
}
