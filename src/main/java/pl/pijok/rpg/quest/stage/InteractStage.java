package pl.pijok.rpg.quest.stage;

import org.bukkit.Location;
import pl.pijok.rpg.quest.Reward;

public class InteractStage extends Stage{

    private Location blockToInteract;

    public InteractStage(String startMessage, Reward stageReward, String endMessage, Location blockToInteract) {
        super(startMessage, stageReward, endMessage);
        this.blockToInteract = blockToInteract;
    }

    public Location getBlockToInteract() {
        return blockToInteract;
    }

    public void setBlockToInteract(Location blockToInteract) {
        this.blockToInteract = blockToInteract;
    }
}
