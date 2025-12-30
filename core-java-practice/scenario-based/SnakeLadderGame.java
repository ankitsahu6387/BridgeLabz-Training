import java.util.*;
public class SnakeLadderGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Welcome to Snake and Ladder Simulator.. \n");
		System.out.println("Enter 1 for Single player");
		System.out.println("Enter 2 for Two players");
		int player = sc.nextInt();
		
		if(player == 1) {
			int position = 0;
			int diceCount = 0;			
			while(position < 100) {
				System.out.println("Current Postion: "+position);
				diceCount++;
				int dieNumber = generateNumber();
				String option = selectOption();			
				position = updatePosition(option,dieNumber,position);
			}
			System.out.println("You won the game (reached 100)!!");
			System.out.println("Number of Dice rolled: "+diceCount);
		} else {
			int player1pos = 0;
			int player2pos = 0;
			int diceCount = 0;
			boolean player1turn = true;			
			while(player1pos < 100 && player2pos < 100) {
				System.out.println("Player 1 current position: "+player1pos);
				System.out.println("Player 2 current position: "+player2pos);
				diceCount++;
				if(player1turn) {
					int dieNumber = generateNumber();
					String option = selectOption();
					player1pos = updatePosition(option,dieNumber,player1pos);
					if(!option.equalsIgnoreCase("ladder")) {
						player1turn = false;
					}
				}else {
					int dieNumber = generateNumber();
					String option = selectOption();
					player2pos = updatePosition(option,dieNumber,player2pos);
					if(!option.equalsIgnoreCase("ladder")) {
						player1turn = true;
					}
				}
			}
			if(player1pos == 100) System.out.println("Player 1 won the game (reached 100)!!");
			else System.out.println("Player 2 won the game (reached 100)!!");
			System.out.println("Number of Dice rolled: "+diceCount);
		}
	}	
	//UseCase 1
	public static int generateNumber() {
		int number = (int)(Math.random()*6)+1;
		return number;
	}	
	//UseCase 2
	public static String selectOption() {
		int option = (int)(Math.random()*3);
		if(option == 0) {
			return "sameposition";
		}else if(option == 1){
			return "ladder";
		}else {
			return "snake";
		}
	}	
	//UseCase 3
	public static int updatePosition(String option,int dieNumber,int position) {
		if(option.equalsIgnoreCase("ladder") && (position+dieNumber <= 100)) {
			position += dieNumber;
		} else if(option.equalsIgnoreCase("snake")){
			if(position - dieNumber <0) {
				position = 0;
			} else {
				position -= dieNumber;
			}
		}
		return position;
	}
}