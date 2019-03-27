package javaexercise;

import java.awt.*;

public class BaseBall extends Frame {
//	왼쪽 panel 스크롤바/ 오른쪽 panel colorP
//	왼쪽 panel 
	Panel pW = new Panel();
	
	Panel pV = new Panel(); // 비어있는 스크롤바
	String v = "  ";
	Panel pR = new Panel(); // 빨간 스크롤바
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 100, 10, 0, 255)	;
	Label lR = new Label("빨강");
	
	Panel pG = new Panel(); // 초록 스크롤바
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 1000, 10, 0, 255)	;
	Label lG = new Label("초록");
	
	Panel pB = new Panel(); // 파란 스크롤바
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 1000, 10, 0, 255)	;
	Label lB = new Label("파랑");
	
	
	
//	오른쪽 panel  
	Panel d = new Panel();
	Panel colorP = new Panel();
	Button ok = new Button("ok");
	TextField tf = new TextField();
	TextArea tA = new TextArea();
	
	public BaseBall( ) {
		super("BaseBall!!!!");
		
		
//		오른쪽 panel 작업
		
		d.setLayout(new GridLayout(1,1));
		d.add(tf,"West");
		d.add(ok,"East");
		
		colorP.setLayout(new BorderLayout());
		colorP.add(tA, "Center");
		colorP.add(d, "South");
		
//		왼쪽 panel 작업
		
		pW.setLayout(new GridLayout(3,2, 10, 50));
		
		pW.add(lR);
		pW.add(sbR);
		pW.add(lG);
		pW.add(sbG);
		pW.add(lB);
		pW.add(sbB);		
		
		setLayout(new GridLayout(1,1));
		add(pW);
		add(colorP);
		setBounds(300, 200, 300, 400);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new BaseBall();
	}
}
