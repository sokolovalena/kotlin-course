package org.example.ru.kotiki.lessons.lesson15.homeworks.material

import kotlin.math.max

class MaterialPoocheredno: Materials()  {
    fun insert(items: List<String>) {
        val materials = extractMaterials()
        val maxIndex = max(items.lastIndex, materials.lastIndex)
        for (i in 0..maxIndex) {
            if (i < items.size) {
                addMaterial(items[i])
            }
            if (i < materials.size) {
                addMaterial(materials[i])
            }
        }
    }
}