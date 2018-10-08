package exerciciostrategyalgoritmos;

public class MergeSort implements Ordenar {

	private static MergeSort instance = null;

	private MergeSort() {}

	public static MergeSort getInstance() {
		if (instance == null) {
			instance = new MergeSort();
		}
		return instance;
	}
	
	public int[] ordenarValores(int[] valores) {
		// TODO
		return null;
	}

}
