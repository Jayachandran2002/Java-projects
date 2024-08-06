package exercisePackage.CoreJavaPrograms;

public class PlayerRating {
	int playerPosition;
	String playerName;
	float criticOneRating;
	float criticTwoRating;
	float criticThreeRating;
	float averageRating;
	char Category;
	
	PlayerRating(int playerPosition,String playerName) {
		this.playerPosition = playerPosition;
		this.playerName = playerName;
	}
	
	void calculateAverageRating(float criticOneRating,float criticTwoRating) {
		this.criticOneRating = criticOneRating;
		this.criticTwoRating = criticTwoRating;
		averageRating = (criticOneRating + criticTwoRating)/2;
	}
	void calculateAverageRating(float criticOneRating,float criticTwoRating,float criticThreeRating) {
		this.criticOneRating = criticOneRating;
		this.criticTwoRating = criticTwoRating;
		this.criticThreeRating = criticThreeRating;
		averageRating = (criticOneRating + criticTwoRating + criticThreeRating)/3;
	}
	
	char calculateCategory() {
		if(averageRating > 8) {
			Category = 'A';
		}else if(averageRating > 5 && averageRating <= 8) {
			Category = 'B';
		}else if(averageRating > 0 && averageRating <= 5) {
			Category = 'C';
		}
		return Category;
	}
	
	void display() {
		System.out.println("The Player Name is "+playerName);
		System.out.println("The Player Position is "+playerPosition);
		System.out.println("The Average Rating is "+averageRating);
		System.out.println("The Category is "+calculateCategory());
		
	}
	
	public static void main(String[] args) {
		PlayerRating PR = new PlayerRating(1,"Beckham");
		PR.calculateAverageRating(9f, 9.9f);
		PR.display();
		System.out.println("-------------");
		PlayerRating PR1 = new PlayerRating(6,"Oscar");
		PR1.calculateAverageRating(5f, 6f, 7f);
		PR1.display();
	}
}
