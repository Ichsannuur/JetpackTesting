package com.example.myunittesting

class CuboidModel {
    private var width = .0
    private var height = .0
    private var length = .0

    fun getVolume(): Double {
        return width * height * length
    }

    fun surfaceArea(): Double {
        val widthLength = width * length
        val widthHeight = width * height
        val lengthHeight = length * height

        return 2 * (widthLength + widthHeight + lengthHeight)
    }

    fun circumference(): Double {
        return 4 * (width + length + height)
    }

    fun save(width: Double, length: Double, height: Double) {
        this.width = width
        this.length = length
        this.height = height
    }
}