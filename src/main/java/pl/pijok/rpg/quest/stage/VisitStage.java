package pl.pijok.rpg.quest.stage;

import org.bukkit.Location;
import pl.pijok.rpg.quest.Reward;

public class VisitStage extends Stage {

    private Location locationToVisit;

    public VisitStage(String startMessage, Reward stageReward, String endMessage, Location locationToVisit) {
        super(startMessage, stageReward, endMessage);
        this.locationToVisit = locationToVisit;
    }

    public Location getLocationToVisit() {
        return locationToVisit;
    }

    public void setLocationToVisit(Location locationToVisit) {
        this.locationToVisit = locationToVisit;
    }
}
