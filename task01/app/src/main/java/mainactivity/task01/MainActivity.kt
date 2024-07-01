package mainactivity.task01

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import mainactivity.task01.m.createRandomCar
import mainactivity.task01.m.race
import myapplication.task01.Car

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etCarCount = findViewById<EditText>(R.id.etCarCount)
        val btnStartRace = findViewById<Button>(R.id.btnStartRace)

        btnStartRace.setOnClickListener {
            val carCount = etCarCount.text.toString().toInt()
            val cars = mutableListOf<Car>()

            for (i in 0 until carCount) {
                cars.add(createRandomCar())
            }

            while (cars.size > 1) {
                val nextRoundCars = mutableListOf<Car>()
                val iterator = cars.iterator()
                while (iterator.hasNext()) {
                    val car1 = iterator.next()
                    if (iterator.hasNext()) {
                        val car2 = iterator.next()
                        nextRoundCars.add(race(car1, car2))
                    } else {
                        nextRoundCars.add(car1)
                    }
                }
                cars.clear()
                cars.addAll(nextRoundCars)
            }

            println("Winner: ${cars[0].brand}")
        }
    }
}
