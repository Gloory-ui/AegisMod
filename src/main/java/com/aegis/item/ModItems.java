package com.aegis.item;

import com.aegis.Aegis;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public final class ModItems {
	public static final Item AEGIS_HELMET = register("aegis_helmet",
		new Mk42ArmorItem(AegisArmorMaterial.INSTANCE, ArmorItem.Type.HELMET,
			new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(AegisArmorMaterial.BASE_DURABILITY))));

	public static final Item AEGIS_CHESTPLATE = register("aegis_chestplate",
		new Mk42ArmorItem(AegisArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE,
			new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(AegisArmorMaterial.BASE_DURABILITY))));

	public static final Item AEGIS_LEGGINGS = register("aegis_leggings",
		new Mk42ArmorItem(AegisArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS,
			new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(AegisArmorMaterial.BASE_DURABILITY))));

	public static final Item AEGIS_BOOTS = register("aegis_boots",
		new Mk42ArmorItem(AegisArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS,
			new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(AegisArmorMaterial.BASE_DURABILITY))));

	public static final ItemGroup AEGIS_GROUP = Registry.register(
		Registries.ITEM_GROUP,
		Identifier.of(Aegis.MOD_ID, "aegis"),
		FabricItemGroup.builder()
			.icon(() -> new ItemStack(AEGIS_CHESTPLATE))
			.displayName(Text.translatable("itemgroup.aegis"))
			.entries((displayContext, entries) -> {
				entries.add(AEGIS_HELMET);
				entries.add(AEGIS_CHESTPLATE);
				entries.add(AEGIS_LEGGINGS);
				entries.add(AEGIS_BOOTS);
			})
			.build());

	private static Item register(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(Aegis.MOD_ID, name), item);
	}

	public static void initialize() {
		// Referencing this class triggers static registration of the items and the group.
	}

	private ModItems() {
	}
}
