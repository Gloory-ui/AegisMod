package com.aegis.client;

import com.aegis.Aegis;
import com.aegis.item.Mk42ArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Mk42ArmorRenderer extends GeoArmorRenderer<Mk42ArmorItem> {
	public Mk42ArmorRenderer() {
		super(new DefaultedItemGeoModel<>(Identifier.of(Aegis.MOD_ID, "mk42")));
	}
}
