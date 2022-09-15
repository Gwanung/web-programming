import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLabelTest extends JFrame implements ActionListener {
	
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public ImageLabelTest() {
		panel = new JPanel();
		label = new JLabel("이미지를 보려면 아래 버튼을 누르시오");
		button = new JButton("이미지 레이블");
		ImageIcon icon = new ImageIcon("icon.gif");  //이미지 아이콘 객체 생성
		button.setIcon(icon);
		button.addActionListener(this);
		panel.add(label);
		panel.add(button);
		
		add(panel);
		setTitle("이미지 레이블");
		setVisible(true);
		setSize(300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ImageIcon icon = new ImageIcon("dog.gif");
		label.setIcon(icon);
		label.setText(null);
	}
	
	
	public static void main(String[] args) {
		new ImageLabelTest();
	}

}// ImageLabelTest
