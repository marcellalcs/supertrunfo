package com.wcc.supertrunfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CardsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards)

        val playerOneName = intent.getStringArrayExtra("player_one") ?: "Player One"
        val playerTwoName = intent.getStringArrayExtra("player_two") ?: "Player Two"

        val vehiculeOne = mapOf(
            "maxAcceleration" to "100km",
            "acceleration0T010" to "120sec",
            "passengers" to "5",
            "doors" to "2",
            "style" to "sedã",
            "type" to "car"
        )

        val vehiculeTwo = mapOf(
            "maxAcceleration" to "50km",
            "acceleration0T010" to "60sec",
            "passengers" to "2",
            "gears" to "7",
            "type" to "bicke"
        )

        val vehiculeThree = mapOf(
            "maxAcceleration" to "170km",
            "acceleration0T010" to "40sec",
            "passengers" to "2",
            "weight" to "70kg",
            "type" to "motorcycle"
        )

        val vehiculeFour = mapOf(
            "maxAcceleration" to "130km",
            "acceleration0T010" to "170sec",
            "passengers" to "4",
            "doors" to "2",
            "style" to "hatch",
            "type" to "car"
        )


        val vehiculeFive = mapOf(
            "maxAcceleration" to "30km",
            "acceleration0T010" to "240sec",
            "passengers" to "1",
            "gears" to "4",
            "type" to "bike"
        )

        val driverOne = mapOf(
            "carXP" to "40",
            "bikeXP" to "60",
            "motorcycleXP" to "10",
            "carChampionships" to "2",
            "bikeChampionships" to "10",
            "motorcycleChampionships" to "0",
            "boldness" to "3",
            "defensiveDriving" to "0.4",
        )

        val driverTwo = mapOf(
            "carXP" to "90",
            "bikeXP" to "10",
            "motorcycleXP" to "30",
            "carChampionships" to "30",
            "bikeChampionships" to "0",
            "motorcycleChampionships" to "0",
            "boldness" to "2",
            "defensiveDriving" to "0.7",
        )

        val driverThree = mapOf(
            "carXP" to "50",
            "bikeXP" to "30",
            "motorcycleXP" to "80",
            "carChampionships" to "3",
            "bikeChampionships" to "7",
            "motorcycleChampionships" to "15",
            "boldness" to "6",
            "defensiveDriving" to "0.2",
        )

        val vehicles = listOf(vehiculeOne, vehiculeTwo, vehiculeThree, vehiculeFour, vehiculeFive)
        val drivers = listOf(driverOne, driverTwo, driverThree)

        val currentVehiclePlayerOne = vehicles.random()
        val currentVehiclePlayerTwo = vehicles.random()

        val currentDriverPlayerOne = drivers.random()
        val currentDriverPlayerTwo = drivers.random()

        val cardOneMaxVelocity =
            when (currentVehiclePlayerOne["type"]) {
                "car" ->
                    if (currentVehiclePlayerOne["style"] == "sedã") {
                        currentVehiclePlayerOne["maxAcceleration"]?.toInt() ?: 0
                    } else {
                        currentVehiclePlayerOne["maxAcceleration"]?.toInt() ?: 0 + 10
                    }

                "motorcycle" -> (1 / (currentVehiclePlayerOne["weight"]?.toInt()
                    ?: 1)) * (currentVehiclePlayerOne["maxAcceleration"]?.toInt() ?: 0)

                else -> (currentVehiclePlayerOne["maxAcceleration"]?.toInt()
                    ?: 1 * (currentDriverPlayerOne["boldness"]?.toInt() ?: 1))
            }

        val accelerationTimePlayerOne = (currentVehiclePlayerOne["accelerationTime"]?.toInt()
            ?: 1) * (1 / (currentDriverPlayerOne["accelerationTime"]?.toInt() ?: 1))

        val passengersPlayerOne = (currentVehiclePlayerOne["passengers"]?.toInt()
            ?: 0) * (1 + (currentDriverPlayerOne["defensiveDriving"]?.toInt() ?: 0))

        val xPPlayerOne = when (currentVehiclePlayerOne["type"]) {
            "car" -> currentDriverPlayerOne["carXP"]?.toInt() ?: 0
            "motorcycle" -> currentDriverPlayerOne["motorcycleXP"]?.toInt() ?: 0
            else -> currentDriverPlayerOne["bikeXP"]?.toInt() ?: 0
        }

        val cardTwoMaxVelocity =
            when (currentVehiclePlayerTwo["type"]) {
                "car" ->
                    if (currentVehiclePlayerTwo["style"] == "sedã") {
                        currentVehiclePlayerTwo["maxAcceleration"]?.toInt() ?: 0
                    } else {
                        currentVehiclePlayerTwo["maxAcceleration"]?.toInt() ?: 0 + 10
                    }

                "motorcycle" -> (1 / (currentVehiclePlayerTwo["weight"]?.toInt()
                    ?: 1)) * (currentVehiclePlayerTwo["maxAcceleration"]?.toInt() ?: 0)

                else -> (currentVehiclePlayerTwo["maxAcceleration"]?.toInt()
                    ?: 1 * (currentDriverPlayerTwo["boldness"]?.toInt() ?: 1))
            }

        val accelerationTimePlayerTwo = (currentVehiclePlayerOne["accelerationTime"]?.toInt()
            ?: 1) * (1 / (currentDriverPlayerOne["accelerationTime"]?.toInt() ?: 1))

        val passengersPlayerTwo = (currentVehiclePlayerOne["passengers"]?.toInt()
            ?: 0) * (1 + (currentDriverPlayerOne["defensiveDriving"]?.toInt() ?: 0))

        val xPPlayerTwo = when (currentVehiclePlayerOne["type"]) {
            "car" -> currentDriverPlayerOne["carXP"]?.toInt() ?: 0
            "motorcycle" -> currentDriverPlayerOne["motorcycleXP"]?.toInt() ?: 0
            else -> currentDriverPlayerOne["bikeXP"]?.toInt() ?: 0
        }


    }
}