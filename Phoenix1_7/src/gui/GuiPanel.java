/*
 * draws the app window in conjunction with GuiFrame
 */

package gui;

import gamelogic.GameLogic;

import input.KeyBoard;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GuiPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private Timer timer;
	private DrawMap drawmap = new DrawMap();
	private DrawChar drawchar = new DrawChar();
	KeyBoard keyboard = new KeyBoard();
	int charangle = 1;
	boolean change = false;
	private int dx;
	private int dy;

	public GuiPanel() {

		KeyListener listener = new KeyBoard();
		addKeyListener(listener);
		initGuiPanel();

	}

	private void initGuiPanel() {

		setFocusable(true);
		setBackground(Color.BLACK);
		setDoubleBuffered(true);

		timer = new Timer(50, this);
		timer.start();
		new GameLogic("gamelogic").start();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		draw(g);

		Toolkit.getDefaultToolkit().sync();
	}

	private void draw(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;

		drawmap.drawmap(g2d);
		drawchar.drawchar(g2d, dx, dy);
		repaint();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		dx = keyboard.getdx();
		dy = keyboard.getdy();
		drawmap.move(keyboard.getdx(), keyboard.getdy());

	}

}
