package com.wcc.supertrunfo.data

import com.wcc.supertrunfo.entities.Driver
import com.wcc.supertrunfo.entities.Vehicle

object SuperTrunfoData {
    fun getVehicles(): List<Vehicle> {
        val vehicleOne = Vehicle(
            100,
            120,
            5,
            120,
            2,
            "sedã",
            5,
            "car")

        val vehicleTwo = Vehicle(
            50,
            60,
            2,
            10,
            0,
            "regular",
            7,
            "bike"
        )

        val vehicleThree = Vehicle(
            170,
            40,
            2,
            70,
            0,
            "adventure",
            6,
            "motorcycle"
        )

        val vehicleFour = Vehicle(
            130,
            170,
            4,
            110,
            2,
            "hatch",
            5,
            "car"
        )

        val vehicleFive = Vehicle(
            30,
            240,
            1,
            13,
            0,
            "regular",
            4,
            "bike"
        )

        return listOf(vehicleOne, vehicleTwo, vehicleThree, vehicleFour, vehicleFive)
    }

    fun getDrivers(): List<Driver> {
        val driverOne = Driver(
            60,
            10,
            40,
            2,
            10,
            0,
            4,
            3
        )

        val driverTwo = Driver(
            10,
            30,
            90,
            30,
            0,
            0,
            7,
            2
        )

        val driverThree = Driver(
            30,
            80,
            50,
            3,
            7,
            15,
            2,
            5
        )

        return listOf(driverOne, driverTwo, driverThree)
    }
}