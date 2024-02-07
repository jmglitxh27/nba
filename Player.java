public class Player{
	// Player Age
	private String pname;
	// Number of points
	private double ppg;
	// Number of rebounds
	private double rpg;
	// Number of assists
	private double apg;
	// Number of blocks
	private double blocks;
	// Number of steals
	private double steals;
	// Average time played
	private double ptime;
	// Player height
	private double height;
	// Player College
	private String pcollege;
	// Player birthday
	private String pbday;

	// Default constructor
	class Player(){
		pname = "Default";
		ppg = 0.0;
		rpg = 0.0;
		apg = 0.0;
		blocks = 0.0;
		steals = 0.0;
		ptime = 0.0;
		height = 0.0;
		pcollege = "Default";
		pbday = "Default";
	}

	// Constructor with parameters
	class Player(pname, ppg, rpg, apg, blocks, steals, ptime, height, pcollege, pbday){
		pname = "Default";
		ppg = this.ppg;
		rpg = this.rpg;
		apg = this.apg;
		blocks = this.blocks;
		steals = this.steals;
		ptime = this.ptime;
		height = this.height;
		pcollege = this.pcollege;
		pbday = this.pbday;
	}

	

}