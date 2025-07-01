package com.anki.enchants;

import com.anki.enchants.datagen.ModRegistryDataGenerator;
import com.anki.enchants.enchantment.ModEnchantments;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryBuilder;

public class AnkiEnchantsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModRegistryDataGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder){
		registryBuilder.addRegistry(RegistryKeys.ENCHANTMENT, ModEnchantments::bootstrap);
	}
}
