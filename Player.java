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
		pFname = "Default";
		pLname = "Default";
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
	class Player(String pFname, String pLname, double ppg, double rpg, double apg, double blocks, 
		double steals, double ptime, double height, String pcollege, String pbday){
		pFname = this.pFname;
		pLName = this.pLname;
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

	// Constructor with name, college, height in meters, and birthday
	class Player(String pFname, String pLname, double height, String pcollege, String pbday){
		pFname = this.pFname;
		pLName = this.pLname;
		ppg = 0.0;
		rpg = 0.0
		apg = 0.0
		blocks = 0.0;
		steals = 0.0;
		ptime = 0.0;
		height = this.height;
		pcollege = this.pcollege;
		pbday = this.pbday;
	}

	// Accessors and mutators
	public accessPlayerName(){
		return pname;
	}

	public setPlayerName(String pname){
		pname = this.pname;
	}

	public accessPPG(){
		return ppg;
	}

	public setPPG(double ppg){
		ppg = this.ppg;
	}

	public accessRPPG(){
		return rppg;
	}

	public setRPPG(double rppg){
		rppg = this.rppg;
	}

	public accessAPG(double rppg){
		return apg;
	}

}