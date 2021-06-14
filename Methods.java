import java.io.*;
import java.util.*;

public class Methods {
    public static void main(String[] args){
        System.out.print("Exercise 2: ");
        System.out.println(isDivisible(8,3));
        System.out.print("Exercise 3: ");
        System.out.println(isTriangle(1,2,3));
        System.out.print("Exercise 8: ");
        System.out.println(power(2,5));
    }
    // exercise 2
    public static boolean isDivisible(int n, int m){
      if ((n%m)==0){
        return true;
      }else {
        return false;
      }
    }
    //exercise 3
    public static boolean isTriangle(int a, int b, int c){
      boolean result = true;
      if (a>=(b+c)){
        result = false;
      }else if(b >= (a + c)){
        result = false;
      }else if(c>=(a+b)){
        result = false;
      }
      return result;
    }

    //exercise 8
    public static double power(double x, int n){
      double result;
      if (n == 0){
        result = 1;
      } else{
        result = x*power(x,n-1);
      }
      return result;
    }
}
