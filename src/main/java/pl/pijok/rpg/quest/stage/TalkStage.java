package pl.pijok.rpg.quest.stage;

import pl.pijok.rpg.quest.Reward;

public class TalkStage extends Stage{

    private int npcID;

    public TalkStage(String startMessage, Reward stageReward, String endMessage, int npcID) {
        super(startMessage, stageReward, endMessage);
        this.npcID = npcID;
    }

    public int getNpcID() {
        return npcID;
    }

    public void setNpcID(int npcID) {
        this.npcID = npcID;
    }
}
