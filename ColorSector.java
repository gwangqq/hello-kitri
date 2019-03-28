import java.awt.*;

public class ColorSector extends Frame {
//	���� panel ��ũ�ѹ�/ ������ panel colorP
//	���� panel 
	Panel pW = new Panel();
	
	Panel pR = new Panel(); // ���� ��ũ�ѹ�
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);//������ ũ�⸦ ����ؾ��Ѵ�. 
	Label lR = new Label("����");//���� ���� ���� ��ũ�ѹ� ���� ���ϴ� ���� ������

	
	Panel pG = new Panel(); // �ʷ� ��ũ�ѹ�
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Label lG = new Label("�ʷ�");
	
	Panel pB = new Panel(); // �Ķ� ��ũ�ѹ�
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Label lB = new Label("�Ķ�");
	
	
	
//	������ panel  
	Panel d = new Panel();
	Panel colorP = new Panel();
	Button ok = new Button("ok");
	Label colorL = new Label();
	TextArea tA = new TextArea();
	
	public ColorSector( ) {
		super("ColorSector");
		
//		�� ��ũ�� �ǳ� �۾�
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
		
//		������ panel �۾�
		
		d.setLayout(new BorderLayout());
		d.add(colorL,"Center");
		d.add(ok,"East");
		
		colorP.setLayout(new BorderLayout());
		tA.setBackground(Color.GRAY);
		colorP.add(tA, "Center");
		colorP.add(d, "South");
		
//		���� panel �۾�
		
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
