package pcgapprentice.dungeonlevel.utils;

import java.util.HashMap;
import java.util.Map;

public class DemonstrationData {

	public int maxOpen;
	public int maxDoors;
	public int maxEnemies;
	public int maxTreasures;
	public int maxRooms;
	public Map<String, HashMap<String, HashMap<String, Double>>> frequencyData;

	public DemonstrationData(int maxOpen, int maxDoors, int maxEnemies, int maxTreasures, int maxRooms,
			Map<String, HashMap<String, HashMap<String, Double>>> frequencyData) {
		super();
		this.maxOpen = maxOpen;
		this.maxDoors = maxDoors;
		this.maxEnemies = maxEnemies;
		this.maxTreasures = maxTreasures;
		this.maxRooms = maxRooms;
		this.frequencyData = frequencyData;
	}

}
