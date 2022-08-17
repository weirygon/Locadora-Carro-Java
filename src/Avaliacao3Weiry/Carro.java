package Avaliacao3Weiry;

public class Carro{

	private String modelo;
	private String marca;
	private int placa;
	private double valor_Diaria;
	private boolean alocado;
	private int dia;
	
	public Carro(String modelo, String marca, int placa, double valor_Diaria) {
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.valor_Diaria = valor_Diaria;
		this.alocado = false; 
		this.dia = 0;
	}

	
	public void alocarCarro(int placa, int dia) throws CarroAlocadoException{
		
		if(this.placa == placa) {
			if(this.alocado) {
				throw new CarroAlocadoException("Carro ja esta alugado");
			}
			this.alocado = true;
			this.dia = dia;
			System.out.println("Carro alugado com sucesso!");
			
		}else{
			throw new CarroAlocadoException("Carro nao encontrado");
		}
	}
	
	public void devolucaoCarro(int placa, int dia) throws CarroAlocadoException{
		
		if(this.placa == placa) {
			 double aux = (dia - this.dia) * valor_Diaria;
			 System.out.println("Valor a ser pago: R$"+aux);
			 this.alocado = false;
		}else {
			throw new CarroAlocadoException("Carro nao encontrado");
		}
		
	}
}
