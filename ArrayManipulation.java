import java.util.Arrays;
import java.util.Scanner;

/*
 * This program reads the sales data of multiple stores, sorts the data, and finds the second highest sales value.
 * If a valid second highest sales value is found, it prints all occurrences of this value.
 * Otherwise, it notifies the user that there is no second highest sales value.
 */
public class ArrayManipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Creating a Scanner object for input
		System.out.print("Enter number of stores : ");
		int noOfStores = sc.nextInt(); // Reading the number of stores
		
		if(noOfStores <= 0)
		{
			System.out.println("\nThere are no sales to display");
			return;
		}
		int[] storeSales = new int[noOfStores]; // Initializing an array to store sales data

		for (int i = 0; i < noOfStores; i++) {
			System.out.print("Please input store " + (i + 1) + " sales : ");
			storeSales[i] = sc.nextInt(); // Reading sales data
		}
		
		Arrays.sort(storeSales); // Sorting the sales data in ascending order

		int firstMax = storeSales[noOfStores - 1]; // The highest sales value (last element after sorting)
		int secondMax = Integer.MIN_VALUE; // Initialize second highest sales value

		// Loop to find the second highest sales value
		for (int i = 0; i < noOfStores; i++) {
			if (storeSales[i] != firstMax) // Checking if current sales value is not the highest
				secondMax = Math.max(storeSales[i], secondMax); // Updating the second highest sales value
		}

		// Check if a second highest sales value exists
		if (secondMax == Integer.MIN_VALUE)
			System.out.println("\nThere is no second highest Sales");
		else {
			System.out.print("\nSecond highest sales : ");
			// Loop to print all occurrences of the second highest sales value
			for (int i = 0; i < noOfStores; i++) {
				if (storeSales[i] == secondMax)
					System.out.print(storeSales[i] + " ");
			}
		}

		sc.close();
	}

}
