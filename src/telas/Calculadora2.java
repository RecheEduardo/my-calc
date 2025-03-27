package telas;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora2 extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JTextField display = new JTextField();
	
	private JButton[] buttons = new JButton[16];	
	private String[] labels = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", ".", "0", "=", "/"};
	private Font fonte1 = new Font("Arial", Font.BOLD, 26);
	private Font fonte2 = new Font("Arial", Font.BOLD, 10);
	
	private String operador = "";
	private String valorAcumulado = ""; 

}
