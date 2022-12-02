package com.ginsway.spawn_eggs_recipes.mixin;

import com.ginsway.spawn_eggs_recipes.SpawnEggsRecipes;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class SpawnEggsRecipesMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		SpawnEggsRecipes.LOGGER.info("This line is printed by Spawn Eggs Recipes mixin!");
	}
}
