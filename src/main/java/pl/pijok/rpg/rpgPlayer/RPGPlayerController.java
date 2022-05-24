package pl.pijok.rpg.rpgPlayer;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class RPGPlayerController {

    private final HashMap<UUID, RPGPlayer> rpgPlayers;

    public RPGPlayerController() {
        this.rpgPlayers = new HashMap<>();
    }

    public RPGPlayer getPlayer(UUID uuid){
        return rpgPlayers.get(uuid);
    }

    public RPGPlayer getPlayer(Player player){
        return getPlayer(player.getUniqueId());
    }

    public HashMap<UUID, RPGPlayer> getRpgPlayers() {
        return rpgPlayers;
    }
}
