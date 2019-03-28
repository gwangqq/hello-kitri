import java.awt.*;

public class ColorSector extends Frame {
//	왼쪽 panel 스크롤바/ 오른쪽 panel colorP
//	왼쪽 panel 
	Panel pW = new Panel();
	
	Panel pR = new Panel(); // 빨간 스크롤바
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);//막대의 크기를 고려해야한다. 
	Label lR = new Label("빨강");//막대 왼쪽 끝이 스크롤바 상의 원하는 값을 가져옴

	
	Panel pG = new Panel(); // 초록 스크롤바
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Label lG = new Label("초록");
	
	Panel pB = new Panel(); // 파란 스크롤바
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Label lB = new Label("파랑");
	
	
	
//	오른쪽 panel  
	Panel d = new Panel();
	Panel colorP = new Panel();
	Button ok = new Button("ok");
	Label colorL = new Label();
	TextArea tA = new TextArea();
	
	public ColorSector( ) {
		super("ColorSector");
		
//		각 스크롤 판넬 작업
		pR.setLayout(new BorderLayout());
		lR.setBackground(Color.RED);
		pR.add(sbR, "Center");
		pR.add(lR,"West");
		
		pG.setLayout(new BorderLayout());
		lG.setBackground(Color.GREEN);
		pG.add(sbG, "Center");
		pG.add(lG,"West");
		
		pB.setLayout(new BorderLayout());
		lB.setBackground(Color.BLUE);
		pB.add(sbB, "Center");
		pB.add(lB,"West");
		
//		오른쪽 panel 작업
		
		d.setLayout(new BorderLayout());
		d.add(colorL,"Center");
		d.add(ok,"East");
		
		colorP.setLayout(new BorderLayout());
		tA.setBackground(Color.GRAY);
		colorP.add(tA, "Center");
		colorP.add(d, "South");
		
//		왼쪽 panel 작업
		
		pW.setLayout(new GridLayout(5,1, 10, 50));
		
		pW.add(new Label(""));
		pW.add(pR);
		pW.add(pG);
		pW.add(pB);		
		
		setLayout(new GridLayout(1,1));
		add(pW);
		add(colorP);
		setBounds(300, 200, 500, 400);
		setVisible(true);
		
		
		int r = sbR.getValue(); 
		int g = sbG.getValue(); 
		int b = sbB.getValue(); 
		colorP.setBackground(new Color(r,g,b));
		colorL.setText("r = " + r + "g = " + g + "b = " + b);
		
		
	}
	public static void main(String[] args) {
		new ColorSector();
	}
}
