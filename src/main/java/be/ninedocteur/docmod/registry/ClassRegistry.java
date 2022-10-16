package be.ninedocteur.docmod.registry;

import be.ninedocteur.docmod.DocMod;
import be.ninedocteur.docmod.common.computer.Computer;
import be.ninedocteur.docmod.common.enchantement.DMEnchantements;
import be.ninedocteur.docmod.common.fluid.DMFluidTypes;
import be.ninedocteur.docmod.common.init.*;
import be.ninedocteur.docmod.common.recipe.DMRecipes;
import be.ninedocteur.docmod.common.world.biome.DMBiomes;
import be.ninedocteur.docmod.common.sound.DMSound;
import be.ninedocteur.docmod.client.containers.DMContainers;
import be.ninedocteur.docmod.common.entity.DMEntityType;
import be.ninedocteur.docmod.common.world.dimension.DMDimension;
import be.ninedocteur.docmod.common.world.features.DMConfiguredFeature;
import be.ninedocteur.docmod.common.world.features.DMPlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;

public class ClassRegistry {

    public static void registerClass(IEventBus eventBus){
        DocMod.LOGGER.info("Init DocMod Blocks...");
        DMBlocks.register(eventBus);
        //DocMod.LOGGER.info("Init DocMod Structures...");
       // DMStructures.STRUCTURE_FEATURES.register(eventBus);
        DocMod.LOGGER.info("Init DocMod Items...");
        DMItems.register(eventBus);
        DocMod.LOGGER.info("Init DocMod Tile Entities...");
        DMTileEntity.register(eventBus);
        DocMod.LOGGER.info("Init DocMod Entity Types...");
        DMEntityType.register(eventBus);
        DocMod.LOGGER.info("Init DocMod Containers...");
        DMContainers.CONTAINERS.register(eventBus);
        DocMod.LOGGER.info("Init DocMod Biomes...");
        DMBiomes.registerBiomes(eventBus);
        DocMod.LOGGER.info("Init DocMod Sounds...");
        DMSound.registerSounds();
        DocMod.LOGGER.info("Init DocMod Gen...");
        DMConfiguredFeature.register(eventBus);
        DMPlacedFeature.register(eventBus);
        DocMod.LOGGER.info("Init DocMod Particles...");
        DMParticles.register(eventBus);
        DocMod.LOGGER.info("Init DocMod Enchantements...");
        DMEnchantements.register(eventBus);
        DocMod.LOGGER.info("Init DocMod Dimensions...");
        DMDimension.register();
        DocMod.LOGGER.info("Init DocMod Menus...");
        DMMenu.register(eventBus);
        DocMod.LOGGER.info("Init DocMod Computer System...");
        Computer.registerCommand();
        DocMod.LOGGER.info("Init DocMod Recipes...");
        DMRecipes.SERIALIZERS.register(eventBus);
        //DocMod.LOGGER.info("Init DocMod Fluids...");
        //DMFluids.register(eventBus);
        //DMFluidTypes.register(eventBus);
    }
}