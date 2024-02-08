public class Player{
	// Player first name
	private String fname;
	// Player last name
	private String lname;
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
	// Player height in meters
	private double height;
	// Player College
	private String pcollege;
	// Player birthday
	private String pbday;

	// Default constructor
	public Player(){
		fname = "Default";
		lname = "Default";
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
	public Player(String fname, String lname, double ppg, double rpg, double apg, double blocks, 
		double steals, double ptime, double height, String pcollege, String pbday){
		this.fname = fname;
		this.lname = lname;
		this.ppg = ppg;
		this.rpg = rpg;
		this.apg = apg;
		this.blocks = blocks;
		this.steals = steals;
		this.ptime = ptime;
		this.height = height;
		this.pcollege = pcollege;
		this.pbday = pbday;
	}

	// Constructor with name, college, height in meters, and birthday
	public Player(String fname, String lname, double height, String pcollege, String pbday){
		this.fname = fname;
		this.lname = lname;
		ppg = 0.0;
		rpg = 0.0;
		apg = 0.0;
		blocks = 0.0;
		steals = 0.0;
		ptime = 0.0;
		this.height = height;
		this.pcollege = pcollege;
		this.pbday = pbday;
	}

	// Accessors and mutators
	public String accessPlayerName(){
		return fname + " " + lname;
	}

	public void setPlayerName(String fname, String lname){
		this.fname = fname;
		this.lname = lname;
	}

	public double accessPPG(){
		return ppg;
	}

	public void setPPG(double ppg){
		this.ppg = ppg;
	}

	public double accessRPPG(){
		return rpg;
	}

	public void setRPPG(double rppg){
		this.ppg = rpg;
	}

	public double accessAPG(double rppg){
		return apg;
	}

}