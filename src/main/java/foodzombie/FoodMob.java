package foodzombie;

import foodzombie.mobs.FoodZombie;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.*;
import necesse.engine.sound.gameSound.GameSound;
import necesse.gfx.gameTexture.GameTexture;
import necesse.level.maps.biomes.Biome;

@ModEntry
public class FoodMob {

    public static GameSound killingfoodzombie;

    public void init() {
        System.out.println("Food Zombie Activated!");

        MobRegistry.registerMob("foodzombie", FoodZombie.class, true);
    }

    public void initResources() {
        // Sometimes your textures will have a black or other outline unintended under rotation or scaling
        // This is caused by alpha blending between transparent pixels and the edge
        // To fix this, run the preAntialiasTextures gradle task
        // It will process your textures and save them again with a fixed alpha edge color
        killingfoodzombie = GameSound.fromFile("killingfoodzombie");

        FoodZombie.texture = GameTexture.fromFile("mobs/foodzombie");
    }

    public void postInit() {
        // Add out example mob to default cave mobs.
        // Spawn tables use a ticket/weight system. In general, common mobs have about 100 tickets.
        Biome.defaultSurfaceMobs.add(100, "foodzombie");
        Biome.defaultCaveMobs.addLimited(25, "foodzombie", 1, 512);
    }

}
