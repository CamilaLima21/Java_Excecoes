
public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao con = new Conexao()) {
			con.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Erro na conex�o");
		}
		
		
		//-------------------------------------------------
		
//		Conexao cn = null;
//		try {
//			cn = new Conexao();
//			cn.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conex�o!");
//		} finally {
//			System.out.println("Finally");
//			if(cn != null) {
//				cn.close();
//			}
//		}
			
	}

}
