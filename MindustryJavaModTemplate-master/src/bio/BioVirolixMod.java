package bio;

import arc.*;
import arc.util.*;
import bio.content.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;

public class BioVirolixMod extends Mod{

    public BioVirolixMod(){
        Log.info("Loaded BioVirolixMod constructor.");

        Events.on(ClientLoadEvent.class, e -> {
            //Сохраняется ли планета в звёздной карте после первого запуска
            if(Core.settings.getBool("bio-seen", false)) return;
            Core.settings.put("bio-seen", true);
        });
    }

    @Override
    public void loadContent(){
        BioLiquids.load();
        BioStatusEffects.load();
        BioItems.load();
        BioBlocks.load();
        BioUnitTypes.load();
        BioSectors.load();
        BioPlanet.load();
    }
}
