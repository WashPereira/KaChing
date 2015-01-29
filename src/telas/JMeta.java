package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class JMeta extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMeta frame = new JMeta();
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
	public JMeta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 734, 661);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Cadastro", null, panel, null);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Nome\r\n");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(10, 11, 121, 26);
		panel.add(label);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(SystemColor.window);
		editorPane.setBounds(10, 40, 574, 26);
		panel.add(editorPane);
		
		JLabel label_1 = new JLabel("Descri\u00E7\u00E3o");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(10, 77, 121, 26);
		panel.add(label_1);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(10, 114, 574, 158);
		panel.add(editorPane_1);
		
		JLabel label_2 = new JLabel("Selecione uma op\u00E7\u00E3o");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(10, 283, 149, 26);
		panel.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Caixa/Paupar", "Despesa", "Receita"}));
		comboBox.setBounds(10, 320, 574, 26);
		panel.add(comboBox);
		
		JLabel label_3 = new JLabel("Data a Cumprir");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(10, 357, 149, 26);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Voltar");
		label_4.setIcon(new ImageIcon(JMeta.class.getResource("/img/leftarrow.png")));
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		label_4.setToolTipText("Clique aqui para voltar a tela inicial.");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(10, 409, 130, 79);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Salvar\r\n");
		label_5.setIcon(new ImageIcon(JMeta.class.getResource("/img/floppy1.png")));
		label_5.setToolTipText("Clique aqui para voltar a tela inicial.");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(454, 409, 130, 79);
		panel.add(label_5);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Metas Cadastradas\r\n", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de Metas");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 149, 31);
		panel_1.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(10, 286, 317, -228);
		panel_1.add(table);
		
		JLabel label_6 = new JLabel("Apagar");
		label_6.setIcon(new ImageIcon(JMeta.class.getResource("/img/apagar.png")));
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_6.setBounds(10, 293, 149, 69);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("Editar\r\n");
		label_7.setIcon(new ImageIcon(JMeta.class.getResource("/img/editar3.png")));
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_7.setBounds(434, 293, 149, 69);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("Voltar");
		label_8.setIcon(new ImageIcon(JMeta.class.getResource("/img/leftarrow.png")));
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_8.setBounds(10, 402, 149, 69);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Salvar");
		label_9.setIcon(new ImageIcon(JMeta.class.getResource("/img/floppy1.png")));
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_9.setBounds(434, 402, 149, 69);
		panel_1.add(label_9);
		
		table_1 = new JTable();
		table_1.setSurrendersFocusOnKeystroke(true);
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.setFillsViewportHeight(true);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"N\u00BA", "Nome - Descri\u00E7\u00E3o", "Status", "Valor", "Data"
			}
		));
		table_1.getColumnModel().getColumn(1).setPreferredWidth(304);
		table_1.setForeground(Color.WHITE);
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_1.setBounds(10, 45, 560, 230);
		panel_1.add(table_1);
	}
}
