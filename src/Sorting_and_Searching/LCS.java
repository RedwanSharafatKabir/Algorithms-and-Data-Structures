package Sorting_and_Searching;
import java.util.*;
public class LCS {
    static int LCS(char[] x,char[] y,int m,int n){
        if(m==0 || n==0)
            return 0;
        if(x[m-1]==y[n-1])
            return 1+LCS(x,y,m-1,n-1);
        else
            return judge(LCS(x,y,m,n-1),LCS(x,y,m-1,n));
    }
    static int judge(int a,int b){
        return a>b?a:b;
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String s1,s2;
        System.out.print("First string: ");
        s1=s.nextLine();
        System.out.print("Second string: ");
        s2=s.nextLine();
        
        char[] x=s1.toCharArray();
        char[] y=s2.toCharArray();
        int m=x.length;
        int n=y.length;
        
        System.out.println("LCS length: "+LCS(x,y,m,n));
    }
}
