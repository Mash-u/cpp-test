/*******************************************************************************************************************************************************
 * Name                : Matthew Ramirez
 * Assignment #2       : Dynamic Array
 * Class               : CS 41
 * Section             : 6:00pm - 10:00 pm
 * Date                : 9/21/2016
 ********************************************************************************************************************************************************/
package dynamicintarray;

public class DynamicIntArray {

    /***********************************************************************************************************************************************************************
     * NAME         :  DynamicIntArray(int initialSize)
     * DESCRIPTION  :  This constructor takes an int variable initialSize as a parameter. It then passes it to the setArray function.
     * RETURN VALUE :  No return Value
     ************************************************************************************************************************************************************************/
    public DynamicIntArray(int initialSize)
    {
        setArray(initialSize);
    }

    /********************************************************************************************************************************************************************************************************
     * NAME         :  addNumber(int newNumber)
     * DESCRIPTION  :  This function either adds the number contained in the int var parameter newNumber to the object :array (if there is space) or creates a new
     *                 object largerArray with size [array.length +1] to accommodate the new number entered by the user. It then copies all of the information contained
     *                 in array to largerArray via for loop. Lastly, it then assigns the object reference array to the newly created object reference largerArray
     *                 (so that they both point towards the newly created array).
     * RETURN VALUE :  returns void.
     ********************************************************************************************************************************************************************************************************/
    public void addNumber(int newNumber){
          if(arrayIndexCounter < array.length)                                     //intCounter is used as in the conditional statement to determine if the array has enough space for the next number input.
          {
              array[arrayIndexCounter] = newNumber;                                //int variable intCounter is used to keep track of how many indexes are filled in array.
          } //ENDIF                                                                  it is incremented every time the user enters a value (the addNumber method is called).
          else
          {//BEGINELSE
              int[] largerArray = new int[array.length + 1];                       //new largerArray is created if there is no space in array (1 index larger than array)
              for (int i = 0; i < array.length; i++) {
                  largerArray[i] = array[i];                                       //all numbers in array are copied over to largerArray;
              }//ENDELSE
              array                   = largerArray;                                                 // array is assigned to the object that largerArray points to.
              array[array.length - 1] = newNumber;
          }
          arrayIndexCounter++;
    }

    /********************************************************************************************************************************************************************************************************
     * NAME         :  arrayLength()
     * DESCRIPTION  :  This function returns the length of array.
     * RETURN VALUE :  returns an int value.
     ********************************************************************************************************************************************************************************************************/
    public int arraylength()
    {
        return array.length;
    }

    /********************************************************************************************************************************************************************************************************
     * NAME         :  getArray()
     * DESCRIPTION  :  This function returns an int array in the form of variable array. It used by the main function to iterate through the array and print the values in its indexes out.
     * RETURN VALUE :  returns an array of integers
     ********************************************************************************************************************************************************************************************************/
    public int[] getArray()
    {
        return array;
    }

    /********************************************************************************************************************************************************************************************************
     * NAME         :  setArray()
     * DESCRIPTION  :  This function is called on by the DynamicIntArray constructor. It creates a It assigns the reference variable array the memory address of an integer array object with the initial
     *                 size that the user entered.
     * RETURN VALUE :  returns void.
     ********************************************************************************************************************************************************************************************************/
    public void setArray(int initialSize)
    {
        array = new int[initialSize];
    }

    private int[] array;
    private int arrayIndexCounter = 0;


}


