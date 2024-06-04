package guessingGame;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GamePlay{
	int level;
	int chances;
	int randNum;
	int x=-280;
	int y = -280;
	JFrame frame = new JFrame();
	
	GamePlay(){
		frame.setTitle("Number Guessing Game");
		frame.setSize(600,600);
//		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	void addLabel(JLabel label) {
		frame.add(label);
		label.setHorizontalTextPosition(JLabel.RIGHT);
		label.setVerticalTextPosition(JLabel.TOP);
		
	}
	
	void chooseLevel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter level (1/2/3):");
		level = sc.nextInt();
	}
	
	void setChance() {
		if(level == 1) {
			chances = 10;
		}
		else if(level == 2) {
			chances = 7;
		}
		else if(level == 3) {
			chances = 4;
		}
		else {
			System.out.println("Invalid input");
		}
	}
	
	void randomNumberGenerator() {
		Random rand = new Random();
		randNum = rand.nextInt(101);
	}
	
	void gameControl() {
		int guess,i = chances;
		Scanner s = new Scanner(System.in);
		while(i>0) {
			System.out.println("You have "+ i +" chances left.");
			System.out.println("Guess a number:");
			guess = s.nextInt();
			if(guess == randNum) {
				System.out.println("The gursses number is correct. YOU WIN!");
				return;
			}
			else if(guess > randNum) {
				System.out.println("The guessed number is too high.");
			}
			else {
				System.out.println("The guessed number is too low.");
			}
			i--;
			if(i==0) {
				System.out.println("The correct number is "+ randNum);
				System.out.println("You have exhausted all your"+ chances +" chances. YOU LOST");
			}
		}
	}
}