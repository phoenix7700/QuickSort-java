
public class IntSort extends Quicksort<Integer>{
	@Override
	public int compare (Integer i1, Integer i2) {
		if (i1 < i2) {
			return -1;
		}else if (i1 == i2) {
			return 0;
		}else {
			return 1;
		}
	}
	IntSort (Integer [] intArray) {
		setFullArray(intArray);
	}
}
