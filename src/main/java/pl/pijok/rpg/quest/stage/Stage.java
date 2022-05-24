package pl.pijok.rpg.quest.stage;

import pl.pijok.rpg.quest.Reward;

public abstract class Stage {

    private String startMessage;
    private Reward stageReward;
    private String endMessage;

    public Stage(String startMessage, Reward stageReward, String endMessage) {
        this.startMessage = startMessage;
        this.stageReward = stageReward;
        this.endMessage = endMessage;
    }

    public String getStartMessage() {
        return startMessage;
    }

    public void setStartMessage(String startMessage) {
        this.startMessage = startMessage;
    }

    public Reward getStageReward() {
        return stageReward;
    }

    public void setStageReward(Reward stageReward) {
        this.stageReward = stageReward;
    }

    public String getEndMessage() {
        return endMessage;
    }

    public void setEndMessage(String endMessage) {
        this.endMessage = endMessage;
    }
}
