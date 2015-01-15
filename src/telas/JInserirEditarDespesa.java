package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.Choice;
import java.awt.TextArea;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Scrollbar;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;

public class JInserirEditarDespesa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 * É só uma ideia
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInserirEditarDespesa frame = new JInserirEditarDespesa();
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
	public JInserirEditarDespesa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("Clique para inserir o nome para despesa.");
		textField.setBounds(135, 35, 194, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNomeDaDespesa = new JLabel("Nome da despesa:");
		lblNomeDaDespesa.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNomeDaDespesa.setBounds(28, 38, 114, 14);
		contentPane.add(lblNomeDaDespesa);
		
		JLabel lblVencimento = new JLabel("Vencimento:");
		lblVencimento.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblVencimento.setBounds(28, 75, 79, 14);
		contentPane.add(lblVencimento);
		
		JLabel lblDescrioDaDespesa = new JLabel("Descri\u00E7\u00E3o da despesa:");
		lblDescrioDaDespesa.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblDescrioDaDespesa.setBounds(28, 107, 126, 14);
		contentPane.add(lblDescrioDaDespesa);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(160, 107, 234, 74);
		contentPane.add(textArea);
		
		JLabel lblQuantidadeDeParcelas = new JLabel("Quantidade de parcelas:");
		lblQuantidadeDeParcelas.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblQuantidadeDeParcelas.setBounds(28, 212, 144, 14);
		contentPane.add(lblQuantidadeDeParcelas);
		
		JLabel lblValorR = new JLabel("Valor R$:");
		lblValorR.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblValorR.setBounds(28, 251, 60, 14);
		contentPane.add(lblValorR);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setToolTipText("Insira o valor da despesa em reais. N\u00E3o pode ser valores negativos.");
		formattedTextField.setBounds(98, 248, 85, 20);
		contentPane.add(formattedTextField);
		
		JButton btnCancelar = new JButton("Ok");
		btnCancelar.setToolTipText("Clique para confirmar as edi\u00E7\u00F5es realizadas.");
		btnCancelar.setBounds(228, 307, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnCancelar_1 = new JButton("Cancelar");
		btnCancelar_1.setToolTipText("Clique para cancelar as edi\u00E7\u00F5es realizadas.");
		btnCancelar_1.setBounds(127, 307, 89, 23);
		contentPane.add(btnCancelar_1);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setToolTipText("Clique para sair da tela.");
		btnSair.setBounds(324, 307, 89, 23);
		contentPane.add(btnSair);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setToolTipText("Selecione a data de vencimento da despesa.");
		dateChooser.setBounds(117, 69, 87, 20);
		contentPane.add(dateChooser);
		
		JSpinField spinField = new JSpinField();
		spinField.setToolTipText("Selecione a quantidade de parcelas desta despesa, caso necess\u00E1rio.");
		spinField.setBounds(160, 212, 29, 20);
		contentPane.add(spinField);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 416, 270);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 284, 416, 58);
		contentPane.add(panel_1);
	}
}
