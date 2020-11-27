package dominio;


public class Pessoa {
	
	public String nome;
	public float mensalidade;
	public boolean bolsista;
	public float vlbolsa;
	public float id;
	float desconto = 0;
	String situacao;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
		
	}
	
	public Pessoa(String nome, float mensalidade) {
		
	}
	
	public String calcularbolsa(){
		
		
		
		if (bolsista == true) {
			
			desconto = mensalidade / 2;
			
			situacao = "bolsista";
			
			return desconto + situacao;
			
		} else {
			
			situacao = "pagante";
			
			
			return desconto + situacao;
		}

		}
		
	

	@Override
	public String toString() {
		
		
		
		return String.format("%-15s | %10.2f | %6s | %10.2f" , 
				this.nome,
				this.mensalidade,
				situacao,
				desconto);
	}

	public void imprimir() {
		// TODO Auto-generated method stub
		
	}
		
	
}
