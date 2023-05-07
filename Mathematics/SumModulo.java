import java.io.*;
import java.lang.*;
import java.util.*;

// Find the modulo of sum of two numbers
 
//  for example. --> if the two numbers are 2 and 3 the sum is 5.
//  if the number for modulo is 3 then the answer is 5 % 3 = 2.
//  here as the numbers are not large enough direct approach can be used --> (a + b)% m
//  but in case where the two numbers are large like 10000, 20000 modulo 5
//  this approach can be used --> ((a % m) + (b % m)) % m


class SumModulo {
    public static int funcMod(int a, int b, int m) {
        int res = ((a % m) + (b % m)) % m;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter modulo number : ");
        int m = sc.nextInt();
        System.out.println("The modulo of sum of two numbers is : "+funcMod(a, b, m));
        
    }
}