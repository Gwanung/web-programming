package quiz;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Quiz2 extends JFrame implements ItemListener {
	JCheckBox cb[] = new JCheckBox[4];
	String cb_data[] = {"옵션1", "옵션2", "옵션3", "옵션4"};
	JPanel p;
	JLabel l;
	String data;
	
	public Quiz2() {
		data = "0";
		p = new JPanel();
		l = new JLabel("현재까지의 가격은 " + data + "입니다.");
		
		for(int i=0; i<cb.length; i++) {
			cb[i] = new JCheckBox(cb_data[i]);
		}
		p.add(cb[0]);
		p.add(cb[1]);
		p.add(cb[2]);
		p.add(cb[3]);
		p.add(l);
		add(p);
		
		
		setSize(600, 150);
		setVisible(true);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getItemSelectable();
		for(int i=0; i<cb.length; i++) {
			if(source == cb[i]) {
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Quiz2();
	}



}
