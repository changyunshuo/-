package mainactivity.task01.m

import myapplication.task01.Car

class Truck(
    brand: String,
    model: String,
    year: Int,
    driveType: String,
    val payloadCapacity: Int
) : Car(brand, model, year, driveType)
