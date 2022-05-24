package pl.pijok.rpg.quest.stage;

import org.bukkit.entity.EntityType;
import pl.pijok.rpg.quest.Reward;

import java.util.HashMap;

public class KillStage extends Stage{

    private HashMap<EntityType, Integer> toKill;
    private HashMap<EntityType, Integer> progress;

    public KillStage(String startMessage, Reward stageReward, String endMessage, HashMap<EntityType, Integer> toKill, HashMap<EntityType, Integer> progress) {
        super(startMessage, stageReward, endMessage);
        this.toKill = toKill;
        this.progress = progress;
    }

    public HashMap<EntityType, Integer> getToKill() {
        return toKill;
    }

    public void setToKill(HashMap<EntityType, Integer> toKill) {
        this.toKill = toKill;
    }

    public HashMap<EntityType, Integer> getProgress() {
        return progress;
    }

    public void setProgress(HashMap<EntityType, Integer> progress) {
        this.progress = progress;
    }
}
