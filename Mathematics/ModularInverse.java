// Question --> Given two integers ‘a’ and ‘m’. 
//             The task is to find the smallest modular multiplicative inverse of ‘a’ under modulo ‘m’.

// -- approach -->  to find the smallest number as modular inverse the first thing is the modular
// inverse must be less than m. So in the loop x<m and then solve with the formula
// a * x mod m = 1. When u simplify the equation the answer is (a mod m * x mod m ) mod m = 1

// time complexity --> O(m)
// space comlexity --> O(1)


// Solution-->

import java.io.*;
import java.lang.*;
import java.util.*;

class ModularInverse
{
    
    public static int modInverse(int a, int m)
    {
      for(int x =1; x<m; x++) {
          if(((a %m) * (x %m))%m ==1) {
            System.out.println(x);
          }

      }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of m :");
        int m = sc.nextInt();
        System.out.println("The modular inverse is :");
        modInverse(a, m);
    }
    


}
