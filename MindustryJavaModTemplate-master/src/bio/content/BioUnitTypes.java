package bio.content;

import mindustry.type.*;

/** Фауна Virolix (скелет: оружие/волны добавим со спрайтами). */
public class BioUnitTypes{
    public static UnitType
        sporeMite,      // мелкая спора-ползун, «dagger» био-мира
        ichorCrawler,   // плевок ихором, накладывает infested
        bloomTitan;     // босс-«цветение», спавнит мелких юнитов

    public static void load(){
        sporeMite = new UnitType("bio-spore-mite");
        sporeMite.health = 45f;
        sporeMite.speed = 0.55f;
        sporeMite.flying = false;
        sporeMite.hitSize = 7f;
        sporeMite.targetAir = false;

        ichorCrawler = new UnitType("bio-ichor-crawler");
        ichorCrawler.health = 120f;
        ichorCrawler.speed = 0.4f;
        ichorCrawler.hitSize = 10f;

        bloomTitan = new UnitType("bio-bloom-titan");
        bloomTitan.health = 8000f;
        bloomTitan.speed = 0.22f;
        bloomTitan.hitSize = 28f;
        //boss-флаг задаётся через createWaves/spawnRadius в волнах сектора (TODO)
    }
}
