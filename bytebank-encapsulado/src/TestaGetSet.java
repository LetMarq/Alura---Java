
public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 12341);
		
		Cliente paulo = new Cliente();
		conta.setTitular(paulo);

	}

}
