package Sorting_and_Searching;
import java.util.*;
public class LCS {
    static void lcs(String X, String Y, int m, int n){
        
        int[][] L = new int[m+1][n+1];
        
        for (int i=0; i<=m; i++){
            for (int j=0; j<=n; j++){
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X.charAt(i-1) == Y.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }
        int index = L[m][n];
        int temp = index;
        
        char[] lcs = new char[index+1];
        lcs[index] = ' ';
  
        int i = m, j = n;
        while (i > 0 && j > 0){
            if (X.charAt(i-1) == Y.charAt(j-1)){
                lcs[index-1] = X.charAt(i-1); 
                i--; 
                j--; 
                index--;     
            }
            else if (L[i-1][j] > L[i][j-1])
                i--;
            else
                j--;
        }
        System.out.print("\nLCS of "+X+" and "+Y+" is ");
        for(int k=0;k<=temp;k++)
            System.out.print(lcs[k]);
        System.out.println();
    }
    
    static int LCS(String x,String y,int m,int n){
        if(m==0 || n==0)
            return 0;
        if(x.charAt(m-1)==y.charAt(n-1))
            return 1+LCS(x,y,m-1,n-1);
        else
            return judge(LCS(x,y,m,n-1),LCS(x,y,m-1,n));
    }
    static int judge(int a,int b){
        return a>b?a:b;
    }
    
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String x,y,s1,s2;
        System.out.print("First string: ");
        x=s.nextLine();
        System.out.print("Second string: ");
        y=s.nextLine();
        
        int m=x.length();
        int n=y.length();
        
        lcs(x, y, m, n);
        System.out.println("LCS length: "+LCS(x,y,m,n));
    }
}
