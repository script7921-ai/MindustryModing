package bio.content;

import arc.graphics.*;
import mindustry.type.*;

/** Жидкости планеты: биомасса и ихор. */
public class BioLiquids{
    public static Liquid
        biomass,   // "Биомасса" — базовая текучая жизнь планеты
        ichor;     // "Ихор" — токсичная кровь фауны Virolix

    public static void load(){
        biomass = new Liquid("bio-biomass", Color.valueOf("4f9e3a"));
        biomass.viscosity = 0.9f;
        biomass.flammability = 0.2f;
        biomass.explosiveness = 0.1f;
        biomass.heatCapacity = 0.6f;

        ichor = new Liquid("bio-ichor", Color.valueOf("a83279"));
        ichor.viscosity = 1.5f;
        ichor.flammability = 0.6f;
        ichor.explosiveness = 0.3f;
        ichor.capPuddles = true;
    }
}
