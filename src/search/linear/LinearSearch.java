package search.linear;

public class LinearSearch {

	private int array[];

	public LinearSearch(int array[]) {
		this.array = array;
	}

	public int search(int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				return i;
			}
		}
		return -1;
	}

}
