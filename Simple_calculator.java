import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Simple_calculator {

	private JFrame frame;
	private JTextField textField;
	double firstnum;
	double secondnum;
	String answer;
	String operation;
	double result;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simple_calculator window = new Simple_calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Simple_calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 374, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 338, 71);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterName = textField.getText()+btn9.getText();
				textField.setText(EnterName);
			}
		});
		btn9.setBounds(10, 93, 66, 42);
		frame.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterName = textField.getText()+btn8.getText();
				textField.setText(EnterName);
			}
		});
		btn8.setBounds(105, 93, 66, 42);
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterName = textField.getText()+btn7.getText();
				textField.setText(EnterName);
			}
		});
		btn7.setBounds(194, 93, 66, 42);
		frame.getContentPane().add(btn7);
		
		JButton btnclr = new JButton("C");
		btnclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
			
		});
		btnclr.setBounds(282, 93, 66, 42);
		frame.getContentPane().add(btnclr);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterName = textField.getText()+btn6.getText();
				textField.setText(EnterName);
			}
		});
		btn6.setBounds(10, 157, 66, 42);
		frame.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterName = textField.getText()+btn5.getText();
				textField.setText(EnterName);
			}
		});
		btn5.setBounds(105, 157, 66, 42);
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterName = textField.getText()+btn4.getText();
				textField.setText(EnterName);
			}
		});
		btn4.setBounds(194, 157, 66, 42);
		frame.getContentPane().add(btn4);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		
		btnplus.setBounds(282, 157, 66, 42);
		frame.getContentPane().add(btnplus);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterName = textField.getText()+btn3.getText();
				textField.setText(EnterName);
			}
		});
		btn3.setBounds(10, 221, 66, 42);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterName = textField.getText()+btn2.getText();
				textField.setText(EnterName);
			}
		});
		btn2.setBounds(105, 221, 66, 42);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterName = textField.getText()+btn1.getText();
				textField.setText(EnterName);
			}
		});
		btn1.setBounds(194, 221, 66, 42);
		frame.getContentPane().add(btn1);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		
		btnsub.setBounds(282, 221, 66, 42);
		frame.getContentPane().add(btnsub);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterName = textField.getText()+btn0.getText();
				textField.setText(EnterName);
			}
		});
		btn0.setBounds(10, 290, 66, 42);
		frame.getContentPane().add(btn0);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btndiv.setBounds(105, 290, 66, 42);
		frame.getContentPane().add(btndiv);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnmul.setBounds(194, 290, 66, 42);
		frame.getContentPane().add(btnmul);
		
		JButton btneql = new JButton("=");
		btneql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondnum = Double.parseDouble(textField.getText());
				if (operation =="+") { 
					result = firstnum + secondnum;
					answer = String.format("%5f",result);
					textField.setText(answer);
			}
				else if (operation == "-") {
					result = firstnum - secondnum;
					answer = String.format("%5f",result);
					textField.setText(answer);
					
				}
				else if (operation == "*") {
					result = firstnum * secondnum;
					answer = String.format("%5f",result);
					textField.setText(answer);
					
				}
				else if (operation == "/") {
					result = firstnum / secondnum;
					answer = String.format("%5f",result);
					textField.setText(answer);
					
				}
			}
		});
		
		btneql.setBounds(282, 290, 66, 42);
		frame.getContentPane().add(btneql);
	}
}
