package bio.content;

import arc.graphics.*;
import mindustry.type.*;

/** Ресурсы био-планеты. */
public class BioItems{
    public static Item
        spore,     // твёрдые споры — «уголь» био-мира
        chitin,    // хитин с поверженных тварей
        resin,     // затвердевшая смола — аналог титана
        nucleus;   // кристаллизованное ядро планеты — эндгейм-ресурс

    public static void load(){
        spore = new Item("bio-spore", Color.valueOf("7ec850"));
        spore.hardness = 0;
        spore.cost = 1.1f;
        spore.flammability = 0.5f;

        chitin = new Item("bio-chitin", Color.valueOf("c9a06c"));
        chitin.hardness = 2;
        chitin.cost = 1.6f;

        resin = new Item("bio-resin", Color.valueOf("e0b040"));
        resin.hardness = 3;
        resin.cost = 2.2f;
        resin.flammability = 0.3f;

        nucleus = new Item("bio-nucleus", Color.valueOf("ff5edb"));
        nucleus.hardness = 5;
        nucleus.cost = 4f;
        nucleus.radioactivity = 0.3f;
    }
}
