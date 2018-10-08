package exerciciostrategyalgoritmos;

public class BubbleSort implements Ordenar {
	
	private static BubbleSort instance = null;
	
	private BubbleSort() {}
	
	public static BubbleSort getInstance() {
		if (instance == null) {
			instance = new BubbleSort();
		}
		return instance;
	}
	
	public int[] ordenarValores(int[] valores) {
		// TODO
		return null;
	}

}
