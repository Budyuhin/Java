package Lesson3;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
          changeOneNull ();
          OneHundred ();
          changeSix();
          doubleMassiv ();
    }
    public static void changeOneNull() {
        int[] arr = {0,1,0,1,1,0,1,1,0,0};
        for (int i = 0; i < arr.length; i++){
            if (arr [i] <= 0) {
                arr[i] = 0 + 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void OneHundred() {
        int[] arr = new int [100];
        arr [0] = 1;
        for(int i = 1; i < arr.length; i++) {
            arr[i] = i +1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void changeSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6){
                arr [i] = arr [i] * 2;
            }
            }
            System.out.println(Arrays.toString(arr));
        }
    public static void doubleMassiv() {
        int[][] arr = new int[5][5];
        for (int j = 0; j < arr.length; j++);
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            } System.out.println();
        }
   }
}