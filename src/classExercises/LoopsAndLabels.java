package classExercises;

public class LoopsAndLabels {
	public static void main(String[] args) {
		
		int x = 6;

		lbl: for (int a = 0; a < 10; a++) {
			System.out.println("Loop 1");
			System.out.println("Loop 2");
			if(x == 5) {
			continue;
			}
			System.out.println("Loop 1");
			for (int b = 0; b < 10; b++) {
				System.out.println("Loop 2");
				System.out.println("Loop 3");
				if(x==6) {
					break lbl;
				}
				System.out.println("Loop 2");
				for (int c = 0; c < 10; c++) {
					System.out.println("Loop 3");
					System.out.println("Loop 3");
					System.out.println("Loop 3");

				}
			//	System.out.println("Break loop 3");
				System.out.println("Loop 2");
				System.out.println("Loop 2");
				System.out.println("Loop 2");
			}
		//	System.out.println("Break loop 2");
			System.out.println("Loop 1");
			System.out.println("Loop 1");
			System.out.println("Loop 1");
		}
		
	//	System.out.println("Break loop 1");

		

	}
}
