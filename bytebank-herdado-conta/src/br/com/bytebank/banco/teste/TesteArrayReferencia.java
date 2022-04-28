package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencia {

	public static void main(String[] args) {

		ContaCorrente[] contas = new ContaCorrente[10];	
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;

		ContaCorrente cc2 = new ContaCorrente(25, 12);
		contas[1] = cc2;
		
		System.out.println(contas[0].getNumero());
		System.out.println(contas[1].getNumero());
		ContaCorrente ref = contas[1];
		System.out.println(ref.getNumero());
	}

}
