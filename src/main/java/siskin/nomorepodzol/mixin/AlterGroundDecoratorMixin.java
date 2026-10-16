package siskin.nomorepodzol.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import siskin.nomorepodzol.NoMorePodzolGameRules;

@Mixin(AlterGroundDecorator.class)
public class AlterGroundDecoratorMixin {

    @WrapOperation(
            method = "placeBlockAt",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context;setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V"
            )
    )
    private void noMorePodzol(
            TreeDecorator.Context context,
            BlockPos pos,
            BlockState state,
            Operation<Void> original
    ) {
        boolean disabled = context.level()
                .getLevel()
                .getGameRules()
                .get(NoMorePodzolGameRules.DISABLE_SPRUCE_PODZOL);

        if (!disabled || !state.is(Blocks.PODZOL)) {
            original.call(context, pos, state);
        }
    }
}