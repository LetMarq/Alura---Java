
public class TesteMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(500);
		conta.saca(50);
		Conta conta2 = new Conta();
		conta2.deposita(5000);
		
		conta2.transfere(200, conta);
		System.out.println(conta.saldo);
		System.out.println(conta2.saldo);

	}

}
