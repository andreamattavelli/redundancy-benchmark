package sorting.bubblesort;

public class BubbleSort3 {

	private int array[];
	
	public BubbleSort3(int array[]) {
		this.array = array;
	}

	public int[] sort() {
		boolean doMore = true;
		while (doMore) {
			doMore = false; // assume this is last pass over array
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					// exchange elements
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					doMore = true; // after an exchange, must look again
				}
			}
		}
		return array;
	}
	
}
