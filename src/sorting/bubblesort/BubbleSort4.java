package sorting.bubblesort;

public class BubbleSort4 {

	private int array[];
	
	public BubbleSort4(int array[]) {
		this.array = array;
	}

	public int[] sort() {
		int n = array.length;
		boolean doMore = true;
		while (doMore) {
			n--;
			doMore = false; // assume this is our last pass over the array
			for (int i = 0; i < n; i++) {
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
