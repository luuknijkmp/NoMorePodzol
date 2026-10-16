package siskin.nomorepodzol;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.gamerules.GameRule;
import net.minecraft.world.level.gamerules.GameRuleCategory;

public final class NoMorePodzolGameRules {

    public static final GameRule<Boolean> DISABLE_SPRUCE_PODZOL =
            GameRuleBuilder.forBoolean(true)
                    .category(GameRuleCategory.MISC)
                    .buildAndRegister(
                            Identifier.fromNamespaceAndPath(
                                    "nomorepodzol",
                                    "disable_spruce_podzol"
                            )
                    );

    public static void initialize() {
        // Ensures this class is loaded during mod initialization.
    }

    private NoMorePodzolGameRules() {
    }
}