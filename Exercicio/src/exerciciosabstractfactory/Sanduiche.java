package exerciciosabstractfactory;

public class Sanduiche  {
	
	protected Pao pao;
	protected Queijo queijo;
	protected Presunto presunto;
	protected Salada salada;
		
	public Sanduiche() {
		this.pao = new PaoFrances();
		this.queijo = new QueijoMussarela();
		this.presunto = new PresuntoFrango();
		this.salada = new SaladaSemVerdura();
	}
	
	public String toString() {
		return "Tipo de pão: " + pao.tipo() + "\nTipo de Queijo: " + queijo.tipo()
				+ "\nTipo de Presunto: " + presunto.tipo() + "\nTipo de Salada: " + salada.tipo() + "\n";
	}
	
}
