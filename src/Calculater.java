import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculater {

	private JFrame frame;
	private JTextField textDisplay;
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculater window = new Calculater();
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
	public Calculater() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 266, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setBounds(10, 11, 230, 32);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		//----------------------------Row 1--------------------------
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber =textDisplay.getText() + btn7.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 110, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() +btn8.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(66, 110, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textDisplay.getText() + btn9.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(122, 110, 58, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(190, 58, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		//---------------------------Row 2 -------------------------------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textDisplay.getText() + btn4.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 162, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber =textDisplay.getText() + btn5.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(66, 162, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber =textDisplay.getText() + btn6.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(122, 162, 58, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(190, 110, 50, 50);
		frame.getContentPane().add(btnSub);
		
		//---------------------------Row 3--------------------------
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber =textDisplay.getText() + btn1.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 215, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber =textDisplay.getText() + btn2.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(66, 215, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textDisplay.getText() + btn3.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(122, 215, 58, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations="*";
			}
		});
		btnMult .setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult .setBounds(190, 162, 50, 50);
		frame.getContentPane().add(btnMult );
		
	//---------------------------Row 3--------------------------
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber =textDisplay.getText() + btn0.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 269, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(66, 269, 50, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("+\r\n-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pm = Double.parseDouble(textDisplay.getText());
				pm = pm * (-1);
				textDisplay.setText(String.valueOf(pm));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPM.setBounds(122, 269, 58, 50);
		frame.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNum = Double.parseDouble(textDisplay.getText());
				if(operations=="+")
				{
					result=firstNum + secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				
				if(operations=="-")
				{
					result=firstNum - secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				
				if(operations=="*")
				{
					result=firstNum * secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				
				if(operations=="/")
				{
					result=firstNum / secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				
				if(operations=="%")
				{
					result=firstNum % secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
			}
		});
		btnEqual .setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual .setBounds(190, 269, 50, 50);
		frame.getContentPane().add(btnEqual );
		
		JButton btnD = new JButton("D\r\n");
		btnD.setToolTipText("");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace=null;
				if(textDisplay.getText().length()>0){
					StringBuilder str = new StringBuilder(textDisplay.getText());
					str.deleteCharAt(textDisplay.getText().length()-1);
					backspace =str.toString();
					textDisplay.setText(backspace);
				}
			}
		});
		btnD.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnD.setBounds(10, 58, 50, 50);
		frame.getContentPane().add(btnD);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textDisplay.setText(null);
			}
		});
		btnC.setToolTipText("");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(66, 58, 50, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnP = new JButton("%");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations="%";
			}
		});
		btnP.setToolTipText("");
		btnP.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnP.setBounds(122, 58, 58, 50);
		frame.getContentPane().add(btnP);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations="/";
			}
		});
		btnDiv.setToolTipText("");
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(190, 215, 50, 50);
		frame.getContentPane().add(btnDiv);
	}
}
