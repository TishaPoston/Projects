public class NewRunner {
    // Exercises the IntArray class
    public static void main(String[] args) {
        // Instantiate IntArray object
        IntArray iArr = new IntArray(10);
        int leng = iArr.size();

        // Display size of array == number of array elements
        System.out.println("The number of array elements is: " + leng);

        // Fill array with random numbers
        iArr.fillRand();
        System.out.println("Array with 10 elements filled with random numbers between 0 and 5");
        System.out.println(iArr);

        // Set a certain array element to a new value
        iArr.set(5, 6789);

        // Display the new value at position 5
        System.out.println("The value of array element 5 is: " + iArr.get(5));

        // Display all array data
        System.out.println(iArr);

        // Clear the array
        iArr.clear();

        // Check if array is now empty
        if (iArr.isEmpty()) {
            System.out.println("iArr is empty\n");
        }

        // Allocate new array elements
        iArr = new IntArray(100);

        // Fill array with random numbers
        iArr.fillRand();
        System.out.println("Array with 100 elements filled with random numbers between 0 and 5");
        System.out.println(iArr);

        // Sort the array
        if (!iArr.isEmpty()) {
            iArr.sort();
        } else {
            System.out.println("Array is empty, nothing to sort");
        }

        // Print out array to prove the sort method worked
        System.out.println("Array after sorting\n");
        System.out.println(iArr);
    }
}
