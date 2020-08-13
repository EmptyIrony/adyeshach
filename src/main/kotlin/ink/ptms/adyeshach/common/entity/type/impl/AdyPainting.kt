package ink.ptms.adyeshach.common.entity.type.impl

import ink.ptms.adyeshach.api.nms.NMS
import ink.ptms.adyeshach.common.bukkit.BukkitDirection
import ink.ptms.adyeshach.common.bukkit.BukkitPaintings
import ink.ptms.adyeshach.common.entity.EntityInstance
import ink.ptms.adyeshach.common.entity.element.EntityPosition
import ink.ptms.adyeshach.common.entity.type.EntityTypes
import io.izzel.taboolib.internal.gson.annotations.Expose
import org.bukkit.Location
import org.bukkit.entity.Player
import java.util.*

/**
 * @author sky
 * @date 2020/8/4 23:15
 */
class AdyPainting() : EntityInstance(EntityTypes.PAINTING) {

    @Expose
    private var direction: BukkitDirection = BukkitDirection.NORTH

    @Expose
    private var painting: BukkitPaintings = BukkitPaintings.KEBAB

    override fun spawn(location: Location) {
        super.spawn(location)
        NMS.INSTANCE.spawnEntityPainting(owner!!, index, UUID.randomUUID(), location, direction, painting)
    }

    fun setDirection(direction: BukkitDirection) {
        this.direction = direction
        respawn()
    }

    fun getDirection(): BukkitDirection {
        return direction
    }

    fun setPainting(painting: BukkitPaintings) {
        this.painting = painting
        respawn()
    }

    fun getPainting(): BukkitPaintings {
        return painting
    }
}