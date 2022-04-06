
public class TestaContaComExcecaoCheck {
	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.desposita();
		} catch (MinhaExcecao e) {
			// TODO Auto-generated catch block
			System.out.println("Tratamento....");
		}

	}
}
