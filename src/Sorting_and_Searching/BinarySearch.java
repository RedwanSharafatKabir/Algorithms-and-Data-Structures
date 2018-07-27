package Sorting_and_Searching;
import java.util.*;
public class BinarySearch {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int a[] = new int [100];
        int mid,start=0,end,i,n,x;
        n = s.nextInt();
        end = n-1;
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.print("Search element : ");
        x = s.nextInt();
        while (start<=end){
            mid = (start+end)/2 ;
            if(a[mid]==x){
                System.out.println("Found");
                break ;
            }
            else if(a[mid]>x)
                   end = mid-1;
            else
                start = mid+1;
        }
        if(start>end)
            System.out.println("Not Found");
    }
}
