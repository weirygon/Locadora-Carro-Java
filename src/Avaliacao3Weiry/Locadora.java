package Avaliacao3Weiry;

public class Locadora {
	
	private String razao_Social;
	private String cnpj;

	
	public Locadora(String razao_Social, String cnpj) {
		this.razao_Social = razao_Social;
		this.cnpj = cnpj;
	}


	@Override
	public String toString() {
		return "Locadora: " + razao_Social + " Cnpj:" + cnpj;
	}
	
}
