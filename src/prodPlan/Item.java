package prodPlan;

public class Item {

	Parte parte;
	private int quantidade;
	
	public Item(Parte parte, int quantidade) {
		this.parte = parte;
		this.quantidade = quantidade;
	}
	
	public float calculaValor() {
		return quantidade * parte.getValor();
	}

	public String toString() {
		return "codigo: " + parte.getCod()
		+ " nome: " + parte.getNome() 
		+ " quantidade: " + quantidade 
		+ " valor: " + parte.getValor()
		+ calculaValor();
	}
}
