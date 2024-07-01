package mainactivity.task01.m

import myapplication.task01.Car


class AutoBuilder(
    private var brand: String,
    private var model: String
) {
    private var year: Int = 0
    private var driveType: String = "Unknown"

    fun setYear(year: Int): AutoBuilder {
        this.year = year
        return this
    }

    fun setDriveType(driveType: String): AutoBuilder {
        this.driveType = driveType
        return this
    }

    fun build(): Car {
        return Car(brand, model, year, driveType)
    }
}
fun createRandomCar(): Car {
    val brands = listOf("Toyota", "Honda", "Ford", "Chevrolet")
    val models = listOf("Model X", "Model Y", "Model Z")
    val years = (2000..2022).toList()
    val driveTypes = listOf("Front", "Rear", "All-wheel")

    return Car(
        brand = brands.random(),
        model = models.random(),
        year = years.random(),
        driveType = driveTypes.random()
    )
}
fun race(car1: Car, car2: Car): Car {
    val winner = if (car1.year > car2.year) car1 else car2
    println("Race between ${car1.brand} and ${car2.brand}, Winner: ${winner.brand}")
    return winner
}
