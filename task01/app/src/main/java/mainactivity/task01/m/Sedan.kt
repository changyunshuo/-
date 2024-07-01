package mainactivity.task01.m

import myapplication.task01.Car


class Sedan(
    brand: String,
    model: String,
    year: Int,
    driveType: String,
    val luxuryLevel: String
) : Car(brand, model, year, driveType)
