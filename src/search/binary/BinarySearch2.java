package search.binary;

public class BinarySearch2 {

	private int array[];

	public BinarySearch2(int array[]) {
		this.array = array;
	}

	public int search(int key) {
		return search(key, 0, array.length);
	}
	
	private int search(int key, int lowerbound, int upperbound) {
		int position;
		position = (lowerbound + upperbound) / 2;
		while ((array[position] != key) && (lowerbound <= upperbound)) {
			if (array[position] > key) {
				upperbound = position - 1;
			} else {
				lowerbound = position + 1;
			}
			position = (lowerbound + upperbound) / 2;
		}
		if (lowerbound <= upperbound) {
			return position;
		} else
			return -1;
	}

}
