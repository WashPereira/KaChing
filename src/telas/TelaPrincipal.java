package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import com.toedter.calendar.JCalendar;


public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("KaChing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Perfil de Usu\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 223, 252);
		contentPane.add(panel);
		
		JLabel ImgPerfilM = new JLabel("");
		ImgPerfilM.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/Man.png")));
		panel.add(ImgPerfilM);
		
		JLabel EditarPerfil = new JLabel("Editar Perfil");
		EditarPerfil.setVerticalAlignment(SwingConstants.TOP);
		EditarPerfil.setIcon(null);
		panel.add(EditarPerfil);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Calendario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setToolTipText("");
		panel_1.setBounds(10, 274, 223, 186);
		contentPane.add(panel_1);
		
		JCalendar calendar = new JCalendar();
		panel_1.add(calendar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Controle do Caixa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(243, 11, 931, 449);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel InserirReceita = new JLabel("Inserir Receita");
		InserirReceita.setBounds(10, 22, 145, 62);
		panel_2.add(InserirReceita);
		InserirReceita.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/plus+.png")));
		
		JLabel InserirDespesas = new JLabel("Inserir Despesas");
		InserirDespesas.setBounds(10, 83, 145, 57);
		panel_2.add(InserirDespesas);
		InserirDespesas.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/rounded61.png")));
		
		JLabel InserirMetas = new JLabel("Inserir Metas");
		InserirMetas.setBounds(10, 151, 145, 52);
		panel_2.add(InserirMetas);
		InserirMetas.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/alvo.png")));
		
		JLabel PouparDinheiro = new JLabel("Poupar Dinheiro");
		PouparDinheiro.setBounds(10, 210, 145, 50);
		panel_2.add(PouparDinheiro);
		PouparDinheiro.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/pig.png")));
		
		JLabel Relatorios = new JLabel("Relat\u00F3rios");
		Relatorios.setBounds(10, 271, 145, 57);
		panel_2.add(Relatorios);
		Relatorios.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/relatorio..png")));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(837, 46, 46, 14);
		panel_2.add(lblNewLabel);

		
	}
}
