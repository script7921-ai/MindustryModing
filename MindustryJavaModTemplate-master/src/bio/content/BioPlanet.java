package bio.content;

import arc.graphics.*;
import mindustry.content.*;
import mindustry.type.*;
import mindustry.world.meta.*;

/**
 * Virolix — живая планета-биомасса в системе Serpulo.
 * Поверхность: океаны биомассы, спорные поля, хитиновые наросты.
 */
public class BioPlanet{
    public static Planet virolux;

    public static void load(){
        //орбита 5 вокруг Sun (Serpulo=3, Erekir=4)
        virolux = new Planet("bio-virolix", Planets.sun, 1.2f, 5);
        //TODO свой BioGenerator (планета-организм: «мёртвая кора» только у точек высадки).
        //Временно берём генератор Serpulo, чтобы sectors-карта собиралась без своего контента.
        virolux.generator = Planets.serpulo.generator;
        virolux.meshLoader = Planets.serpulo.meshLoader; //временно: чужой меш до своих текстур

        virolux.hasAtmosphere = true;
        virolux.atmosphereColor = Color.valueOf("4f9e3a");
        virolux.atmosphereRadIn = 0.02f;
        virolux.atmosphereRadOut = 0.3f;
        virolux.iconColor = Color.valueOf("7ec850");
        virolux.visible = true;
        virolux.accessible = false; //открывается через TechTree позже
        virolux.startSector = 0;
        virolux.defaultCore = Blocks.coreShard;
        virolux.defaultEnv = Env.terrestrial | Env.spores | Env.groundOil;
        virolux.bloom = true;
        virolux.updateLighting = true;

        //запуск только с Serpulo (одна точка входа, как когда-то Erekir)
        virolux.launchCandidates.add(Planets.serpulo);
    }
}
