package mainactivity.task01.m

import myapplication.task01.Car


class SUV(
    brand: String,
    model: String,
    year: Int,
    driveType: String,
    val enginePower: Int
) : Car(brand, model, year, driveType)
