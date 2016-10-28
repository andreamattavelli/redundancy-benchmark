package search.linear;

public class LinearSearch4 {

	private int array[];

	public LinearSearch4(int array[]) {
		this.array = array;
	}
	
	public int search(int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return i;
			}
		}
		return -1;
	}

}
