package com.kitri.awt.design;

import java.awt.*;

public class ItemTest extends Frame {
//	�����, �⺻ ���� �����Ѵ�. 	
	
	Panel pN = new Panel();
	Panel pS = new Panel();
//	pN �����ϴ� �� 
	CheckboxGroup mor = new CheckboxGroup();
	Checkbox app = new Checkbox("���", true);
	Checkbox bnn = new Checkbox("�ٳ���");
	Checkbox str = new Checkbox("����");

	//	��� TextArea����	
	TextArea ta = new TextArea();
	
//	pS �����ϴ� ��
	
	Choice ch = new Choice();
	Button exit = new Button("����");
	
	
	public ItemTest () {
//		��ġ�� �� �ǳڿ� ����� �ο��ϸ� �ȴ�
		super("ItemTest");
		
//		nP�� checkbox �����ϱ�
		pN.setLayout(new GridLayout(2,3));
		pN.add(new Checkbox("��ħ", mor, true));
		pN.add(new Checkbox("����", mor, false));
		pN.add(new Checkbox("����", mor, false));
		pN.add(app);
		pN.add(bnn);
		pN.add(str);
		
		
//		sP�� choice�� ��ư �ۼ��ϱ�
		
		pS.setLayout(new BorderLayout());
		ch.add("��ħ");
		ch.add("����");
		ch.add("����");
		pS.add(ch,"Center");
		pS.add(exit,"East");
		
		
		setLayout(new BorderLayout());
		add(pN, "North");
		add(ta, "Center");
		add(pS, "South");
		
		setBounds(300, 200, 300, 400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ItemTest();
	}

}
