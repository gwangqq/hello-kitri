package javaexercise;

import java.awt.*;

import javax.swing.border.Border;

public class Calculator extends Frame{

//	판넬 구분  상, 중, 하
 	Panel pN = new Panel();
	Panel pC = new Panel();
	Panel pS = new Panel();

//	상. 선언
	TextField numL = new TextField();//Border 센터
	TextField operL = new TextField();//border east
//	중. 선언
	
	Button btn[] = new Button[16];
	
	
//	하. 선언
	Button exit = new Button("종료");
	
	
	
	public Calculator () {
//		기능 구현
//		상.
		super("Calculator !!!!!");
		pN.setLayout(new BorderLayout());
		pN.add(numL, "Center");
		pN.add(operL, "East");
//		중.
		pC.setLayout(new GridLayout(4,4, 10, 10));
		String num[] = {"7", "8", "9", "+", "4", "5", "6", "-",
				"1", "2", "3", "*", "0", "C", "=", "/"};
		int len = btn.length;
		Font f = new Font("돋움", Font.BOLD, 20);
		for(int i = 0 ; i < len; i++) {
			btn[i] = new Button();
			btn[i].setLabel(num[i]);
			btn[i].setFont(f);
			pC.add(btn[i]);
		}
		
//		하.
		
		pS.setLayout(new GridLayout(1,1));
		pS.add(exit);
		
		
//		전체 계산기
		
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
