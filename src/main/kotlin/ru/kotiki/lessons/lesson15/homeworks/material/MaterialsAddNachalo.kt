package org.example.ru.kotiki.lessons.lesson15.homeworks.material

class MaterialsAddNachalo : Materials() {
    fun insert(item: String) {
        val existingMaterials = extractMaterials()
        addMaterial(item)
        existingMaterials.forEach {
            addMaterial(it)
        }
    }
}
