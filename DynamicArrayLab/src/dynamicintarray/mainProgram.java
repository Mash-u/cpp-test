/*******************************************************************************************************************************************************
 * Name                : Matthew Ramirez
 * Assignment #2       : Dynamic Array
 * Class               : CS 41
 * Section             : 6:00pm - 10:00 pm
 * Date                : 9/21/2016
 ********************************************************************************************************************************************************/
package dynamicintarray;

import java.util.Scanner;
/********************************************************************************************************************************************************
 *
 *                                                            Dynamic Array (int) Lab
 *
 _________________________________________________________________________________________________________________________________________________________
 * This program prompts the user for the initial size of an array they'd like to create. It then creates an array of the specified size via the
 * DynamicIntArray() class constructor. The user is then prompted to enter numbers until they would like to enter the program. The array may be resized a number of times
 * depending on how many numbers the user would like to input. This resizing and adding of numbers is all done via the DynamicIntArray class method
 * addNumber(). The array is then printed out.
 _________________________________________________________________________________________________________________________________________________________
 *   Inputs           :
 *        userNumber  : int variable that holds the integer that the user would like to add to the array (can also hold the value -1)
 *        arraySize   : double variable that holds user input for length of a cube.
 *        depth       : double variable that hods user inout for depth of a cube.
 *
 *
 *   Outputs          :
 *        height      : same as input.
 *        length      : same as input.
 *        depth       : same as input.
 *        volume      : double variable that takes the return value of cubeReducerAndCalculator() (return variabe is product of length * depth * height).
 *
 *   Processing
 *        cubeVolume  : double variable that holds the value of the reduced deimnesiona.
 *
 /********************************************************************************************************************************************************/
public class mainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean exitCondition = true;
        int arraySize = 0;
        int userNumber = 0;
        int[] checkArray;
        System.out.println("How large would you like to initialize your array?");
        arraySize = scan.nextInt();
        DynamicIntArray userArray = new DynamicIntArray(arraySize);

        while (exitCondition) {
            System.out.println("Please enter a number to populate your array or enter \"-1\" to exit : ");
            userNumber = scan.nextInt();
            if (userNumber != -1) {
                userArray.addNumber(userNumber);
            } else {
                exitCondition = false;
            }
        }
        checkArray = userArray.getArray();
        System.out.print("ArrayList: ");
        for (int i = 0; i < userArray.arraylength(); i++) {
            System.out.print(checkArray[i] + ", ");
        }
        scan.nextLine();//hhkjbvghv
        //ij
    }
}



