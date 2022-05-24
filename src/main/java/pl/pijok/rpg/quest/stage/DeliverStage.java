package pl.pijok.rpg.quest.stage;


import org.bukkit.Material;
import pl.pijok.rpg.quest.Reward;

import java.util.HashMap;

public class DeliverStage extends Stage {

    private HashMap<Material, Integer> toDeliver;
    private HashMap<Material, Integer> progress;

    public DeliverStage(String startMessage, Reward stageReward, String endMessage, HashMap<Material, Integer> toDeliver, HashMap<Material, Integer> progress) {
        super(startMessage, stageReward, endMessage);
        this.toDeliver = toDeliver;
        this.progress = progress;
    }

    public HashMap<Material, Integer> getToDeliver() {
        return toDeliver;
    }

    public void setToDeliver(HashMap<Material, Integer> toDeliver) {
        this.toDeliver = toDeliver;
    }

    public HashMap<Material, Integer> getProgress() {
        return progress;
    }

    public void setProgress(HashMap<Material, Integer> progress) {
        this.progress = progress;
    }
}
