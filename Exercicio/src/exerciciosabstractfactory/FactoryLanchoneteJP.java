package exerciciosabstractfactory;

public class FactoryLanchoneteJP extends FactoryLanchonete {
	
	private FactoryLanchoneteJP () {}
	
	private static FactoryLanchoneteJP instance = null;
	
	public static FactoryLanchoneteJP getInstance() {
		if (instance == null) {
			instance = new FactoryLanchoneteJP ();
		}
		return instance;
	}
	
	
	public Sanduiche montarSanduiche() {
		return new SanduicheJP();
	}
}
