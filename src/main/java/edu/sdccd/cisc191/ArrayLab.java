package edu.sdccd.cisc191;

import java.util.Scanner;

public class ArrayLab {
   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");

        double[][] testMaxArray = new double[scanner.nextInt()][scanner.nextInt()];
        System.out.print("Enter the array: ");

        for(int i = 0; i < testMaxArray.length; i++){
            for(int j = 0; j < testMaxArray[i].length; j++){
                testMaxArray[i][j] = scanner.nextDouble();
            }
        }
        int[] testLargestPos = locateLargest(testMaxArray);
        System.out.println("The location of the largest element is at (" + testLargestPos[0] + ", " + testLargestPos[1] + ")" );
   }

    public static double columnSum(double[][] m, int i){
        double sumOfColumn = 0;
        for(int row = 0; row < m.length; row++){
            if (m[row].length <= i){
                sumOfColumn += 0;
            } else {
                sumOfColumn += m[row][i];
            }
        } return sumOfColumn;
    }

    public static int[] locateLargest(double[][] a){

        double maxInt = a[0][0];
        int iPos = 0;
        int jPos = 0;

       for(int row = 0; row < a.length; row++){
           for(int column = 0; column < a[row].length; column++){
               if(a[row][column] > maxInt){
                   maxInt = a[row][column];
                   iPos = row;
                   jPos = column;
               }
           }
       }
       int[] largestPos = {iPos, jPos};
       return largestPos;
    }
}
