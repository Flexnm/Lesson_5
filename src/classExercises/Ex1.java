package classExercises;

import java.util.Arrays;

public class Ex1 {
	public static void main(String[] args) {
		
		int r = (int) (Math.random() * 8 + 3);
		int[][] arr = new int[r][];
		for (int i = 0; i < arr.length; i++) {
			r = (int) (Math.random() * 8 + 3);
			arr[i] = new int[r];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 101);

			}
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}