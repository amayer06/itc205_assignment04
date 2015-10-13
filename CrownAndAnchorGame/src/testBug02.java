import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class testBug02 {
	
	private static Player player;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		player = new Player("Ame", 10);
	    player.setLimit(0);
	}
	
	
	
	@Test
	public void testBalanceComparedToLimit() {
		
	    int bet = 5;

	    player = new Player("Player01", 10);
	    System.out.println("Player Balance: " + player.getBalance());
	    System.out.println("Bet: " + bet);
	    System.out.println("Does Balance Exceeds Limit? " + player.balanceExceedsLimitBy(bet));
	    System.out.println();

	    player = new Player("Player02", 5);
	    System.out.println("Player Balance: " + player.getBalance());
	    System.out.println("Bet: " + bet);
	    System.out.println("Does Balance Exceeds Limit? " + player.balanceExceedsLimitBy(bet));
	    System.out.println();
	    
	    player = new Player("Player03", 0);
	    System.out.println("Player Balance: " + player.getBalance());
	    System.out.println("Bet: " + bet);
	    System.out.println("Does Balance Exceeds Limit? " + player.balanceExceedsLimitBy(bet));
	}

}
