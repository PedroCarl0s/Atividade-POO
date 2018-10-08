package exerciciosabstractfactory;

public class SanduicheRT extends Sanduiche {
	
	public SanduicheRT() {
		this.pao = new PaoIntegral();
		this.queijo = new QueijoCheddar();
		this.presunto = new PresuntoPeru();
		this.salada = new SaladaComVerdura();
	}
	
}