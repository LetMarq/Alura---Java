package br.com.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new ContaCorrente(123,123);
		
		c.deposita(1000);
		System.out.println(c.getSaldo());

	}

}
