package sorting.bubblesort;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import sorting.bubblesort.BubbleSort;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BubbleSortTest {

	@Test
	public void test1() {
		dytrace.DyTrace.startDiSL();
		BubbleSort bs = new BubbleSort(new int[] {});
		bs.sort();
		dytrace.DyTrace.stopDiSL();
		
	}
	
	@Test
	public void test2() {
		dytrace.DyTrace.startDiSL();
		BubbleSort bs = new BubbleSort(new int[] {1});
		bs.sort();
		dytrace.DyTrace.stopDiSL();
	}
	
	@Test
	public void test3() {
		BubbleSort bs = new BubbleSort(new int[] {1,2,3,4,5,6,7,8,9});
		dytrace.DyTrace.startDiSL();
		bs.sort();
		dytrace.DyTrace.stopDiSL();
	}
	
	@Test
	public void test4() {
		BubbleSort bs = new BubbleSort(new int[] {9,8,7,6,5,4,3,2,1,-9});
		dytrace.DyTrace.startDiSL();
		bs.sort();
		dytrace.DyTrace.stopDiSL();
	}

}
