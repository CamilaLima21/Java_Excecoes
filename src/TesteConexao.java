
public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao con = new Conexao()) {
			con.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Erro na conexão");
		}
		
		
		//-------------------------------------------------
		
//		Conexao cn = null;
//		try {
//			cn = new Conexao();
//			cn.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conexão!");
//		} finally {
//			System.out.println("Finally");
//			if(cn != null) {
//				cn.close();
//			}
//		}
			
	}

}
