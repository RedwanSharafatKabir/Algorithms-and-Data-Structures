package Sorting_and_Searching;
import java.util.*;
public class ATMbooth {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n,x,t;
        System.out.print("Enter password: ");
        x=s.nextInt();
        while(x==1234){
            System.out.println("\nPress 1: Check balance");
            System.out.println("Press 2: Withdraw balance");
            System.out.print("Your option: ");
            n=s.nextInt();
            if(n==1){
                continue;
            }
            if(n==2){
                System.out.print("Enter Amount: ");
                t=s.nextInt();
                System.out.println("Your transaction is completed Successfully.");
                System.out.println("Now You have BDT "+(12000.00-t)+" in your account.");
            }
            break;
        }
        if(x!=1234)
            System.out.println("Invalid password.\nPlease enter a valid password.");
    }
}
