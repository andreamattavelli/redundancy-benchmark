package sorting.bubblesort;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import sorting.bubblesort.BubbleSort7;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BubbleSort7Test {

	@Test
	public void test1() {
		BubbleSort7 bs = new BubbleSort7(new int[] {});
		bs.sort();
	}
	
	@Test
	public void test2() {
		BubbleSort7 bs = new BubbleSort7(new int[] {1});
		bs.sort();
	}
	
	@Test
	public void test3() {
		BubbleSort7 bs = new BubbleSort7(new int[] {1,2,3,4,5,6,7,8,9});
		bs.sort();
	}
	
	@Test
	public void test4() {
		BubbleSort7 bs = new BubbleSort7(new int[] {9,8,7,6,5,4,3,2,1,-9});
		bs.sort();
	}

}
