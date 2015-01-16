package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class JLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin frame = new JLogin();
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
	public JLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKaching = new JLabel("KaChing");
		lblKaching.setForeground(Color.GRAY);
		lblKaching.setFont(new Font("Segoe UI Light", Font.PLAIN, 60));
		lblKaching.setIcon(new ImageIcon(JLogin.class.getResource("/img/money139.png")));
		lblKaching.setBounds(174, 11, 247, 115);
		contentPane.add(lblKaching);
		
		JLabel lblNomeDeUsurio = new JLabel("Nome de Usu\u00E1rio");
		lblNomeDeUsurio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeDeUsurio.setBounds(57, 156, 180, 14);
		contentPane.add(lblNomeDeUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSenha.setBounds(57, 238, 46, 14);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(57, 181, 275, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(57, 263, 275, 33);
		contentPane.add(passwordField);
		
		JLabel lblEntar = new JLabel("Entrar");
		lblEntar.setIcon(new ImageIcon(JLogin.class.getResource("/img/arrow242.png")));
		lblEntar.setBounds(371, 146, 98, 58);
		contentPane.add(lblEntar);
		
		JLabel lblCadastrar = new JLabel("Cadastrar");
		lblCadastrar.setIcon(new ImageIcon(JLogin.class.getResource("/img/pencil78.png")));
		lblCadastrar.setBounds(371, 202, 125, 58);
		contentPane.add(lblCadastrar);
		
		JLabel lblEsqueciMinhaSenha = new JLabel("Esqueci minha \r\nsenha");
		lblEsqueciMinhaSenha.setIcon(new ImageIcon(JLogin.class.getResource("/img/question.png")));
		lblEsqueciMinhaSenha.setBounds(371, 262, 194, 50);
		contentPane.add(lblEsqueciMinhaSenha);
	}
}
