package prodPlan;

public class Motor extends Parte {

	private float potencia;
	private float corrente;
	private int rpm;
	
	public Motor(int cod, String nome, String descricao, float valor, float potencia, float corrente, int rpm) {
		super(cod, nome, descricao, valor);
		this.potencia = potencia;
		this.corrente = corrente;
		this.rpm = rpm;
	}	
	
	@Override
	public float calculaValor() {
		return getValor();
	}
	
	@Override
	public String toString() {
		return "codigo: " + getCod() 
		+ " nome: " + getNome() 
		+ " descricao: " + getDescricao() 
		+ " valor: " + getValor()
		+ " potencia: " + potencia
		+ " corrente: " + corrente
		+ " rpm: " + rpm;
	}
}
