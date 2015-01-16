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
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;


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
		setBounds(100, 100, 1246, 761);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Perfil de Usu\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 242, 252);
		contentPane.add(panel);
		
		JLabel ImgPerfilM = new JLabel("");
		ImgPerfilM.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/Man.png")));
		panel.add(ImgPerfilM);
		
		JLabel EditarPerfil = new JLabel("Editar Perfil");
		EditarPerfil.setVerticalAlignment(SwingConstants.TOP);
		EditarPerfil.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/editar.png")));
		panel.add(EditarPerfil);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Calendario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setToolTipText("");
		panel_1.setBounds(10, 274, 242, 216);
		contentPane.add(panel_1);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("25px"),
				ColumnSpec.decode("191px"),},
			new RowSpec[] {
				RowSpec.decode("21px"),
				RowSpec.decode("153px"),}));
		
		JCalendar calendar = new JCalendar();
		panel_1.add(calendar, "2, 2, left, top");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Controle do Caixa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(270, 11, 931, 479);
		contentPane.add(panel_2);
		panel_2.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("145px"),
				ColumnSpec.decode("635px"),
				ColumnSpec.decode("114px"),},
			new RowSpec[] {
				RowSpec.decode("22px"),
				RowSpec.decode("52px"),
				FormFactory.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("52px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("52px"),
				FormFactory.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("50px"),
				FormFactory.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("57px"),}));
		
		JLabel InserirReceita = new JLabel("Inserir Receita");
		panel_2.add(InserirReceita, "2, 2, fill, fill");
		InserirReceita.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/plus+.png")));
		
		JLabel InserirDespesas = new JLabel("Inserir Despesas");
		panel_2.add(InserirDespesas, "2, 4, fill, fill");
		InserirDespesas.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/rounded61.png")));
		
		JLabel InserirMetas = new JLabel("Inserir Metas");
		panel_2.add(InserirMetas, "2, 6, fill, bottom");
		InserirMetas.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/alvo.png")));
		
		JLabel PouparDinheiro = new JLabel("Poupar Dinheiro");
		panel_2.add(PouparDinheiro, "2, 8, left, center");
		PouparDinheiro.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/pig.png")));
		
		JLabel Relatorios = new JLabel("Relat\u00F3rios");
		panel_2.add(Relatorios, "2, 10, left, center");
		Relatorios.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/relatorio..png")));
		
		JLabel lblNewLabel = new JLabel("Check-In");
		lblNewLabel.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/marcar.png")));
		panel_2.add(lblNewLabel, "4, 2, fill, fill");
		
		JLabel lblNewLabel_1 = new JLabel("Editar");
		lblNewLabel_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/editar3.png")));
		panel_2.add(lblNewLabel_1, "4, 4, fill, fill");
		
		JLabel lblApagar = new JLabel("Apagar");
		lblApagar.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/apagar.png")));
		panel_2.add(lblApagar, "4, 6, fill, fill");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Linha do Tempo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 501, 1191, 209);
		contentPane.add(panel_3);
		
	}
}
