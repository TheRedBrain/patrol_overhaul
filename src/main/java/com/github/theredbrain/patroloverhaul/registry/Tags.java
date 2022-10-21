package com.github.theredbrain.patroloverhaul.registry;

import com.github.theredbrain.patroloverhaul.PatrolOverhaul;
import net.minecraft.entity.EntityType;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Tags {
    public static final TagKey<EntityType<?>> STARTS_PATROLS_WHEN_KILLED = TagKey.of(Registry.ENTITY_TYPE_KEY, new Identifier(PatrolOverhaul.MOD_ID, "starts_patrols_when_killed"));

}
