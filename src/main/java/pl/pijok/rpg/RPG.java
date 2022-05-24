package pl.pijok.rpg;

import org.bukkit.plugin.java.JavaPlugin;
import pl.pijok.api.Debugger;

public class RPG extends JavaPlugin {

    private Debugger debugger;

    @Override
    public void onEnable() {
        API.create(this);

        debugger = API.getDebugger();

        if(!loadStuff(false)){
            debugger.log("&cSomething went wrong while enabling " + getDescription().getName());
            debugger.log("&4Disabling...");
        }
        else{
            debugger.log("&aEverything loaded correctly!");
        }

    }

    @Override
    public void onDisable() {
        saveStuff();
    }

    public boolean loadStuff(boolean reload){
        try{
            if(!reload){

            }

        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void saveStuff(){

    }
}
