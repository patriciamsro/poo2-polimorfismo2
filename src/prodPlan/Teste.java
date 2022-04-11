package prodPlan;

public class Teste {

	static Parte[] criaPartes() {
		
		Parte vet[] = new Parte[8];
		
		vet[0] = new Motor(112, "motor m12", "motor de avanco do cabecote", 100f, 1.2f, 1.1f, 1250);
		vet[1] = new Motor(114, "motor m114", "motor auxiliar", 60.0f, 0.6f, 0.8f, 1250);
		vet[2] = new Motor(111, "motor m111", "motor de ventilador", 70.f, 1.f, 1.f, 3000);
		vet[3] = new Motor(110, "motor m110", "motor principal", 120.f, 1.8f, 1.5f, 1250);
		vet[4] = new Parafuso(231, "parafuso p1", "parafuso de fixação do cabecote", 2.5f, 1000f, 8f);
		vet[5] = new Parafuso(232, "parafuso p2", "parafuso de fixacao do motor", 2.5f, 80.f, 6.f);
		vet[6] = new Parafuso(233, "parafuso p3", "parafuso de fixacao do ventilador", 2f, 60f, 6f);
		vet[7] = new Parafuso(234, "parafuso p4","parafuso de uso geral", 3f, 120f, 12f);

		return vet;
	}
	
	static void listaPartes(String titulo, Parte[] parte) {
		
		System.out.println(titulo);
		
		for(int i = 0; i < parte.length; i++) {
			System.out.println(parte[i].toString());
		}
	}
	
	static Item[] criaItens(Parte[] partes) {
		
		Item[] itens = new Item[4];
        
        itens[0] = new Item(partes[0], 10);
        itens[1] = new Item(partes[5], 50);
        itens[2] = new Item(partes[7], 30);
        itens[3] = new Item(partes[2], 5);
        
        return itens;
	}
	
	static void listaItens(String titulo, Item[] itens) {
		
		System.out.println(titulo);
		Float calcula = 0f;
		
		for(int i = 0; i < itens.length; i++) {
			System.out.println(itens[i].toString());
			calcula += itens[i].calculaValor();
		}
		
		System.out.println("Valor total: " + calcula);	
	}
	
	public static void main(String[] args) {
			
		Parte[] partes = criaPartes();
		Item[] itens = criaItens(partes);
		listaPartes("*** Partes utilizadas na produção ***", partes);
		listaItens("*** Itens solicitados ***", itens);	
	}
}
