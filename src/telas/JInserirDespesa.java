package telas;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;
import java.awt.TextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JInserirDespesa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 * by: Wanderson R
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInserirDespesa frame = new JInserirDespesa();
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
	public JInserirDespesa() {
		setTitle("Inserir Despesa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeDaDespesa = new JLabel("Nome da despesa:");
		lblNomeDaDespesa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNomeDaDespesa.setBounds(23, 43, 118, 14);
		contentPane.add(lblNomeDaDespesa);
		
		textField = new JTextField();
		textField.setToolTipText("Insira o nome da despesa.");
		textField.setBounds(141, 41, 204, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblVencimento = new JLabel("Vencimento:");
		lblVencimento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVencimento.setBounds(23, 92, 109, 14);
		contentPane.add(lblVencimento);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setToolTipText("Insira a data de vencimento da despesa.");
		dateChooser.setBounds(141, 86, 109, 20);
		contentPane.add(dateChooser);
		
		JLabel lblQuantidadeDeParcelas = new JLabel("Quantidade de parcelas:");
		lblQuantidadeDeParcelas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblQuantidadeDeParcelas.setBounds(23, 140, 149, 14);
		contentPane.add(lblQuantidadeDeParcelas);
		
		JSpinField spinField = new JSpinField();
		spinField.setToolTipText("Escolha a quantidade de parcelas desta despesa, caso necess\u00E1rio.");
		spinField.setBounds(182, 134, 29, 20);
		contentPane.add(spinField);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescrio.setBounds(23, 192, 78, 14);
		contentPane.add(lblDescrio);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(141, 192, 218, 94);
		contentPane.add(textArea);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblValor.setBounds(23, 311, 78, 14);
		contentPane.add(lblValor);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setToolTipText("Insira o valor da despesa. N\u00E3o pode conter letras e nem n\u00FAmeros negativos.");
		formattedTextField.setBounds(135, 309, 76, 20);
		contentPane.add(formattedTextField);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(9, 11, 431, 343);
		contentPane.add(panel);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setToolTipText("Clique para cancelar e descartar as iforma\u00E7\u00F5es.");
		btnCancelar.setBounds(118, 379, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setToolTipText("Clique para salvar as informa\u00E7\u00F5es inseridas.");
		btnOk.setBounds(223, 379, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja realmente sair?","ATENÇÃO ",javax.swing.JOptionPane.YES_NO_OPTION )==0){  
		            JInserirDespesa.this.dispose();
				}
			}
		});
		btnSair.setToolTipText("Clique para sair da tela.");
		btnSair.setBounds(333, 379, 89, 23);
		contentPane.add(btnSair);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 358, 430, 64);
		contentPane.add(panel_1);
	}
}
