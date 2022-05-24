package pl.pijok.rpg.quest;

import pl.pijok.rpg.quest.stage.Stage;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Quest {

    private static int nextQuestID;

    public static int getNextQuestID() {
        return nextQuestID;
    }

    public static void setNextQuestID(int nextQuestID) {
        Quest.nextQuestID = nextQuestID;
    }

    // ----- ----- -----

    private int id;
    private String name;

    private UUID versionID;

    private int startNPC;

    private int requiredLevel;
    private List<Integer> requiredQuests;

    private LinkedList<Stage> stages;

    private Reward reward;

    public Quest(String name){
        this.id = nextQuestID;
        this.name = name;
        this.versionID = UUID.randomUUID();

        nextQuestID++;
    }

    public Quest(int id, String name, int startNPC, UUID versionID, int requiredLevel, List<Integer> requiredQuests, LinkedList<Stage> stages, Reward reward) {
        this.id = id;
        this.name = name;
        this.startNPC = startNPC;
        this.versionID = versionID;
        this.requiredLevel = requiredLevel;
        this.requiredQuests = requiredQuests;
        this.stages = stages;
        this.reward = reward;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(int requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    public List<Integer> getRequiredQuests() {
        return requiredQuests;
    }

    public void setRequiredQuests(List<Integer> requiredQuests) {
        this.requiredQuests = requiredQuests;
    }

    public LinkedList<Stage> getStages() {
        return stages;
    }

    public void setStages(LinkedList<Stage> stages) {
        this.stages = stages;
    }

    public Reward getReward() {
        return reward;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
    }

    public UUID getVersionID() {
        return versionID;
    }

    public void setVersionID(UUID versionID) {
        this.versionID = versionID;
    }

    public int getStartNPC() {
        return startNPC;
    }

    public void setStartNPC(int startNPC) {
        this.startNPC = startNPC;
    }
}
