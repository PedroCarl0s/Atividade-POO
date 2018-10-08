package exerciciostrategyalgoritmos;

public class Ordenacao {
	
	private Ordenar ordenar;
	
	public int[] ordenar(int[] valores) {
		return ordenar.ordenarValores(valores);
	}
	
	public void setBubbleSort() {
		ordenar = BubbleSort.getInstance();
	}
	
	public void setInsertionSort() {
		ordenar = InsertionSort.getInstance();
	}
	
	public void setMergeSort() {
		ordenar = MergeSort.getInstance();
	}
	
	public void setQuickSort() {
		ordenar = QuickSort.getInstance();
	}
}
