public class BaseballPlayer {
	private String name;
	private String team;
	private double battingAverage;

	public BaseballPlayer(String name, String team, double avg) {
		this.name = name;
		this.team = team;
		this.battingAverage = avg;
	}

	public String getName() {
		return name;
	}

	public String getTeam() {
		return team;
	}

	public double getBattingAverage() {
		return battingAverage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setBattingAverage(double avg) {
		this.battingAverage = avg;
	}

	public String toString() {
		return name + " (" + team + "), " + battingAverage;
	}
}