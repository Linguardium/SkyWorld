package paulevs.skyworld;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.util.Identifier;
import paulevs.skyworld.generator.SkyChunkGenerator;
import paulevs.skyworld.structures.StructureTypes;
import paulevs.skyworld.structures.features.StructureFeatures;

public class SkyWorld implements ModInitializer
{
	public static final String MOD_ID = "skyworld";
	public static final ButtonWidget[] BUTTON = new ButtonWidget[1];
	
	@Override
	public void onInitialize()
	{
		StructureTypes.register();
		SkyChunkGenerator.register();
		SkyWorldType.register();
		StructureFeatures.register();
	}
	
	public static Identifier getID(String id)
	{
		return new Identifier(MOD_ID, id);
	}
}
