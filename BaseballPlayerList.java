import java.util.List;
import java.util.ArrayList;

public class BaseballPlayerList {
	List<BaseballPlayer> players;

	public BaseballPlayerList() {
		players = new ArrayList<>();
	}

	public void add(String name, String team, double avg) {
		players.add(new BaseballPlayer(name, team, avg));
	}

	public ArrayList<BaseballPlayer> getAllPlayersOnTeam(String team) {
		ArrayList<BaseballPlayer> playersOnTeam = new ArrayList<>();

		for(BaseballPlayer b: players) {
			if(b.getTeam().equals(team)) {
				playersOnTeam.add(b);
			}
		}

		return playersOnTeam;
	}

	public BaseballPlayer getHighestAverage(String team) {
		ArrayList<BaseballPlayer> playersOnTeam = getAllPlayersOnTeam(team);

		//check to make sure there are some players
		if(playersOnTeam.size() == 0) {
			return null;
		}

		BaseballPlayer best = playersOnTeam.get(0);
		for(BaseballPlayer b: playersOnTeam) {
			if(b.getBattingAverage() > best.getBattingAverage()) {
				best = b;
			}
		}

		return best;
	}
}






