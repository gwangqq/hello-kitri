package com.kitri.awt.design;

import java.awt.*;

public class ListTest extends Frame{
//		�����
	Panel pW = new Panel();
	Panel pC = new Panel();
	Panel pE = new Panel();

//		pW�� �����ϴ°� 

	List listL = new List();
	TextField tfL = new TextField();

//		pC�� �����ϴ°� 
	Button btR = new Button("��");
	Button btRAll = new Button("��");
	Button btL = new Button("��");
	Button btLAll = new Button("��");

//		pE�� �����ϴ°�
	List listR = new List();
	TextField tfR = new TextField();

	
	public ListTest () {
			super("ListTest");
	
//		�ǳڿ� ��� ����
//		pL�� ��� ����

		pW.setLayout(new BorderLayout());
		pW.add(listL, "Center");
		pW.add(tfL, "South");
//		

//		pC�� ��� ����
//		
		pC.setLayout(new GridLayout(4, 1 , 0, 10));
		pC.add(btR);
		pC.add(btRAll);
		pC.add(btL);
		pC.add(btLAll);
		

//		pE�� ��� ����
		pE.setLayout(new BorderLayout());
		pE.add(listR, "Center");
		pE.add(tfR, "South");
		
//		��ü layout ����
		
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
