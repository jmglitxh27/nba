public class Team{
	private String tname;
	private Player[] players;
	private String thome;
	
	public Team(){
		tname="Default"; 
		players={}; 
		thome="Default";
	}

	public Team(tname, players, thome){
		this.tname=tname;
		this.players=players;
		this.thome=thome;
	}

	

}