//  Find the number of digits in the factorial of the given number -->

//  Time complexity --> O(log n)
//  Space complexity --> O(1)


//  how to find a factorial -->
//  eg. 4! = 4 * 3 * 2 * 1 = 24
//  so in code --> int n = 4, fact = 1;
//  for(int i = 1; i<=n;i++) {
//     fact = fact * i;
//  }
 

//  how to count digits in an number -->
//  eg. 2345 --> this number has 4 digits in it.
//  so in code --> int num = 2345, count = 0;
//  while(num>0) {
//     num = num/10;
//     count++;
//  }


//  For best space and time complexity and counting numbers greater than 10^6;
//  We can use Kamenetsky’s formula to find our answer! 

//  It approximates the number of digits in a factorial by :
//  f(x) =    log10(((n/e)^n) * sqrt(2*pi*n))

//  Thus, we can pretty easily use the property of logarithms to,
//  f(x) = n* log10((n/e)) + log10(2*pi*n)/2 


import java.io.*;
import java.lang.*;
import java.util.*;

class DigitsInFactorial {
    public static double ValueE = 2.71828182845904523536;
    public static double ValuePi = 3.141592654;
    public static long facDigits(int N){
        //code here
        if (N < 0) {
            return 0;
        }
        if(N <= 1) {
            return 1;
        }
        double ans = (N * Math.log10(N / ValueE) + Math.log10(2 * ValuePi * N) / 2.0);
        return (long)Math.floor(ans) + 1;
   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int N = sc.nextInt();
        System.out.println("The digits in factorial of the given number is : "+facDigits(N));
    }
}



//  ** Alternate method to solve this problem with time and space complexity as O(n) and O(1) respectively **

import java.util.*;
import java.lang.*;
import java.io.*;
  
class DigitsInFactorial
{
  static long factorial(int n)
  {
    long fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    return fact;
  }
  
  public static void main(String[] args)
  {
    int n = 10, c = 0;
  
    // finding factorial of a number
    long f = factorial(n);
  
    // counting the number of digits present
    // in the factoral number
    while (f != 0) {
      f /= 10;
      c += 1;
    }
    System.out.println(c);
  }
}