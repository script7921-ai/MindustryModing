package bio.content;

import mindustry.content.*;
import mindustry.type.*;

/** Статус-эффекты: заражение спорами и симбиоз. */
public class BioStatusEffects{
    public static StatusEffect
        infested,   // споры медленно убивают юнита
        symbiosis;  // регенерация + скорость

    public static void load(){
        infested = new StatusEffect("bio-infested");
        infested.color = BioLiquids.biomass.color.cpy();
        infested.speedMultiplier = 0.8f;
        infested.damage = 0.15f;
        infested.opposites.add(StatusEffects.wet); // вода смывает споры

        symbiosis = new StatusEffect("bio-symbiosis");
        symbiosis.color = BioLiquids.ichor.color.cpy();
        symbiosis.speedMultiplier = 1.15f;
        symbiosis.healthMultiplier = 1.1f; // плюс = лечение
        symbiosis.opposites.add(StatusEffects.burning);
    }
}
