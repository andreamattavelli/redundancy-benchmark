package search.linear;

public class LinearSearch2 {

	private int array[];

	public LinearSearch2(int array[]) {
		this.array = array;
	}

	public int search(int toSearch) {
		int foundIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == toSearch) {
				foundIndex = i;
			}
		}
		return foundIndex;
	}

}
