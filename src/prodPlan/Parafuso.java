package prodPlan;

public class Parafuso extends Parte {

	private float comprimento;
	private float diametro;

	public Parafuso(int cod, String nome, String descricao, float valor, float comprimento, float diametro) {
		super(cod, nome, descricao, valor);
		this.comprimento = comprimento;
		this.diametro = diametro;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getDiametro() {
		return diametro;
	}

	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}

	@Override
	public float calculaValor() {
		return getValor();
	}
	
	@Override
	public String toString() {
		return "codigo: " + getCod() 
		+ "nome: " + getNome() 
		+ "descricao: " + getDescricao() 
		+ "valor: " + getValor()
		+ "comprimento: " + comprimento
		+ "diametro: " + diametro;
	}
		
}
