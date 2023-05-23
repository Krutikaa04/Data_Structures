import java.io.*;
import java.lang.*;
import java.util.*;

//arr1,arr2 : the arrays
// n, m: size of arrays
class UnionOfSortedArrays
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr1)
            set.add(i);
      
        for (int i : arr2)
            set.add(i);
      
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : set)
            list.add(i);
 
        System.out.println(list);

        return list;

        
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 2, 3};
        int arr2[] = {2, 3, 3, 4, 5, 5};

        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> obj = findUnion(arr1, arr2, n, m);
    }
}
