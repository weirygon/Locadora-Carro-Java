package Avaliacao3Weiry;

import java.util.Scanner;

public class Main {
	
	public static void main(String [ ] args) throws CarroAlocadoException {
		
		Scanner imput = new Scanner(System.in);
		String str1, str2;
		int dia, aux;
		
		
		System.out.println("Informe a Razao Social da locadora: ");
		str1 = imput.nextLine();
		System.out.println("Informe o cnpj da locadora: ");
		str2 = imput.nextLine();
		Locadora locadora = new Locadora(str1, str2);
		System.out.print(locadora.toString()+"\n");
		
		Carro carro = new Carro("Uno", "Fiat", 1234, 50.00);
		try {

			System.out.println("Informe a placa do carro qual quer alugar: ");
			aux = imput.nextInt();
			System.out.println("Informe a data da locacao: ");
			dia = imput.nextInt();
			
			carro.alocarCarro(aux, dia);
			
			
			System.out.println("Informe a placa para devolucao: ");
			aux = imput.nextInt();
			System.out.println("Informe a data: ");
			dia = imput.nextInt();
			
			carro.devolucaoCarro(aux, dia);
		
		
		}catch(CarroAlocadoException cae) {
			System.out.println(cae.getMessage());
		}
		
		
		
		
		imput.close();
	}
}
