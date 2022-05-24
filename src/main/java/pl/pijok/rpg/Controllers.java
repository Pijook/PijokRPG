package pl.pijok.rpg;

import pl.pijok.rpg.rpgPlayer.RPGPlayerController;

public class Controllers {

    private static RPGPlayerController rpgPlayerController;

    public static void create(){
        rpgPlayerController = new RPGPlayerController();
    }

    public static RPGPlayerController getRpgPlayerController() {
        return rpgPlayerController;
    }
}
