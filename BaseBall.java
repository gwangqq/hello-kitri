<<<<<<< HEAD
=======
package javaexercise;

>>>>>>> origin/master
import java.awt.*;

public class BaseBall extends Frame {
//	���� panel ��ũ�ѹ�/ ������ panel colorP
//	���� panel 
	Panel pW = new Panel();
	
<<<<<<< HEAD

	Panel pR = new Panel();
	Panel pS = new Panel();
	Panel pE = new Panel();

//	pR�� ������ ��ư 5��
	Button newG = new Button("������");
	Button clear = new Button("�����");
	Button dap = new Button("�� ��");
	Button fontC = new Button("���ڻ�");
	Button exit = new Button("�� ��");

//	pC�� �� ta
=======
	Panel pV = new Panel(); // ����ִ� ��ũ�ѹ�
	String v = "  ";
	Panel pR = new Panel(); // ���� ��ũ�ѹ�
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 100, 10, 0, 255)	;
	Label lR = new Label("����");
	
	Panel pG = new Panel(); // �ʷ� ��ũ�ѹ�
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 1000, 10, 0, 255)	;
	Label lG = new Label("�ʷ�");
>>>>>>> origin/master
	
	Panel pB = new Panel(); // �Ķ� ��ũ�ѹ�
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 1000, 10, 0, 255)	;
	Label lB = new Label("�Ķ�");
	
	
	
<<<<<<< HEAD
	Label l = new Label("����", Label.CENTER);
=======
//	������ panel  
	Panel d = new Panel();
	Panel colorP = new Panel();
	Button ok = new Button("ok");
>>>>>>> origin/master
	TextField tf = new TextField();
	TextArea tA = new TextArea();
	
<<<<<<< HEAD

	
	public BaseBall() {
//		�� �г� ������ ����
		super ("BaseBall");
//		pR ������ GridLayout���� ����
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
>>>>>>> origin/master
		setBounds(300, 200, 300, 400);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new BaseBall();
	}
}
