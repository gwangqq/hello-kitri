<<<<<<< HEAD
=======
package javaexercise;

>>>>>>> origin/master
import java.awt.*;

public class BaseBall extends Frame {
//	왼쪽 panel 스크롤바/ 오른쪽 panel colorP
//	왼쪽 panel 
	Panel pW = new Panel();
	
<<<<<<< HEAD

	Panel pR = new Panel();
	Panel pS = new Panel();
	Panel pE = new Panel();

//	pR에 들어가야할 버튼 5개
	Button newG = new Button("새게임");
	Button clear = new Button("지우기");
	Button dap = new Button("정 답");
	Button fontC = new Button("글자색");
	Button exit = new Button("종 료");

//	pC에 들어갈 ta
=======
	Panel pV = new Panel(); // 비어있는 스크롤바
	String v = "  ";
	Panel pR = new Panel(); // 빨간 스크롤바
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 100, 10, 0, 255)	;
	Label lR = new Label("빨강");
	
	Panel pG = new Panel(); // 초록 스크롤바
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 1000, 10, 0, 255)	;
	Label lG = new Label("초록");
>>>>>>> origin/master
	
	Panel pB = new Panel(); // 파란 스크롤바
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 1000, 10, 0, 255)	;
	Label lB = new Label("파랑");
	
	
	
<<<<<<< HEAD
	Label l = new Label("숫자", Label.CENTER);
=======
//	오른쪽 panel  
	Panel d = new Panel();
	Panel colorP = new Panel();
	Button ok = new Button("ok");
>>>>>>> origin/master
	TextField tf = new TextField();
	TextArea tA = new TextArea();
	
<<<<<<< HEAD

	
	public BaseBall() {
//		각 패널 디자인 구현
		super ("BaseBall");
//		pR 디자인 GridLayout으로 구현
		pR.setLayout(new GridLayout(5,1,0,10));
		pR.add(newG);
		pR.add(clear);
		pR.add(dap);
		pR.add(fontC);
		pR.add(exit);

		
		pS.setLayout(new BorderLayout());
		pS.add(tf, "Center");
		pS.add(l, "West");
				
		pE.setLayout(new BorderLayout());
		pE.add(ta, "Center");
		pE.add(pS, "South");
		
		
		setLayout(new BorderLayout());
		add(pR, "East");
		add(pE, "Center");
=======
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
>>>>>>> origin/master
		setBounds(300, 200, 300, 400);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new BaseBall();
	}
}
