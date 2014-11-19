import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaConversor extends JFrame {
	private JPanel contentPane;
	private JTextField ValorEuros;
	private JTextField ValorDolares;

		public VentanaConversor(float valorConversion) {
		//VENTANA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 170);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//ZONA DOLARES
		JLabel label_1 = new JLabel("Dolares");
		label_1.setBounds(10, 63, 86, 14);
		contentPane.add(label_1);
		
		ValorDolares = new JTextField();
		ValorDolares.setColumns(10);
		ValorDolares.setBounds(10, 88, 86, 20);
		contentPane.add(ValorDolares);
		
		//ZONA EUROS
		JLabel label = new JLabel("Euros");
		label.setBounds(10, 11, 86, 14);
		contentPane.add(label);
		
		ValorEuros = new JTextField();
		ValorEuros.setColumns(10);
		ValorEuros.setBounds(10, 32, 86, 20);
		contentPane.add(ValorEuros);
		
		
		
		//BOTON conversión
		JButton btnNewButton = new JButton("Convertir");
		 btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float euros;
				euros=Float.parseFloat(ValorEuros.getText());
				ValorDolares.setText(String.valueOf(euros*valorConversion));
			}
		});
		 btnNewButton.setBounds(110, 87, 89, 23);
		contentPane.add(btnNewButton);
	}
}
