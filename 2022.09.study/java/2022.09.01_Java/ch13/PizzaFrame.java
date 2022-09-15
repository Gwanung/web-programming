import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PizzaFrame extends JFrame implements ActionListener {  //패널 안에 패널합치기
	
	JPanel panel;
	JPanel panelA;
	JPanel panelB;
	private int count = 0;
	JTextField field1;
	
	public PizzaFrame() {
			setSize(600, 150);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("피자주문하기");

			 panel = new JPanel();
			 panelA = new JPanel();
			 panelB = new JPanel();
			
			
			JLabel label1 = new JLabel("자바 피자에 오신것을 환영합니다. 피자의 종류를 선택하세요.");
			panelA.add(label1);
			
			JButton button1 = new JButton("콤보피자");
			JButton button2 = new JButton("포테이토피자");
			JButton button3 = new JButton("불고기피자");
			JLabel label2 = new JLabel("개수");
			 field1 = new JTextField(10);
			button1.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);
			
			panelB.add(button1);
			panelB.add(button2);
			panelB.add(button3);
			panelB.add(label2);
			panelB.add(field1);
			
			panel.add(panelA);
			panel.add(panelB);
			add(panel);
			
			setVisible(true);
	}

@Override
public void actionPerformed(ActionEvent e) {
	count++;
	field1.setText(Integer.toString(count));
//	field1.setText(count +""); // 표기는 둘다 같음. 문자열이냐 정수형 변환이냐 차이
	
}
}
