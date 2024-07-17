package name.modid;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuckPotion implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("luck-potions");

	@Override
	public void onInitialize() {
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(
					// Input potion.
					Potions.AWKWARD,
					// Ingredient
					Items.LILY_PAD,
					// Output potion.
					Potions.LUCK
			);
		});
	}
}