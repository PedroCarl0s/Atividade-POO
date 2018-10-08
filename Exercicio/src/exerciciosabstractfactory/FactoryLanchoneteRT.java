package exerciciosabstractfactory;

public class FactoryLanchoneteRT extends FactoryLanchonete {
	
	private static FactoryLanchoneteRT instance = null;
	
	private FactoryLanchoneteRT () {}
	
	public static FactoryLanchoneteRT getInstance() {
		if (instance == null) {
			instance = new FactoryLanchoneteRT();
		}
		return instance;
	}
		
	public Sanduiche montarSanduiche() {
		return new SanduicheRT();
	}
	
	

}
