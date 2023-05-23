import java.io.*;
import java.lang.*;
import java.util.*;

class MiddleOfThree{
    public static void middle(int A, int B, int C){
        //code here
        if(A>B) {
            if(B>C) {
                System.out.println("The middle element is "+B);
            }
            else if(A>C) {
                System.out.println("The middle element is "+C);
            }
            else {
                System.out.println("The middle element is "+A);
            }
        }
        else {
            if(A>C) {
                System.out.println("The middle element is "+A);
            }
            else if(B>C) {
                System.out.println("The middle element is "+C);
            }
            else {
                System.out.println("The middle element is "+B);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A :");
        int A = sc.nextInt();
        System.out.println("Enter the value of B :");
        int B = sc.nextInt();
        System.out.println("Enter the value of C :");
        int C = sc.nextInt();

        middle(A, B, C);
    }
}