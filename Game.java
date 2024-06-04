package guessingGame;

import javax.swing.JLabel;


public class Game {
	public static void main(String[] args) {
		
		GamePlay gp = new GamePlay();   
		JLabel label1 = new JLabel("Welcome to the number guessing game.Jack has hidden a card which has a number betweeen 0 to 100.");
		gp.frame.add(label1);
		label1.setHorizontalTextPosition(JLabel.RIGHT);
		label1.setVerticalTextPosition(JLabel.TOP);
//		JLabel label2 = new JLabel("Jack has hidden a card which has a number betweeen 0 to 100.");
//		gp.addLabel(label2);
		JLabel label3 = new JLabel("Can you find it?");
		gp.frame.add(label3);
		label3.setHorizontalTextPosition(JLabel.RIGHT);
		label3.setVerticalTextPosition(JLabel.TOP);
		System.out.println("Welcome to the number guessing game.");
		System.out.println("Jack has hidden a card which has a number betweeen 0 to 100.");
		System.out.println("Can you find it?");
		gp.randomNumberGenerator();
		gp.chooseLevel();
		gp.setChance();
		gp.gameControl();
		
		
	}
}
