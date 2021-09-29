package ru.geekbrains.lesson2;

public class MainApp {
    public static void main(String[] args) {
        sumCheck ();
        Two (3);
        checkTrueOrFalse(-7);
        wordMuch();
        // eachFourYaer ();
    }
    public static boolean sumCheck () {
        int a = 5;
        int b = 10;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void Two (int j) {
        if (j <= -1) {
            System.out.println("Число отрицательное.");
        } else {
            System.out.println("Число положительное.");
        }
    }
   public static boolean checkTrueOrFalse (int a) {
       if (a <= 0) {
           return true;
       } else {
           return false;
       }
   }
   public static void wordMuch () {
        for (int i = 0; i < 5; i++) {
            System.out.println("Строка");
        }
   }
//   public static boolean eachFourYaer () {
//       for (int i = 0; i < 400; i++) {
//           for (int b = 0; b < 4; b++) {
//               if (b > 4) {
//                   return true;
//               } else {
//                   return false;
//               }
//           }
//       }
//   }
}


