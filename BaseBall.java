
import java.awt.*;

public class BaseBall extends Frame{
//		�����
	

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
	
	TextArea ta = new TextArea();
	
	
//	pS�� �� ���� l, tf
	
	Label l = new Label("����", Label.CENTER);
	TextField tf = new TextField();
	

	
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
		setBounds(300, 200, 300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BaseBall();
	}
}
