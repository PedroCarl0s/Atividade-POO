package exerciciostrategyalgoritmos;

public class QuickSort implements Ordenar {

	private static QuickSort instance = null;

	private QuickSort() {}

	public static QuickSort getInstance() {
		if (instance == null) {
			instance = new QuickSort();
		}
		return instance;
	}
	public int[] ordenarValores(int[] valores) {
		// TODO
		return null;
	}

}
