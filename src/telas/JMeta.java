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

public class JMeta extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 750, 700);
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
		
		JLabel label = new JLabel("Nome");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(10, 11, 57, 26);
		panel.add(label);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 40, 372, 26);
		panel.add(editorPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Metas Cadastradas", null, panel_1, null);
	}
}
