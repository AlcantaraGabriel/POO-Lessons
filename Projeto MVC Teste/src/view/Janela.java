package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.ControleMedia;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTurma;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtMedia;
	private  ControleMedia controle;

	private Map<String, JComponent> elements;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		elements = new HashMap<>();
		controle = new ControleMedia(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Programa calcula m\u00E9dia do aluno");
		lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(38, 11, 360, 26);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(85, 63, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtTurma = new JTextField();
		txtTurma.setBounds(85, 108, 86, 20);
		contentPane.add(txtTurma);
		txtTurma.setColumns(10);
		
		txtN1 = new JTextField();
		txtN1.setBounds(85, 144, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(283, 144, 86, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);
		
		txtMedia = new JTextField();
		txtMedia.setBounds(283, 216, 86, 20);
		contentPane.add(txtMedia);
		txtMedia.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//JOptionPane.showMessageDialog(txtNome, "Media Calculada!");	
			controle.efetuarMedia();
			}
		});
		btnCalcular.setBounds(82, 215, 89, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(24, 66, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setBounds(24, 111, 46, 14);
		contentPane.add(lblTurma);
		
		JLabel lblN = new JLabel("Nota 1:");
		lblN.setBounds(24, 147, 46, 14);
		contentPane.add(lblN);
		
		JLabel lblN_1 = new JLabel("Nota 2:");
		lblN_1.setBounds(227, 147, 46, 14);
		contentPane.add(lblN_1);
		
		JLabel lblMdia = new JLabel("M\u00E9dia:");
		lblMdia.setBounds(227, 219, 46, 14);
		contentPane.add(lblMdia);
		
		elements.put("txtNome", txtNome);
		elements.put("txtTurma", txtTurma);
		elements.put("txtN1", txtN1);
		elements.put("txtN2", txtN2);
		elements.put("txtMedia",txtMedia);
		}
	
	/**
	 * Create the frame
	 */
	
	public JComponent recuperarElemento(String key){
		return elements.get(key);
	}
}
