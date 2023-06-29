package sh.hl2.stepup.mixin;

import net.minecraft.src.EntityPlayerSP;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sh.hl2.stepup.StepUp;

@Mixin(value = EntityPlayerSP.class, remap = false)
public class EntityPlayerSPMixin {
    @Inject(method = "onLivingUpdate", at = @At("TAIL"))
    private void onLivingUpdate(CallbackInfo ci) {
        EntityPlayerSP plr = StepUp.MINECRAFT.thePlayer;

        plr.stepHeight = 1.0f;
    }
}
