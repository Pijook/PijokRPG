package pl.pijok.rpg.quest;

import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;
import pl.pijok.rpg.API;
import pl.pijok.rpg.quest.stage.Stage;

import java.util.*;

public class QuestController {

    private final HashMap<Integer, List<Quest>> quests;

    public QuestController(HashMap<Integer, List<Quest>> quests) {
        this.quests = quests;
    }

    public void loadQuests(){
        YamlConfiguration configuration = API.getConfigProvider().load("quests.yml");

        for(String questID : configuration.getConfigurationSection("quests").getKeys(false)){
            Quest quest = loadQuest(configuration, "quests." + questID);

            if(!quests.containsKey(quest.getStartNPC())){
                quests.put(quest.getStartNPC(), new ArrayList<>());
            }
            quests.get(quest.getStartNPC()).add(quest);
        }
    }

    public Quest loadQuest(YamlConfiguration configuration, String path){
        int questID = configuration.getInt(path + ".ID");
        String name = configuration.getString(path + ".name");
        UUID versionID = UUID.fromString(configuration.getString(path + ".versionID"));
        int startNPC = configuration.getInt(path + ".startNPC");
        int requiredLevel = configuration.getInt(path + ".requiredLevel");
        List<Integer> requiredQuests = configuration.getIntegerList(path + ".requiredQuests");

        //Stages
        LinkedList<Stage> stages = new LinkedList<>();
        for(String stageID : configuration.getConfigurationSection(path + ".stages").getKeys(false)){
            String stageType = configuration.getString(path + ".stages.stageType");

            switch (stageType){
                case "deliver" -> {
                    HashMap<Material, Integer> toDeliver = new HashMap<>();
                    HashMap<Material, Integer> progress = new HashMap<>();


                }
            }
        }

        //Reward
        int rewardExp = configuration.getInt(path + ".reward.exp");
        List<String> rewardCommands = new ArrayList<>();
        List<ItemStack> rewardItems = new ArrayList<>();
        if(configuration.contains(path + ".reward.commands")){
            rewardCommands = configuration.getStringList(path + ".reward.commands");
        }
        if(configuration.contains(path + ".reward.items")){
            for(String itemID : configuration.getConfigurationSection(path + ".reward.items").getKeys(false)){
                rewardItems.add(API.getConfigProvider().getItemstack(configuration, path + ".reward.items." + itemID));
            }
        }

        Reward reward = new Reward(rewardExp, rewardCommands, rewardItems);

        return new Quest(questID, name, startNPC, versionID, requiredLevel, requiredQuests, stages, reward);
    }

    public void saveQuests(){

    }

    public HashMap<Integer, List<Quest>> getQuests() {
        return quests;
    }
}
