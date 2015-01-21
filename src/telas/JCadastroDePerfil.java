package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

import java.awt.Font;

import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import classes_extras.Conexao;

import javax.swing.JFormattedTextField;

public class JCadastroDePerfil extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField nome_usuario;
	private JPasswordField senha;
	private JPasswordField passwordField_1;
	private JTextField nome_mae;
	private MaskFormatter setMascara(String mascara){
	    MaskFormatter mask = null;  
	    try{  
	        mask = new MaskFormatter(mascara);                        
	        }catch(java.text.ParseException ex){}  
	    return mask; 
	}
	Conexao conecta = new Conexao();//conecantando ao banco de dados

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCadastroDePerfil frame = new JCadastroDePerfil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JCadastroDePerfil() {
		conecta.conectar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Foto do Usu\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		panel.setBackground(Color.WHITE);
		panel.setBounds(24, 31, 230, 301);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome Completo");
		lblNome.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNome.setBounds(264, 21, 170, 14);
		contentPane.add(lblNome);
		
		nome = new JTextField();
		nome.setToolTipText("Digite seu nome completo.");
		nome.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		nome.setForeground(Color.DARK_GRAY);
		nome.setBackground(Color.WHITE);
		nome.setBounds(264, 46, 448, 30);
		contentPane.add(nome);
		nome.setColumns(10);
		
		JLabel lblCpf = new JLabel("Nome de Usu\u00E1rio");
		lblCpf.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblCpf.setBounds(264, 87, 170, 14);
		contentPane.add(lblCpf);
		
		nome_usuario = new JTextField();
		nome_usuario.setToolTipText("Digite um nome de usu\u00E1rio. Ex: meunome_meusobrenome");
		nome_usuario.setBackground(Color.WHITE);
		nome_usuario.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		nome_usuario.setForeground(Color.DARK_GRAY);
		nome_usuario.setBounds(264, 112, 448, 30);
		contentPane.add(nome_usuario);
		nome_usuario.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblSexo.setBounds(264, 146, 46, 30);
		contentPane.add(lblSexo);
		
		JComboBox sexo = new JComboBox();
		sexo.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma op\u00E7\u00E3o...", "Feminino", "Masculino"}));
		sexo.setToolTipText("Selecione uma op\u00E7\u00E3o.");
		sexo.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		sexo.setForeground(Color.DARK_GRAY);
		sexo.setBounds(264, 178, 448, 30);
		contentPane.add(sexo);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblSenha.setBounds(264, 219, 129, 14);
		contentPane.add(lblSenha);
		
		senha = new JPasswordField();
		senha.setToolTipText("Digite sua senha. Sua senha pode conter n\u00FAmeros e letras.");
		senha.setBackground(Color.WHITE);
		senha.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		senha.setForeground(Color.DARK_GRAY);
		senha.setBounds(264, 244, 448, 30);
		contentPane.add(senha);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		lblConfirmarSenha.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblConfirmarSenha.setBounds(263, 277, 183, 30);
		contentPane.add(lblConfirmarSenha);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setToolTipText("Confirme sua senha.");
		passwordField_1.setBackground(Color.WHITE);
		passwordField_1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		passwordField_1.setForeground(Color.DARK_GRAY);
		passwordField_1.setBounds(264, 310, 448, 30);
		contentPane.add(passwordField_1);
		
		JLabel lblLembreDeSenha = new JLabel("Lembrete de Senha");
		lblLembreDeSenha.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblLembreDeSenha.setBounds(10, 375, 183, 30);
		contentPane.add(lblLembreDeSenha);
		
		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 416, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomeDaMe = new JLabel("Nome da M\u00E3e");
		lblNomeDaMe.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNomeDaMe.setBounds(10, 482, 183, 14);
		contentPane.add(lblNomeDaMe);
		
		nome_mae = new JTextField();
		nome_mae.setToolTipText("Informe o nome da m\u00E3e para recuperar senha futuramente!");
		nome_mae.setBackground(Color.WHITE);
		nome_mae.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		nome_mae.setForeground(Color.DARK_GRAY);
		nome_mae.setBounds(10, 507, 702, 30);
		contentPane.add(nome_mae);
		nome_mae.setColumns(10);
		
		JLabel lblSalvar = new JLabel("Salvar");
		lblSalvar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					PreparedStatement pst = conecta.conn.prepareStatement("insert into Perfil"
						+ "(nome_mae, cpf, senha, nome_usuario, sexo, nome) values"
						+ "(?,?,?,?,?,?");
					
					pst.setString(1, nome_mae.getText());
					//pst.setInt(2, x);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//passar os dados por parametro para a tabela.
			}
		});
		lblSalvar.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblSalvar.setIcon(new ImageIcon(JCadastroDePerfil.class.getResource("/img/floppy1.png")));
		lblSalvar.setBounds(595, 594, 109, 55);
		contentPane.add(lblSalvar);
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblVoltar.setIcon(new ImageIcon(JCadastroDePerfil.class.getResource("/img/leftarrow.png")));
		lblVoltar.setBounds(10, 594, 694, 55);
		contentPane.add(lblVoltar);
		
		JLabel lblCarregarFoto = new JLabel("Inserir foto");
		lblCarregarFoto.setBounds(93, 332, 65, 14);
		contentPane.add(lblCarregarFoto);
		
		JFormattedTextField cpf = new JFormattedTextField();
		cpf.setBounds(10, 438, 702, 30);
		contentPane.add(cpf);
	}
}
