package com.kitri.awt.design;

import java.awt.*;

import com.sun.javafx.collections.SetListenerHelper;


public class BaseBall extends Frame{
//		선언부
	

	Panel pR = new Panel();
	Panel pS = new Panel();
	

//	pR에 들어가야할 버튼 5개
	Button newG = new Button("새게임");
	Button clear = new Button("지우기");
	Button dop = new Button("정 답");
	Button fontC = new Button("글자색");
	Button exit = new Button("종 료");

//	pC에 들어갈 ta
	
	TextArea ta = new TextArea();
	
	
//	pS에 들어갈 숫자 l, tf
	
	Label l = new Label("숫자");
	TextField tf = new TextField();
	

	
	public BaseBall() {
//		각 패널 디자인 구현
		super ("BaseBall");
//		pR 디자인 GridLayout으로 구현
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
