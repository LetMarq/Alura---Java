
public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo";
		paulo.profissao = "dev";
		paulo.cpf = "123";

		Conta contaPaulo = new Conta();
		contaPaulo.deposita(100);
		contaPaulo.titular = paulo;
	}

}
