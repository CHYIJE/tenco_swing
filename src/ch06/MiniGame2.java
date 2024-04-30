package ch06;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniGame2 extends JFrame {

	private JLabel jPlayer;
	private JLabel jPlayerL;
	private JLabel backgroundMap;

	// 변수는 --> 변하는 수이기도 하다.
	private int jPlayerX = 50;
	private int jPlayerY = 510;
	private final int MOVDE_DISTANCE = 50;
	private final int FRAME_WIDTH = 1000;
	private final int FRAME_HEIGHT = 650;
	private final String PLAYER_NAME = "보글보글";
	private final int PLAYER_WIDTH = 100;
	private final int PLAYER_HEIGHT = 100;

	public MiniGame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jPlayer = new JLabel(new ImageIcon("gameimages/playerR.png"));
		jPlayer.setSize(PLAYER_WIDTH, PLAYER_HEIGHT);

		jPlayerL = new JLabel(new ImageIcon("gameimages/playerL.png"));

		Icon icon = new ImageIcon("gameimages/backgroundMap.png");
		backgroundMap = new JLabel(icon);
		backgroundMap.setSize(1000, 600);
		backgroundMap.setLocation(0, 0);
	}

	private void setInitLayout() {
		// 좌표 기반으로 배치관리자 변경
		// 좌표기반으로 바꾸면 setLocation과 setSize를 지정해주지 않으면 나오지 않는다.
		setLayout(null);
		add(backgroundMap);
		backgroundMap.add(jPlayer);
		jPlayer.setLocation(jPlayerX, jPlayerY);
		setVisible(true);
	}

	private void addEventListener() {
		// jPlayer 객체에게서만 keyListener 동작을 시키고자 한다면
		// 익명 구현클래스로 KeyListener 인터페스를 재 정의할 수 있다.
		// jPlayer.addKeyListener(this);
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					jPlayerY -= MOVDE_DISTANCE + 70;
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					jPlayerX -= MOVDE_DISTANCE;
					add(jPlayerL);
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					jPlayerX += MOVDE_DISTANCE;
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					jPlayerY += MOVDE_DISTANCE + 70;
				}

				jPlayer.setLocation(jPlayerX, jPlayerY);
			}
		});
	}

	// 코드 테스트
	public static void main(String[] args) {
		new MiniGame2();
	} // end of main

} // end of class
