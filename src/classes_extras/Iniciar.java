package classes_extras;

public class Iniciar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexao.getConnection();
        System.out.println(Conexao.status); //imprime o valor de status
        /* se a conexao falhar veremos pelo status */

	}

}
