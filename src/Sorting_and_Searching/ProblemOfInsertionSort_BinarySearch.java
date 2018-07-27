package Sorting_and_Searching;
import java.util.*;

public class ProblemOfInsertionSort_BinarySearch {
    public static void insertionSort(int a[],int n){
        int i;
        for(i=0;i<n-1;i++){
            int key = a[i+1];
            while(i>=0 && a[i]>key){
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = key;  
        }
    }
    public static void binarySearch(int b[],int n,int x){
        int start = 0,end = n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(b[mid]==x){
                System.out.println("Found.\nPosition : "+mid);
                break ;
            }
            else if(b[mid]>x)
                end=mid-1;
            else
                start=mid+1;
        }
        if(start>end)
            System.out.println("Not Found.");
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int a[] = new int[100],b[]=new int[100];
        int x,i,n;
        n=s.nextInt();
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        
        insertionSort(a,n);
        
        System.out.print("Sorted array : ");
        for(i=0;i<n;i++){
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }
        System.out.println();
        
        System.out.print("Search element : ");
        x=s.nextInt();
        binarySearch(b,n,x);
    }
}
