package game;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
// import acm.program.*;
import acm.util.RandomGenerator;



public class Xo extends GraphicsProgram {
	
	private static final int APP_WIDTH = 300;
	private static final int APP_HEIGHT = 400;
	
	private static final int GAME_WIDTH = 300;
	private static final int GAME_HEIGHT = 300;
	
	private static final int BOX_LENGTH = 100;
	
	private  char [][] symbol = {{'0','0','0'},{'0','0','0'}, {'0','0','0'}};
	private int turn = 0;
	
	public void run() {
		
		setWidth(APP_WIDTH);
		setHeight(APP_HEIGHT);
		setTable();
		
		
	}
	
	public void setTable() {
		for(int i=0;i<=3;i++) {
			GLine line1 = new GLine(i*GAME_WIDTH/3,0, i*GAME_WIDTH/3,GAME_HEIGHT);
			GLine line2 = new GLine(0,i*GAME_HEIGHT/3, GAME_WIDTH, i*GAME_HEIGHT/3);
			add(line1);
			add(line2);
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		
		
		if(e.getX() < GAME_WIDTH && e.getY() < GAME_HEIGHT && turn%2==0) {
			symbol[e.getX()/100][e.getY()/100] = 'X';
			drawX(e.getX()/100, e.getY()/100);
			turn++;
		}
		else if(e.getX() < GAME_WIDTH && e.getY() < GAME_HEIGHT && turn%2!=0) {
			symbol[e.getX()/100][e.getY()/100] = 'O';
			drawO(e.getX()/100, e.getY()/100);
			turn++;
		}
		if(checker()) {
			drawWinner(symbol[e.getX()/100][e.getY()/100]);
		}
		if(turn==9) {
			drawNoWinner();
		}
			
		
	}
	
	public boolean checker() {
		
		for(int i=0;i<3;i++) {
			if(symbol[0][i] ==  symbol[1][i] && symbol[0][i] ==symbol[2][i] && symbol[2][i] != '0') {
				System.out.println(symbol[0][i] + " player is winner");
				return true;
			}
			else if(symbol[i][0] ==  symbol[i][1] && symbol[i][0] ==symbol[i][2]  && symbol[i][2] != '0'){
				System.out.println(symbol[i][0] + " player is winner");
				return true;
			}
	}
	if((symbol[0][0] ==  symbol[1][1] && symbol[0][0] ==symbol[2][2] && symbol[2][2] != '0') ||
			(symbol[0][2] ==  symbol[1][1] && symbol[0][2] ==symbol[2][0]  && symbol[0][2] != '0'))
			return true;
		
		return false;
	}
	
	
	public  void drawWinner(char winner) {
		GLabel w = new GLabel(winner + " is winner");
		w.setFont("BOLD-50");
		add(w, getWidth()/2-w.getBounds().getWidth()/2, getHeight()-w.getHeight()/2);
		
	}
	
	public void drawNoWinner() {
		GLabel w = new GLabel("Draw!");
		w.setFont("BOLD-50");
		add(w, getWidth()/2-w.getBounds().getWidth()/2, getHeight()-w.getHeight()/2);
	}

	
	public void drawX(int i, int j) {
		GLabel x = new GLabel("X");
		x.setFont("BOLD-100");
		x.setLocation(i*BOX_LENGTH+x.getBounds().getWidth()/4,j*BOX_LENGTH+x.getHeight()-x.getBounds().getHeight()/3);
		System.out.println(i + " "+ j);
		System.out.println(Arrays.deepToString(symbol));
		add(x);
	}
	
	public void drawO(int i, int j) {
		
		GLabel x = new GLabel("O");
		x.setFont("BOLD-100");
		x.setLocation(i*BOX_LENGTH+x.getBounds().getWidth()/4,j*BOX_LENGTH+x.getHeight()-x.getBounds().getHeight()/3);
		System.out.println(i + " "+ j);
		add(x);
		
	}
	
	
	
	
	
	
	
}
