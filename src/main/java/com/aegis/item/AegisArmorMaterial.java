package com.aegis.item;

import com.aegis.Aegis;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public final class AegisArmorMaterial {
	// Per-piece durability is BASE_DURABILITY * type factor (netherite uses 37).
	public static final int BASE_DURABILITY = 40;

	public static final RegistryEntry<ArmorMaterial> INSTANCE = Registry.registerReference(
		Registries.ARMOR_MATERIAL,
		Identifier.of(Aegis.MOD_ID, "aegis"),
		new ArmorMaterial(
			createDefenseMap(),
			15,
			SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
			() -> Ingredient.ofItems(Items.NETHERITE_INGOT),
			List.of(new ArmorMaterial.Layer(Identifier.of(Aegis.MOD_ID, "aegis"))),
			3.0F,
			0.1F
		)
	);

	private static Map<ArmorItem.Type, Integer> createDefenseMap() {
		Map<ArmorItem.Type, Integer> map = new EnumMap<>(ArmorItem.Type.class);
		map.put(ArmorItem.Type.HELMET, 3);
		map.put(ArmorItem.Type.CHESTPLATE, 8);
		map.put(ArmorItem.Type.LEGGINGS, 6);
		map.put(ArmorItem.Type.BOOTS, 3);
		map.put(ArmorItem.Type.BODY, 11);
		return map;
	}

	private AegisArmorMaterial() {
	}
}
