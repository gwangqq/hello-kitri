package javaexercise;

import java.awt.*;

import javax.swing.border.Border;

public class Calculator extends Frame{

//	�ǳ� ����  ��, ��, ��
 	Panel pN = new Panel();
	Panel pC = new Panel();
	Panel pS = new Panel();

//	��. ����
	TextField numL = new TextField();//Border ����
	TextField operL = new TextField();//border east
//	��. ����
	
	Button btn[] = new Button[16];
	
	
//	��. ����
	Button exit = new Button("����");
	
	
	
	public Calculator () {
//		��� ����
//		��.
		super("Calculator !!!!!");
		pN.setLayout(new BorderLayout());
		pN.add(numL, "Center");
		pN.add(operL, "East");
//		��.
		pC.setLayout(new GridLayout(4,4, 10, 10));
		String num[] = {"7", "8", "9", "+", "4", "5", "6", "-",
				"1", "2", "3", "*", "0", "C", "=", "/"};
		int len = btn.length;
		Font f = new Font("����", Font.BOLD, 20);
		for(int i = 0 ; i < len; i++) {
			btn[i] = new Button();
			btn[i].setLabel(num[i]);
			btn[i].setFont(f);
			pC.add(btn[i]);
		}
		
//		��.
		
		pS.setLayout(new GridLayout(1,1));
		pS.add(exit);
		
		
//		��ü ����
		
		setLayout(new BorderLayout());
		add(pN, "North");
		add(pC, "Center");
		add(pS, "South");
		setBounds(300, 200, 300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
	new Calculator ();

	}
}
