package ru.n08i40k.hexecuteif.casting.patterns.spells

import at.petrak.hexcasting.api.spell.*
import at.petrak.hexcasting.api.spell.casting.CastingContext
import at.petrak.hexcasting.api.spell.iota.Iota

object OpCanBreakBlock : ConstMediaAction {
    override val argc: Int
        get() = 1

    override fun execute(args: List<Iota>, ctx: CastingContext): Triple<RenderedSpell, Int, List<ParticleSpray>>? {
        val pos = args.getBlockPos(0, argc)
        ctx.assertVecInRange(pos)

    }
}