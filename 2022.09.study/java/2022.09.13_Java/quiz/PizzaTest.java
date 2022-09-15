package quiz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;



class PizzaFrame extends JFrame implements ActionListener{
	
	private JButton order_button, cancle_button;
	private JPanel down_panel;
	private JTextField text;
	
	WelcomePanel welcome_panel = new WelcomePanel();
	TypePanel type_panel = new TypePanel();
	AddTopping addtopping_panel = new AddTopping();
	SizePanel size_panel = new SizePanel();
	
	
	public PizzaFrame() {
		this.setSize(500, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("피자 주문");
		order_button = new JButton("주문");
		this.order_button.addActionListener(this);
		cancle_button = new JButton("취소");
		this.cancle_button.addActionListener(this);
		
		this.text = new JTextField();
		text.setEditable(false);
		text.setColumns(6);
		
		down_panel = new JPanel();
		down_panel.add(this.order_button);
		down_panel.add(this.cancle_button);
		down_panel.add(this.text);
		this.setLayout(new BorderLayout());
		this.add(welcome_panel, BorderLayout.NORTH);
		this.add(down_panel, BorderLayout.SOUTH);
		this.add(size_panel, BorderLayout.EAST);
		this.add(type_panel, BorderLayout.WEST);
		this.add(addtopping_panel, BorderLayout.CENTER);
		
		this.setVisible(true);
		
		
		
	}
	
	
class WelcomePanel extends JPanel{
			
		private JLabel message;
		
		public WelcomePanel(){
			
			message = new JLabel("자바 피자에 오신것을 환영합니다.");
			add(message);  //panel에 추가
			
		}
		
	}

class TypePanel extends JPanel{
		private JRadioButton combo, potato, bulgogi;
		private ButtonGroup bg;
			
		public TypePanel(){
				
				setLayout(new GridLayout(3, 1));
				combo = new JRadioButton("콤보", true);
				potato = new JRadioButton("포테이토");
				bulgogi = new JRadioButton("불고기");
				bg = new ButtonGroup();
				bg.add(combo);
				bg.add(potato);
				bg.add(bulgogi);
				Border border1 = BorderFactory.createTitledBorder("종류");  //버튼 그룹 이름 및 정렬
				add(combo);
				add(potato);
				add(bulgogi);
				setBorder(border1);
			}
		} 

class AddTopping extends JPanel{
	private JRadioButton pepper, cheese, peperoni, bacon;
	private ButtonGroup bg;
			
	public AddTopping() {
			
			
			setLayout(new GridLayout(4, 1));
			pepper = new JRadioButton("피망", true);
			cheese = new JRadioButton("치즈");
			bacon = new JRadioButton("페퍼로니");
			peperoni = new JRadioButton("베이컨");
			bg = new ButtonGroup();
			bg.add(pepper);
			bg.add(bacon);
			bg.add(cheese);
			bg.add(peperoni);
			Border border2 = BorderFactory.createTitledBorder("추가토핑");
			add(pepper);
			add(bacon);
			add(cheese);
			add(peperoni);
			setBorder(border2);
				
				}
		}

class SizePanel extends JPanel{
	
	private JRadioButton small, medium, large;
	private ButtonGroup bg; 
	
		public SizePanel() {
			setLayout(new GridLayout(3, 1));
			JRadioButton small = new JRadioButton("Small", true);
			JRadioButton medium = new JRadioButton("Medium");
			JRadioButton large = new JRadioButton("Large");
			ButtonGroup bg = new ButtonGroup();
			bg.add(small);
			bg.add(medium);
			bg.add(large);
			Border border3 = BorderFactory.createTitledBorder("크기");
			add(small);
			add(medium);
			add(large);
			setBorder(border3);
					
				}
			
		}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.order_button) {
			this.text.setText("" + 20000);
		}
		if(e.getSource() == this.cancle_button) {
			this.text.setText("" + 0);
		}
	}


}
public class PizzaTest{
	
	public static void main(String[] args) {
		new PizzaFrame();
		
	}
}

