package Sorting_and_Searching;
import java.util.*;
public class LinearSearch {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int a[] = new int [100];
        int i,n,x;
        n = s.nextInt();
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.print("Search element : ");
        x = s.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==x)
                break ;
        }
        if(i==n)
            System.out.println("Not Found");
        else
            System.out.println("Found");
    }
}
