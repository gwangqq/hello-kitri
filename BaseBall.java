package com.kitri.awt.design;

import java.awt.*;

import com.sun.javafx.collections.SetListenerHelper;


public class BaseBall extends Frame{
//		�����
	

	Panel pR = new Panel();
	Panel pS = new Panel();
	

//	pR�� ������ ��ư 5��
	Button newG = new Button("������");
	Button clear = new Button("�����");
	Button dop = new Button("�� ��");
	Button fontC = new Button("���ڻ�");
	Button exit = new Button("�� ��");

//	pC�� �� ta
	
	TextArea ta = new TextArea();
	
	
//	pS�� �� ���� l, tf
	
	Label l = new Label("����");
	TextField tf = new TextField();
	

	
	public BaseBall() {
//		�� �г� ������ ����
		super ("BaseBall");
//		pR ������ GridLayout���� ����
		pR.setLayout(new GridLayout(5,1,0,10));
		pR.add(newG);
		pR.add(clear);
		pR.add(dop);
		pR.add(fontC);
		pR.add(exit);
 		
		pS.setLayout(new BorderLayout());
		pS.add(l, "West");
		pS.add(tf, "Center");
		
		
		setLayout(new BorderLayout());
		add(pR, "East");
		add(pS, "South");
		setBounds(300, 200, 300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BaseBall();
	}
}
