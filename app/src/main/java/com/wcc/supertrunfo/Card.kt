package com.wcc.supertrunfo

import com.wcc.supertrun.Driver

class Card(
    private val vehicle: Vehicle,
    private val driver: Driver
) {

    val maxVelocity: Int = setMaxVelocity()
    val accelerationTime: Int = setAccelerationTime()
    val passengers: Int  = setPassengers()
    val xp: Int = setXP()

    private fun setMaxVelocity(): Int {
       return when (vehicle.type) {
           "car" ->
                if (vehicle.style == "sedã") {
                    vehicle.maxAcceleration
                } else {
                    vehicle.maxAcceleration + 10
                }
           "motorcycle" -> vehicle.weight * vehicle.maxAcceleration
           "bike" -> vehicle.maxAcceleration * driver.boldness
           else -> 0
        }
    }

    private fun setAccelerationTime(): Int {
        return vehicle.accelerationTime * (1/driver.accelerationTime)
    }

    private fun setPassengers(): Int {
        return vehicle.passengers * driver.defensiveDriving
    }

    private fun setXP(): Int {
        return when (vehicle.type) {
            "car" -> driver.carXP
            "motorcycle" -> driver.motorcycleXP
            "bike" -> driver.bikeXP
            else -> 0
        }
    }
}