package com.company;
import java.util.Arrays;

public class Main {

    public static int maxArray(int []givenArray, int n){

        Arrays.sort(givenArray);
        return givenArray[n-1];
    }

    public static void main(String[] args) {

        int arr[] = { 6, 3 , 7 , 8 , 10 , 4 , 5 };
        int n = arr.length;
        String str = Arrays.toString(arr);
        System.out.print("Maximul din array-ul " + str+ " este : " );
        System.out.println(maxArray(arr,n));

    }


}
