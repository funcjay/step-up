package sh.hl2.stepup;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.Minecraft;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class StepUp implements ModInitializer {
    public static final String MOD_ID = "stepup";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Minecraft MINECRAFT = Minecraft.getMinecraft();

    @Override
    public void onInitialize() {
        LOGGER.info("Your legs magically grew longer!");
    }
}
