package Sorting_and_Searching;
import java.util.*;

public class SortingString {
    public static void main(String args []){
        Scanner s = new Scanner (System.in);
        int a[] = new int [100],i,n,temp;
        String S[] = new String[100];
        n = s.nextByte();
        for(i=0;i<n;i++){
            System.out.print("Name: ");
            S[i] = s.next();
            System.out.print("Mark: ");
            a[i] = s.nextInt();
        }
        System.out.println("\nReport - ");
        for(i=0;i<n;i++){
            System.out.println(S[i]+" "+a[i]);
        }
        System.out.println();
        temp=a[0];
        for(i=1;i<n;i++){
            if(temp<a[i]){
                temp=a[i];
                a[i]=a[i-1];
            }
        }
        System.out.println("Highest Mark: "+temp);
    }
}
