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
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class JCadastroDePerfil extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Foto do Usu\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 21, 244, 319);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCarregarFoto = new JLabel("Inserir foto");
		lblCarregarFoto.setBounds(84, 294, 65, 14);
		panel.add(lblCarregarFoto);
		
		JLabel lblNome = new JLabel("Nome Completo");
		lblNome.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNome.setBounds(264, 21, 170, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textField.setForeground(Color.DARK_GRAY);
		textField.setBackground(Color.WHITE);
		textField.setBounds(264, 46, 460, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("Nome de Usu\u00E1rio");
		lblCpf.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblCpf.setBounds(264, 87, 170, 14);
		contentPane.add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textField_1.setForeground(Color.DARK_GRAY);
		textField_1.setBounds(264, 112, 460, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblSexo.setBounds(264, 153, 46, 30);
		contentPane.add(lblSexo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setBounds(264, 178, 460, 30);
		contentPane.add(comboBox);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblSenha.setBounds(264, 219, 129, 14);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.WHITE);
		passwordField.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		passwordField.setForeground(Color.DARK_GRAY);
		passwordField.setBounds(264, 244, 460, 30);
		contentPane.add(passwordField);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		lblConfirmarSenha.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblConfirmarSenha.setBounds(264, 285, 183, 30);
		contentPane.add(lblConfirmarSenha);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(Color.WHITE);
		passwordField_1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		passwordField_1.setForeground(Color.DARK_GRAY);
		passwordField_1.setBounds(264, 310, 460, 30);
		contentPane.add(passwordField_1);
		
		JLabel lblLembreDeSenha = new JLabel("Lembrete de Senha");
		lblLembreDeSenha.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblLembreDeSenha.setBounds(10, 375, 183, 30);
		contentPane.add(lblLembreDeSenha);
		
		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 416, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textField_2.setForeground(Color.DARK_GRAY);
		textField_2.setBounds(10, 441, 714, 30);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNomeDaMe = new JLabel("Nome da M\u00E3e");
		lblNomeDaMe.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNomeDaMe.setBounds(10, 482, 183, 14);
		contentPane.add(lblNomeDaMe);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.WHITE);
		textField_3.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textField_3.setForeground(Color.DARK_GRAY);
		textField_3.setBounds(10, 507, 714, 30);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSalvar = new JLabel("Salvar");
		lblSalvar.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblSalvar.setIcon(new ImageIcon(JCadastroDePerfil.class.getResource("/img/floppy1.png")));
		lblSalvar.setBounds(595, 594, 109, 55);
		contentPane.add(lblSalvar);
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblVoltar.setIcon(new ImageIcon(JCadastroDePerfil.class.getResource("/img/leftarrow.png")));
		lblVoltar.setBounds(10, 594, 694, 55);
		contentPane.add(lblVoltar);
	}
}
