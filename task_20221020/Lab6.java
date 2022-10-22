// Define a Generic Class type method called array_max that will generalize the method such that it finds maximum value for both int and double type array input values.
// Your generic class type array_max method code should find the maximum element in an array using generics.
// Method will take the array and array size as parameters.


package Lab6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {

        Integer arr_i[] = {2,8,20,3,4};
        Double arr_d[] = {2.7,3.8,5.5,6.7,9.7};

        System.out.println(array_max(arr_i));
        System.out.println(array_max(arr_d));
    }

    public static <T extends Comparable<T>> T array_max(T[] x) {
        T max = x[0];

        for(int i = 1; i < x.length; i++) {
            if(x[i].compareTo(max) > 0) {
                max = x[i];
            }
        }
        return max;
    };
}

	 
    
    


