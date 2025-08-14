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
	

}