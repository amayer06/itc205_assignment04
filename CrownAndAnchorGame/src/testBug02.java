import org.junit.BeforeClass;
import org.junit.Test;

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
		
		System.out.println("Bet for ALL players is: " + bet);
		System.out.println();
		
	    player = new Player("Player01", 10);
	    System.out.println("Player01: " + player.getName());
	    System.out.println("Player Balance: " + player.getBalance());
	    System.out.println("Does Balance Exceeds Limit? " + player.balanceExceedsLimitBy(bet));
	    System.out.println();
	    
	    player = new Player("Player02", 5);
	    System.out.println("Player02: " + player.getName());
	    System.out.println("Player Balance: " + player.getBalance());
	    System.out.println("Does Balance Exceeds Limit? " + player.balanceExceedsLimitBy(bet));
	    System.out.println();
	    
	    player = new Player("Player03", 0);
	    System.out.println("Player03: " + player.getName());
	    System.out.println("Player Balance: " + player.getBalance());
	    System.out.println("Does Balance Exceeds Limit? " + player.balanceExceedsLimitBy(bet));
	}

}
