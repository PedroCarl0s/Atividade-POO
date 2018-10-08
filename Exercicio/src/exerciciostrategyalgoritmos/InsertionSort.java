package exerciciostrategyalgoritmos;

public class InsertionSort implements Ordenar {

	private static InsertionSort instance = null;

	private InsertionSort() {}

	public static InsertionSort getInstance() {
		if (instance == null) {
			instance = new InsertionSort();
		}
		return instance;
	}
	
	
	public int[] ordenarValores(int[] valores) {
		// TODO
		return null;
	}

}
