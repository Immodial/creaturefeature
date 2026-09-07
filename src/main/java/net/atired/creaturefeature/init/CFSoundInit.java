package net.atired.creaturefeature.init;

import net.atired.creaturefeature.CreatureFeature;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CFSoundInit {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, CreatureFeature.MODID);
    public static final Holder<SoundEvent> NOTHING = SOUND_EVENTS.register(
            "music_disc.nothing",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
    public static final Holder<SoundEvent> NEW_AGE_NEVERMORE = SOUND_EVENTS.register(
            "music_disc.newagenevermore",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
    public static final Holder<SoundEvent> SINISTER_HURT = SOUND_EVENTS.register(
            "entity.sinister.hurt",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
    public static final Holder<SoundEvent> SINISTER_DIE = SOUND_EVENTS.register(
            "entity.sinister.death",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
    //SOURCED FROM FIEND FOLIO REHEATED!!! PLAY IT IT'S FUCKING AWESOME
    public static final Holder<SoundEvent> FIEND_HURT = SOUND_EVENTS.register(
            "entity.fiend.hurt",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
    public static final Holder<SoundEvent> FIEND_DIE = SOUND_EVENTS.register(
            "entity.fiend.death",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
    public static final Holder<SoundEvent> SHOT = SOUND_EVENTS.register(
            "entity.shot.fired",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
    public static final Holder<SoundEvent> MACH_AMBIENT = SOUND_EVENTS.register(
            "entity.machination.ambient",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
    public static final Holder<SoundEvent> MACH_KICK = SOUND_EVENTS.register(
            "entity.machination.kick",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
    public static final Holder<SoundEvent> MACH_HURT = SOUND_EVENTS.register(
            "entity.machination.hurt",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
    public static final Holder<SoundEvent> MACH_DIE = SOUND_EVENTS.register(
            "entity.machination.die",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
    public static final Holder<SoundEvent> SG_RETREAT = SOUND_EVENTS.register(
            "entity.stained_glass.retreat",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
    public static final Holder<SoundEvent> SG_DIE = SOUND_EVENTS.register(
            "entity.stained_glass.hurt",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
    public static final Holder<SoundEvent> COA_HURT = SOUND_EVENTS.register(
            "entity.coat_of_arms.hurt",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
    public static final Holder<SoundEvent> FRIEND = SOUND_EVENTS.register(
            "entity.friend.ambient",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
    public static final Holder<SoundEvent> FRIEND_HURT = SOUND_EVENTS.register(
            "entity.friend.hurt",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );
}
