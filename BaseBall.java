package javaexercise;

import java.awt.*;

public class BaseBall extends Frame {
//	���� panel ��ũ�ѹ�/ ������ panel colorP
//	���� panel 
	Panel pW = new Panel();
	
	Panel pV = new Panel(); // ����ִ� ��ũ�ѹ�
	String v = "  ";
	Panel pR = new Panel(); // ���� ��ũ�ѹ�
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 100, 10, 0, 255)	;
	Label lR = new Label("����");
	
	Panel pG = new Panel(); // �ʷ� ��ũ�ѹ�
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 1000, 10, 0, 255)	;
	Label lG = new Label("�ʷ�");
	
	Panel pB = new Panel(); // �Ķ� ��ũ�ѹ�
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 1000, 10, 0, 255)	;
	Label lB = new Label("�Ķ�");
	
	
	
//	������ panel  
	Panel d = new Panel();
	Panel colorP = new Panel();
	Button ok = new Button("ok");
	TextField tf = new TextField();
	TextArea tA = new TextArea();
	
	public BaseBall( ) {
		super("BaseBall!!!!");
		
		
//		������ panel �۾�
		
		d.setLayout(new GridLayout(1,1));
		d.add(tf,"West");
		d.add(ok,"East");
		
		colorP.setLayout(new BorderLayout());
		colorP.add(tA, "Center");
		colorP.add(d, "South");
		
//		���� panel �۾�
		
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
