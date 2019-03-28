import java.awt.*;

public class ItemTest extends Frame {
//	선언부, 기본 값을 선언한다. 	
	
	Panel pN = new Panel();
	Panel pS = new Panel();
//	pN 들어가야하는 것 
	CheckboxGroup mor = new CheckboxGroup();
	Checkbox app = new Checkbox("사과", true);
	Checkbox banana = new Checkbox("바나나");
	Checkbox straw = new Checkbox("딸기");

	/*
	 CheckboxGroup ch new CheckboxGroup();
	 Checkbox mor = new Checkbox("아침", cg, true);
	 Checkbox aft = new Checkbox("점심", cg, flase);
	 Checkbox eve = new Checkbox("저녁", cg, false);	 
	 */
	
	//	가운데 TextArea생성	
	TextArea ta = new TextArea();
	
//	pS 들어가야하는 것
	
	Choice ch = new Choice();
	Button exit = new Button("종료");
	
	
	public ItemTest () {
//		배치부 각 판넬에 기능을 부여하면 된다
		super("ItemTest");
		
//		nP에 checkbox 적용하기
		pN.setLayout(new GridLayout(2,3));
		pN.add(new Checkbox("아침", mor, true));
		pN.add(new Checkbox("점심", mor, false));
		pN.add(new Checkbox("저녁", mor, false));
		pN.add(app);
		pN.add(banana);
		pN.add(straw);
		
		
//		sP에 choice와 버튼 작성하기
		
		pS.setLayout(new BorderLayout());
		ch.add("아침");
		ch.add("점심");
		ch.add("저녁");
		pS.add(ch,"Center");
		pS.add(exit,"East");
		
		
		setLayout(new BorderLayout());
		add(pN, "North");
		add(ta, "Center");
		add(pS, "South");
		
		setBounds(300, 200, 300, 500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ItemTest();
	}

}
