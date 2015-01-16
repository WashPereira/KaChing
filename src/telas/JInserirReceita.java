package telas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes_extras.JNumberFormatField;//importando classe da mascara.

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JInserirReceita extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInserirReceita frame = new JInserirReceita();
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
	public JInserirReceita() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JNumberFormatField saldo_atual = new JNumberFormatField();
		saldo_atual.setEditable(false);
		saldo_atual.setBounds(128, 45, 121, 20);
		contentPane.add(saldo_atual);
		
		JLabel lblSaldoAtual = new JLabel("Saldo Atual:");
		lblSaldoAtual.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSaldoAtual.setBounds(35, 48, 83, 14);
		contentPane.add(lblSaldoAtual);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Saldo atual do caixa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 414, 75);
		contentPane.add(panel);
		
		JLabel lblInserir = new JLabel("Inserir:");
		lblInserir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInserir.setBounds(35, 123, 46, 14);
		contentPane.add(lblInserir);
		
		JNumberFormatField inserir_saldo = new JNumberFormatField();
		inserir_saldo.setToolTipText("Clique para inserir ou acrescentar um novo valor para o caixa.");
		inserir_saldo.setBounds(128, 121, 121, 20);
		contentPane.add(inserir_saldo);
		
		JLabel lblInserir_1 = new JLabel("Inserir");
		lblInserir_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String teste = inserir_saldo.getText().replaceAll("[^1-9]",""); // Isso irá retirar qualquer caracter diferente de 1 e 9.
				if (teste.isEmpty()){
					JOptionPane.showMessageDialog(inserir_saldo, "O campo está vazio. Verifique e tente novamente!");
				}
			}
		});
		lblInserir_1.setToolTipText("Clique para inserir ou atualizar o saldo atual do caixa.");
		lblInserir_1.setBounds(271, 106, 115, 50);
		contentPane.add(lblInserir_1);
		lblInserir_1.setIcon(new ImageIcon(JInserirReceita.class.getResource("/img/marcar.png")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Atualizar saldo atual do caixa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 87, 414, 90);
		contentPane.add(panel_1);
		
		JLabel lblPoupana = new JLabel("Poupan\u00E7a:");
		lblPoupana.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPoupana.setBounds(35, 214, 76, 14);
		contentPane.add(lblPoupana);
		
		JNumberFormatField poupanca = new JNumberFormatField();
		poupanca.setToolTipText("Clique para inserir um valor para acrescentar em sua poupan\u00E7a.");
		poupanca.setBounds(128, 212, 121, 20);
		contentPane.add(poupanca);
		
		JLabel lblPoupar = new JLabel("Poupar");
		lblPoupar.setToolTipText("Clique para atualizar o saldo de sua poupan\u00E7a.");
		lblPoupar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String teste = poupanca.getText().replaceAll("[^1-9]",""); // Isso irá retirar qualquer caracter diferente de 1 e 9.
				if (teste.isEmpty()){
					JOptionPane.showMessageDialog(poupanca, "O campo está vazio. Verifique e tente novamente!");
				}
			}
		});
		lblPoupar.setForeground(Color.BLACK);
		lblPoupar.setIcon(new ImageIcon(JInserirReceita.class.getResource("/img/pig.png")));
		lblPoupar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPoupar.setBounds(271, 193, 115, 56);
		contentPane.add(lblPoupar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Atualizar saldo atual da poupan\u00E7a", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 181, 414, 90);
		contentPane.add(panel_2);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja realmente sair?","ATENÇÃO ",javax.swing.JOptionPane.YES_NO_OPTION )==0){  
		            JInserirReceita.this.dispose();
				}
			}
		});
		btnSair.setBounds(311, 282, 89, 23);
		contentPane.add(btnSair);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 273, 413, 40);
		contentPane.add(panel_3);
	}
}
