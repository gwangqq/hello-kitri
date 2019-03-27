package com.kitri.awt.design;

import java.awt.*;

//1. Frame 상속

//2. 선언부에 필요한 객체 생성
//3. 배치부에서 desgin(component 배치)
//** 작업은 작은 것에서 시작해서 큰것으로/ 패널을 붙이고 라벨 버튼을 붙이는게 아니라, 라벨 버튼을 먼저 붙이고 패널을 붙여라

public class DesignTest extends Frame {
//			이 부분을 선언부
	Panel pN = new Panel();
	Panel pS = new Panel();

	Label l = new Label("입력", Label.CENTER);
	TextField tf = new TextField();
	Button send = new Button("전송");

	TextArea ta = new TextArea();

	Choice ch = new Choice();
	Button exit = new Button("종료");

	public DesignTest() {
		super("Design Test !!!");
// 			배치부
		
		pN.setLayout(new BorderLayout(10,0));
		l.setBackground(new Color(100, 201, 150));
//		l.setForeground(new Color(255, 0, 255));
		l.setForeground(Color.ORANGE);
		Font f = new Font("굴림", Font.BOLD, 20);
		l.setFont(f);
		pN.add(l,"West");			//먼저 들어갈 부분을 만든다
		pN.add(tf, "Center");
		pN.setFont(f);
		pN.add(send, "East");

		pS.setLayout(new GridLayout(1,2, 10,0));
		ch.add("서울");				
		ch.add("경기, 인천");
		ch.add("강원");
		ch.add("충청");				//choice안에 입력
		pS.add(ch);
		pS.setFont(f);
		pS.add(exit);		

		setLayout(new BorderLayout(0,10));
		add(pN, "North");
		add(ta, "Center");
		add(pS, BorderLayout.SOUTH);
		
//		setSize(300, 500);
//		setLocation(300, 200);
		setBounds(300, 200, 300, 400);  //setSize + setLocation 한 method가 setBounds
		setResizable(false);
		setVisible(true);  // 항상 다 만든 후에 입력해야한다
	}

	public static void main(String[] args) {
		new DesignTest(); // 익명 객체 생성, 클래스에서 호출 할 것이 없을 때 만든다.

	}
}
