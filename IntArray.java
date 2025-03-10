import java.util.Arrays;
import java.util.Random;

public class IntArray {
    private int length;
    private int myArray[];

    // Constructor
    public IntArray(int size) {
        this.length = size;
        this.myArray = new int[size];
    }

    // Returns the size of the array
    public int size() {
        return length;
    }

    // Fills the array with random numbers between 0 and 5
    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            myArray[i] = rand.nextInt(6); // Generates random numbers between 0 and 5
        }
    }

    // Sets a value at a given index
    public void set(int index, int value) {
        if (index >= 0 && index < length) {
            myArray[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    // Gets a value from a given index
    public int get(int index) {
        if (index >= 0 && index < length) {
            return myArray[index];
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    // Clears the array by setting all elements to zero
    public void clear() {
        Arrays.fill(myArray, 0);
        length = 0;
    }

    // Checks if the array is empty
    public boolean isEmpty() {
        return length == 0;
    }

    // Sorts the array in ascending order
    public void sort() {
        Arrays.sort(myArray);
    }

    // Returns a string representation of the array
    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}
