package org.example.ru.kotiki.lessons.lesson15.homeworks.material

class MaterialSort : Materials() {
    fun insert(item: String) {
        val materials = (extractMaterials() + item).sorted()
        materials.forEach {
            addMaterial(it)
        }
    }
}