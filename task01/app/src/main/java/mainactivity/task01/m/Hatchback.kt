package mainactivity.task01.m

import myapplication.task01.Car

class Hatchback(
    brand: String,
    model: String,
    year: Int,
    driveType: String,
    val compactSize: Boolean
) : Car(brand, model, year, driveType)
