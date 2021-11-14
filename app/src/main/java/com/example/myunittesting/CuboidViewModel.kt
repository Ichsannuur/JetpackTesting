package com.example.myunittesting

class CuboidViewModel(private val cuboidModel: CuboidModel) {
    fun getCircumference() = cuboidModel.circumference()
    fun getSurfaceArea() = cuboidModel.surfaceArea()
    fun getVolume() = cuboidModel.getVolume()

    fun save(width: Double, height: Double, length: Double) {
        cuboidModel.save(width, height, length)
    }
}