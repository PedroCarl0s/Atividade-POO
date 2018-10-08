package exerciciosabstractfactory;

public class TestLanchonete {

	public static void main(String[] args) {
		
		FactoryLanchoneteRT lanchoneteRT = FactoryLanchoneteRT.getInstance();
		System.out.println(lanchoneteRT.montarSanduiche());
		
		FactoryLanchoneteCG lanchoneteCG = FactoryLanchoneteCG.getInstance();
		System.out.println(lanchoneteCG.montarSanduicheSimples());
		
		FactoryLanchoneteJP lanchoneteJP = FactoryLanchoneteJP.getInstance();
		System.out.println(lanchoneteJP.montarSanduiche());
	}

}
