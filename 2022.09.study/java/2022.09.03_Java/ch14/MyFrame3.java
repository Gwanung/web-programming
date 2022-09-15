import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame3 extends JFrame {
	private JButton button;
	private JLabel label;
	
	
	public MyFrame3() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 객체");
		
		JPanel panel  = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		panel.add(button);
		panel.add(label);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {   //이벤트 3번째 방법 (안드로이드에서 많이 사용함)
				if(e.getSource() == button) {
					label.setText("버튼이 눌러졌습니다.");
				}
			}
		});  
		
		this.add(panel);  // 프레임에 패널 추가
		this.setVisible(true);
	} // MyFrame();



}
