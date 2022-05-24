package pl.pijok.rpg.rpgPlayer;

import pl.pijok.rpg.quest.Quest;

import java.util.ArrayList;
import java.util.List;

public class RPGPlayer {

    private int exp;
    private int level;
    private List<Quest> completedQuests;
    private List<Quest> activeQuests;

    public RPGPlayer(){
        exp = 0;
        level = 1;
        completedQuests = new ArrayList<>();
        activeQuests = new ArrayList<>();
    }

    public RPGPlayer(int exp, int level, List<Quest> completedQuests, List<Quest> activeQuests) {
        this.exp = exp;
        this.level = level;
        this.completedQuests = completedQuests;
        this.activeQuests = activeQuests;
    }

    public void increaseExp(int exp){
        this.exp += exp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void increaseLevel(int level){
        this.level += level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Quest> getCompletedQuests() {
        return completedQuests;
    }

    public void setCompletedQuests(List<Quest> completedQuests) {
        this.completedQuests = completedQuests;
    }

    public List<Quest> getActiveQuests() {
        return activeQuests;
    }

    public void setActiveQuests(List<Quest> activeQuests) {
        this.activeQuests = activeQuests;
    }
}
