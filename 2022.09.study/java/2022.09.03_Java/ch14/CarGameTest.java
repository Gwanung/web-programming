import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel{
	BufferedImage img = null;
	int img_x = 100, img_y = 100;
	
	public MyPanel() {
		try {
			img = ImageIO.read(new File("car.gif")); //이미지입출력
			
		} catch (IOException e) {
			System.out.println("no Image");
			System.exit(1);
		}
		
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				img_x = e.getX();
				img_y = e.getY();
				
				repaint();
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				int keycode = e.getKeyCode(); // 키의 코드값을 반환해줌 
				switch(keycode) {
				case KeyEvent.VK_UP: img_y -= 10;  break;
				case KeyEvent.VK_DOWN: img_y += 10; break;
				case KeyEvent.VK_LEFT: img_x -= 10; break;
				case KeyEvent.VK_RIGHT: img_x += 10; break;
				
				
				}
				repaint();  // 변경된 값을 적용시켜줌.
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode(); // 키의 코드값을 반환해줌 
				switch(keycode) {
				case KeyEvent.VK_UP: img_y -= 10;  break;
				case KeyEvent.VK_DOWN: img_y += 10; break;
				case KeyEvent.VK_LEFT: img_x -= 10; break;
				case KeyEvent.VK_RIGHT: img_x += 10; break;
				
				
				}
				repaint();  // 변경된 값을 적용시켜줌.
				
			}
		});
		this.requestFocus();  
		setFocusable(true);  //default값은 false 여서 변경
		
	} // MyPanel()

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);  //(이미지  , x좌표, y좌표 , 아직안배움)
	}
	
} //MyPanel


public class CarGameTest extends JFrame{
	
	public CarGameTest() {
		setTitle("자동차게임");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		add(new MyPanel());
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new CarGameTest();
	}

}
