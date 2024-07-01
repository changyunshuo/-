package myapplication.task01

open class Car(
    val brand: String,
    val model: String,
    val year: Int,
    val driveType: String // Example field
) {
    fun printInfo() {
        println("Brand: $brand, Model: $model, Year: $year, Drive Type: $driveType")
    }
}
