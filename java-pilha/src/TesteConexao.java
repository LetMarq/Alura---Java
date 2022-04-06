
public class TesteConexao {

	public static void main(String[] args) {

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("erro na conexao");
		}

		// -----

//		Conexao con = null;
//		// TODO Auto-generated method stub
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException e) {
//			// TODO: handle exception
//
//		} finally {
//			con.close();
//		}
	}

}
