
// Find the Smallest divisible number

// Smallest divisible number is nothing but the lcm. So for example if the entered number is 4 -->
    //  the smallest divisible number from 1 to 4 will be 12
    //  as, lcm * gcd = a * b
    //  therefore, lcm = (a * b) / gcd
    //  let here, lcm = ans and as b > a in the above problem a will be 1 and b will be i which will run in for loop from 1 to n
    //  so,  ans = (ans * i)/gcd


import java.io.*;
import java.lang.*;
import java.util.*;

class PrintLCM {
    public static int gcd(int a, int b) {
       if (a == 0) {
        return b;
       } 
       else {
        return gcd(b % a, a);
       }
    }

    public static int lcm(int n) {
        int ans = 1;
        for(int i = 1; i<=n; i++) 
            ans = (ans * i)/ (gcd(ans, i));
            return ans;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The smallest divisible number of the entered number is :"+ lcm(n));
    
    }

}