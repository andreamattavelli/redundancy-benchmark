package sorting.bubblesort;

public class BubbleSort6 {

	public int array[];
	
	public BubbleSort6(int array[]) {
		this.array = array;
	}

	public int[] sort() {
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (array[j] > array[i]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp; 
				}
			}
		}
		return array;
	}
}
