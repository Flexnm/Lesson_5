package classExercises;

import java.util.Arrays;

public class Ex73newsolution {
	public static void main(String[] args) {
		int[] randoms = new int[10];
		int[] uniques = new int[10];

		for (int i = 0; i < randoms.length; i++) {
			randoms[i] = (int) (Math.random() * 11);
		}
		System.out.println(Arrays.toString(randoms)); // Print randoms array.
		System.out.println(Arrays.toString(uniques)); // Print uniques array.

		// This fills the new array with unique values:

		int length = 0; // Length of new array, index for the new element.
		lbl: for (int i = 0; i < randoms.length; i++) { // 'lbl' is a label given to this 'for' loop.
			for (int j = 0; j < length; j++) {
				if (randoms[i] == uniques[j]) { // Duplicate was found.
					continue lbl; // This will skip the copying action because we dont want to copy the
									// duplicates. With the use of the label the 'continue' is not for the loop it
									// is in but the loop that is labeled.
				}
			}
			// A duplicate was not found - copy the number from 'randoms' to 'uniques':
			uniques[length] = randoms[i]; // Adding the unique element to the new array.
			length++; // The new array length is increased by 1 for each unique value that is found.
		}
		System.out.println(length); // the length that the new array needs to have.
		System.out.println(Arrays.toString(uniques)); // Prints the array with unique values but with incorrect length.F

		// Set the length of 'uniques' array to the variable "length":
		int[] tempArr = new int[length]; // Creating a new array to be used as a temporary array.
		System.arraycopy(uniques, 0, tempArr, 0, length); // Copying the elements of 'uniques' array into a temporary
															// array.
		uniques = tempArr; // Setting 'uniques' array to reference the temporary array.

		System.out.println(Arrays.toString(uniques));
	}

}
