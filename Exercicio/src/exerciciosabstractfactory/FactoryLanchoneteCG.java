package exerciciosabstractfactory;

public class FactoryLanchoneteCG extends FactoryLanchonete {
	
	private static FactoryLanchoneteCG instance = null;
	
	private FactoryLanchoneteCG () {}
	
	public static FactoryLanchoneteCG getInstance() {
		if (instance == null) {
			instance = new FactoryLanchoneteCG();
		}
		return instance;
	}
	
	public Sanduiche montarSanduiche() {
		return new SanduicheCG();
	}

}
