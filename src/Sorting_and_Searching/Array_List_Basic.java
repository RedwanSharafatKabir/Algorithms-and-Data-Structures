package Sorting_and_Searching;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Array_List_Basic {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int input;
        boolean check;
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        
        ///////////// Print size of initial array list /////////////
        System.out.println("Size before insert data: " + arrayList.size());
        
        ///////////// Add values in array list /////////////
        System.out.println("\nAdd values in array list: ");
        arrayList.add(input = s.nextInt());
        arrayList.add(input = s.nextInt());
        arrayList.add(input = s.nextInt());
        arrayList.add(input = s.nextInt());
        
        ///////////// Print array list /////////////
        System.out.println("\nArray List 1: " + arrayList);
        
        ///////////// add data in array list2 using addAll() method /////////////
        arrayList1.addAll(arrayList);
        System.out.println("\nArray List 2: " + arrayList1);
        
        ///////////// sort array list 1 in ascending order and array list 2 in descending order /////////////
        Collections.sort(arrayList);
        Collections.sort(arrayList1, Collections.reverseOrder());
        
        ///////////// check if array list 1 is equal to array list 2 /////////////
        boolean chk = arrayList.equals(arrayList1);
        if(chk){
            System.out.println("They are equal.");
        } else {
            System.out.println("They are not equal because "
                    + "array list 1 is sorted in ascending order"
                    + " array list 2 is sorted in descending order.");
        }
        System.out.println("\nArray List 1: " + arrayList);
        System.out.println("Array List 2: " + arrayList1);
        
        ///////////// Print array list using for each loop /////////////
        System.out.print("\nUsing forEach loop:");
        for(int i:arrayList){
            System.out.print(" " + i);
        }
        
        ///////////// Print array list using iterator method /////////////
        System.out.print("\n\nUsing Iterator:");
        Iterator itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.print(" " + itr.next());
        }
        
        ///////////// remove a data from array list /////////////
        arrayList.remove(1);
        System.out.println("\n\nRemove data of index 1: " + arrayList);
        
        ///////////// check if array list is empty or not /////////////
        check = arrayList.isEmpty();
        if(check){
            System.out.println("\nEmpty ? " + check + "\nArray List is empty.");
        } else {
            System.out.println("\nEmpty ? " + check + "\nArray List has " + arrayList.size() + " data.");
        }
        
        ///////////// add a data in array list in any index /////////////
        System.out.print("\nAdd a number: ");
        int m = s.nextInt();
        System.out.print("in index number: ");
        int n = s.nextInt();
        arrayList.add(n, m);
        System.out.println("\nArray List: " + arrayList);
        
        ///////////// replace a data in array list in any index /////////////
        System.out.print("\nReplace a number: ");
        int a = s.nextInt();
        System.out.print("in index number: ");
        int b = s.nextInt();
        arrayList.set(b, a);
        System.out.println("\nArray List: " + arrayList);
        
        ///////////// search a data in array list in any index /////////////
        System.out.print("\nSearch a number: ");
        int x;
        boolean contain = arrayList.contains(x = s.nextInt());
        if(contain){
            System.out.println(x + " is in " + arrayList.indexOf(x) + " index.");
        } else if(!contain){
            System.out.println(x + " is not is array list.");
        }
        
        ///////////// search a data by finding index /////////////
        System.out.print("\nSearch index: ");
        int y = s.nextInt();
        int result = arrayList.get(y);
        System.out.println(result + " is data of index no. " + y);
        
        ///////////// remove all data from array list /////////////
        arrayList.removeAll(arrayList);
        System.out.println("\nRemove all data: " + arrayList);
        
        ///////////// clear all data from array list /////////////
        arrayList.clear();
        System.out.println("\nClear all data: " + arrayList);
        
        ///////////// check if array list is empty or not /////////////
        check = arrayList.isEmpty();
        if(check){
            System.out.println("\nEmpty ? " + check + "\nArray List is empty.");
        } else {
            System.out.println("\nEmpty ? " + check + "\nArray List has some data.");
        }
        
    }
}
