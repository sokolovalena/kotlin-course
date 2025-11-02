package org.example.ru.kotiki.lessons.lesson15.homeworks.material

class MaterialSlovar : Materials() {
    fun insert(items: Map<String, String>) {
        val materials = items.keys.reversed() + extractMaterials() + items.values
        materials.forEach {
            addMaterial(it)
        }
    }
}