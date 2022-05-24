package pl.pijok.rpg.quest;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import pl.pijok.rpg.Controllers;
import pl.pijok.rpg.rpgPlayer.RPGPlayer;

import java.util.List;

public class Reward {

    private int exp;
    private List<String> commands;
    private List<ItemStack> items;

    public Reward(int exp, List<String> commands, List<ItemStack> items) {
        this.exp = exp;
        this.commands = commands;
        this.items = items;
    }

    public void giveReward(Player player){
        RPGPlayer rpgPlayer = Controllers.getRpgPlayerController().getPlayer(player);

        rpgPlayer.increaseExp(exp);

        for(String command : commands){
            command = command.replace("%player%", player.getName());
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), command);
        }

        for(ItemStack itemStack : items){
            player.getInventory().addItem(new ItemStack(itemStack));
        }
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public List<ItemStack> getItems() {
        return items;
    }

    public void setItems(List<ItemStack> items) {
        this.items = items;
    }
}
