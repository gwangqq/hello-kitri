package com.kitri.awt.design;

import java.awt.*;



public class ListTest extends Frame{
//		선언부
	Panel pW = new Panel();
	Panel pC = new Panel();
	Panel pE = new Panel();

//		pW에 들어가야하는거 

	List listL = new List();
	TextField tfL = new TextField();

//		pC에 들어가야하는거 
	Button btR = new Button("▷");
	Button btRAll = new Button("▶");
	Button btL = new Button("◁");
	Button btLAll = new Button("◀");

//		pE에 들어가야하는거
	List listR = new List();
	TextField tfR = new TextField();

	
	public ListTest () {
			super("ListTest");
	
//		판넬에 기능 구현
//		pL에 기능 삽입

		pW.setLayout(new BorderLayout(0,10));
		pW.add(listL, "Center");
		pW.add(tfL, "South");
//		

//		pC에 기능 삽입
//		
		pC.setLayout(new GridLayout(6, 1 , 10, 10));
		pC.add(new Label(" "));
		pC.add(btR);
		pC.add(btRAll);
		pC.add(btL);
		pC.add(btLAll);
		

//		pE에 기능 삽입
		pE.setLayout(new BorderLayout(0,10));
		pE.add(listR, "Center");
		pE.add(tfR, "South");
		
//		전체 layout 설정
		/*
		 * setLayout(new GridLayout(1,3,10,0);
		 * add(pW);
		 * add(pC);
		 * add(pE);
		 * setBounds(300, 200, 300, 400);
		 * setVisible(true);
		 */
		setLayout(new BorderLayout());
		add(pW, "West");
		add(pC, "Center");
		add(pE, "East");
		setBounds(300, 200, 300, 400);
		setVisible(true);
}
	public static void main(String[] args) {
		new ListTest();

	}

}
