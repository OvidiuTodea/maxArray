package com.company;
import java.util.Arrays;

public class Main {

    public static int maxArray(int []givenArray, int n){

        Arrays.sort(givenArray);
        return givenArray[n-1];
    }

      static int[] exchangePositions(int arr[], int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return arr;
    }
    

    public static void main(String[] args) {

        int arr[] = { 6, 3 , 7 , 8 , 10 , 4 , 5 };
        int n = arr.length;
        String str = Arrays.toString(arr);
        System.out.print("Maximul din array-ul " + str+ " este : " );
        System.out.println(maxArray(arr,n));

        System.out.println("---------------");

        exchangePositions(arr, 2, 3);
        String str2 = Arrays.toString(arr);
        System.out.println(str2);
    }
}
