package exerciciosabstractfactory;

public class SanduicheJP extends Sanduiche {
	
	public SanduicheJP() {
		this.pao = new PaoBola();
		this.queijo = new QueijoMussarela();
		this.presunto = new PresuntoFrango();
		this.salada = new SaladaSemVerdura();
	
	}
	
}