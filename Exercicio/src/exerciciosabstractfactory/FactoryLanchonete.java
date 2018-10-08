package exerciciosabstractfactory;

public abstract class FactoryLanchonete {

	public abstract Sanduiche montarSanduiche();
	
	public Sanduiche montarSanduicheSimples() {
		return new Sanduiche();
	}

}