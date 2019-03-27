package com.kitri.awt.design;

import java.awt.*;

//1. Frame ���

//2. ����ο� �ʿ��� ��ü ����
//3. ��ġ�ο��� desgin(component ��ġ)
//** �۾��� ���� �Ϳ��� �����ؼ� ū������/ �г��� ���̰� �� ��ư�� ���̴°� �ƴ϶�, �� ��ư�� ���� ���̰� �г��� �ٿ���

public class DesignTest extends Frame {
//			�� �κ��� �����
	Panel pN = new Panel();
	Panel pS = new Panel();

	Label l = new Label("�Է�", Label.CENTER);
	TextField tf = new TextField();
	Button send = new Button("����");

	TextArea ta = new TextArea();

	Choice ch = new Choice();
	Button exit = new Button("����");

	public DesignTest() {
		super("Design Test !!!");
// 			��ġ��
		
		pN.setLayout(new BorderLayout(10,0));
		l.setBackground(new Color(100, 201, 150));
//		l.setForeground(new Color(255, 0, 255));
		l.setForeground(Color.ORANGE);
		Font f = new Font("����", Font.BOLD, 20);
		l.setFont(f);
		pN.add(l,"West");			//���� �� �κ��� �����
		pN.add(tf, "Center");
		pN.setFont(f);
		pN.add(send, "East");

		pS.setLayout(new GridLayout(1,2, 10,0));
		ch.add("����");				
		ch.add("���, ��õ");
		ch.add("����");
		ch.add("��û");				//choice�ȿ� �Է�
		pS.add(ch);
		pS.setFont(f);
		pS.add(exit);		

		setLayout(new BorderLayout(0,10));
		add(pN, "North");
		add(ta, "Center");
		add(pS, BorderLayout.SOUTH);
		
//		setSize(300, 500);
//		setLocation(300, 200);
		setBounds(300, 200, 300, 400);  //setSize + setLocation �� method�� setBounds
		setResizable(false);
		setVisible(true);  // �׻� �� ���� �Ŀ� �Է��ؾ��Ѵ�
	}

	public static void main(String[] args) {
		new DesignTest(); // �͸� ��ü ����, Ŭ�������� ȣ�� �� ���� ���� �� �����.

	}
}
