import java.util.Scanner;
	
	public class Random {
		public static void main (String [] args) {
			//ask user how many people they'll share a post with
			System.out.println("How many people will you share your "
					+ "majorly controversial idea with, risking loss of "
					+ "friendship and respect?");
			Scanner input = new Scanner(System.in);
			int numPeople  = input.nextInt();

			double percentage=(Math.random());
			System.out.println("Assuming " + ((double)((int)(percentage*1000))/10) + "% will share it with exactly the same number of friends that you did, and the same % will then agree with it...");

			//compute how many shares will come from the first round of 
			//you posting
			
			int firstShares = (int)((percentage)*numPeople);
			System.out.println(firstShares + " will share in the first round after you");

			//ask how many rounds into the future you want to forecast
			System.out.println("Projecting four rounds into the future...");
			int secondShares = (int)((percentage*firstShares*numPeople));
			int thirdShares = (int)((percentage*secondShares*numPeople));
			int fourthShares = (int)((percentage*thirdShares*numPeople));
			System.out.println("There will be " + fourthShares + " shares after the fourth round");
			//compute how many shares there will be after that many rounds
			//assuming each round has same agree/share rate
		}
	}


	/* example output
	How many people will you share your majorly controversial idea with, risking loss of friendship and respect?
	50
	Assuming 34.8% will share it with exactly the same number of friends that you did, and the same % will then agree with it...
	17 will share in the first round after you
	Projecting four rounds into the future...
	There will be 88740 shares after the fourth round.

	How many people will you share your majorly controversial idea with, risking loss of friendship and respect?
	12
	Assuming 92.7% will share it with exactly the same number of friends that you did, and the same % will then agree with it...
	11 will share in the first round after you
	Projecting four rounds into the future...
	There will be 16104 shares after the fourth round.

	How many people will you share your majorly controversial idea with, risking loss of friendship and respect?
	300
	Assuming 42.5% will share it with exactly the same number of friends that you did, and the same % will then agree with it...
	127 will share in the first round after you
	Projecting four rounds into the future...
	There will be 262209280 shares after the fourth round.

	How many people will you share your majorly controversial idea with, risking loss of friendship and respect?
	35
	Assuming 10.9% will share it with exactly the same number of friends that you did, and the same % will then agree with it...
	3 will share in the first round after you
	Projecting four rounds into the future...
	There will be 120 shares after the fourth round.
	*/

