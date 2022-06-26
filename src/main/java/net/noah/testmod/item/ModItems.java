package net.noah.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.noah.testmod.TestMod;


public class ModItems {
	public static final Item MYTHRIL_INGOT = registerItem(
			"mythril_ingot",
			new Item(new FabricItemSettings().group(ItemGroup.MISC))
	);
	
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
	}
	
	public static void registerModitems() {
		TestMod.LOGGER.info("Registering Mod Items for " + TestMod.MOD_ID);
	}
}
