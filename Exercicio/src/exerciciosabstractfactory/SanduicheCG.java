package exerciciosabstractfactory;

public class SanduicheCG extends Sanduiche {
	
	
	public SanduicheCG() {
		this.pao = new PaoFrances();
		this.queijo = new QueijoPrato();
		this.presunto = new PresuntoFrango();
		this.salada = new SaladaComVerdura();
	}
	
}
