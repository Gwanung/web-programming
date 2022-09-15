import java.awt.BorderLayout;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame implements ActionListener{

	JLabel label;
	
	public ComboBoxFrame() {
		
		String animals[] = {"dog", "tiger", "lion"};
		JComboBox animalList = new JComboBox(animals); 
		animalList.setSelectedIndex(0);
		animalList.addActionListener(this);
		
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		changePicture(animals[animalList.getSelectedIndex()]);
		add(animalList, BorderLayout.PAGE_START);
		add(label , BorderLayout.PAGE_END);
		
		
		
		setTitle("콤보 박스 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 200);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JComboBox cb = (JComboBox)e.getSource();
		String name = (String) cb.getSelectedItem();
		changePicture(name);
	}
	
	
	protected void changePicture(String name) {
		
		ImageIcon icon = new ImageIcon(name + ".gif");
		label.setIcon(icon);
		if(icon.getImageLoadStatus() != MediaTracker.ERRORED) {
			label.setText(null);
		}else {
			label.setText("이미지가 발견되지 않았습니다.");
		}
		
		
	}//end changePicture()
	
	public static void main(String[] args) {
		new ComboBoxFrame();
	}


}
