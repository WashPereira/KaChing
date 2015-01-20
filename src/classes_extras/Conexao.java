package classes_extras;

import java.sql.*;

public class Conexao {
	static String status=""; //variavel que vai informar o status da conexao

	public static Connection getConnection(){
	            Connection conn=null; //crio uma variavel para conexao
	try{
	    /*Aqui é o driver do Mysql, porem cada BD tem o seu, entao se vc amanha pensar usar outro BD, tem que ver na documentação
	     * com a linha a seguir estamos carregando o Driver para conexao*/

	    Class.forName("org.postgresql.Driver").newInstance();

	    /* ponto importante se usar um usuario diferente de root, verifique os privilegios deste com o BD.
	     *  vc pode usar o Mysql administration e logar como root e ver os privilegios*/
	    //a url é de acordo com a documentacao do driver, se for usar outro BD ver na documentacao

	    conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/kaching", "postgres",
                "123");

	    //se ocorrer tudo bem, ou seja, se conectar a linha a segui é executada   
	    status = "Connection opened";}
	catch (SQLException e) {
	    status = e.getMessage(); // a variavel status vai receber a string da exceção
	}catch (ClassNotFoundException e) {
	    status = e.getMessage();

	}catch(Exception e){
	    status = e.getMessage();}
	return conn;}

}
