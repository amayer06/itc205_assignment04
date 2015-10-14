import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class testBug01 {

	private static Player player;
	private static Game game;
	private static Dice mockDice01, mockDice02, mockDice03;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mockDice01 = mock(Dice.class);
	    mockDice02 = mock(Dice.class);
	    mockDice03 = mock(Dice.class);
		
		player = new Player("Ame", 50);	
	}
	
	
	
	//Test Bug01 Hypothesis with 1 Match
	@Test
	public void testOneMatch() {
		
		when(mockDice01.getValue()).thenReturn(DiceValue.SPADE);
	    when(mockDice02.getValue()).thenReturn(DiceValue.CLUB);
	    when(mockDice03.getValue()).thenReturn(DiceValue.HEART);

	    game = new Game(mockDice01, mockDice02, mockDice03);
		
	    System.out.println("Start Balance: " + player.getBalance());
	    DiceValue pick = DiceValue.HEART;
	    int balance = player.getBalance();
	    int bet = 10;
	    int winnings = game.playRound(player, pick, bet);
	    assertEquals(10, winnings);
	    System.out.println("Player: " + player.getName());
	    System.out.println("Bet: " + bet);
	    System.out.println("Picked: " + pick);
	    int withoutBet = (balance - bet);
	    System.out.println("Balance without bet: " + withoutBet);
	    System.out.println("Rolled: " + game.getDiceValues());
	    System.out.println("Winnings: " + winnings);
	    System.out.println("Given: Winnings " + winnings + " and Bet " + bet);
	    System.out.println("Balance after 1 match: " + player.getBalance());
//	    System.out.println("Balance should be: " + (player.getBalance() + bet));
	    System.out.println();
	}

	
	
	//Test Bug01 Hypothesis with 2 Match
	@Test
	public void testTwoMatch() {

	    when(mockDice01.getValue()).thenReturn(DiceValue.HEART);
	    when(mockDice02.getValue()).thenReturn(DiceValue.CLUB);
	    when(mockDice03.getValue()).thenReturn(DiceValue.HEART);

	    game = new Game(mockDice01, mockDice02, mockDice03);
		
	    System.out.println("Start Balance: " + player.getBalance());
	    DiceValue pick = DiceValue.HEART;
	    int balance = player.getBalance();
	    int bet = 10;
	    int winnings = game.playRound(player, pick, bet);
	    assertEquals(20, winnings);
	    System.out.println("Player: " + player.getName());
	    System.out.println("Bet: " + bet);
	    System.out.println("Picked: " + pick);
	    int withoutBet = (balance - bet);
	    System.out.println("Balance without bet: " + withoutBet);
	    System.out.println("Rolled: " + game.getDiceValues());
	    System.out.println("Winnings: " + winnings);
	    System.out.println("Given: Winnings " + winnings + " and Bet " + bet);
	    System.out.println("Balance after 2 match: " + player.getBalance());
//	    System.out.println("Balance should be: " + (player.getBalance() + bet));
	    System.out.println();
	}
	
	
	
	//Test Bug01 Hypothesis with 3 Match
	@Test
	public void testThreeMatch() {
		
	    when(mockDice01.getValue()).thenReturn(DiceValue.HEART);
	    when(mockDice02.getValue()).thenReturn(DiceValue.HEART);
	    when(mockDice03.getValue()).thenReturn(DiceValue.HEART);

	    game = new Game(mockDice01, mockDice02, mockDice03);
		
	    System.out.println("Start Balance: " + player.getBalance());
	    DiceValue pick = DiceValue.HEART;
	    int balance = player.getBalance();
	    int bet = 10;
	    int winnings = game.playRound(player, pick, bet);
	    assertEquals(30, winnings);
	    System.out.println("Player: " + player.getName());
	    System.out.println("Bet: " + bet);
	    System.out.println("Picked: " + pick);
	    int withoutBet = (balance - bet);
	    System.out.println("Balance without bet: " + withoutBet);
	    System.out.println("Rolled: " + game.getDiceValues());
	    System.out.println("Winnings: " + winnings);
	    System.out.println("Given: Winnings " + winnings + " and Bet " + bet);
	    System.out.println("Balance after 3 match: " + player.getBalance());
//	    System.out.println("Balance should be: " + (player.getBalance() + bet));
	    System.out.println();
	}
}
