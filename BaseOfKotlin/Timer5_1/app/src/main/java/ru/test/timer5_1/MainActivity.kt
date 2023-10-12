package ru.test.timer5_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import ru.test.timer5_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var isRunning = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    fun startChronometer(view: View) {
        if (!isRunning) {
//            binding.chronometer.base = SystemClock.elapsedRealtime()
            binding.chronometer.base = SystemClock.elapsedRealtime()
            binding.chronometer.start()
            isRunning = true
        }
    }

    fun stopChronometer(view: View) {
        if (isRunning) {
            binding.chronometer.stop()
            isRunning = false
        }
    }

    fun resetChronometer(view: View) {
        binding.chronometer.base = SystemClock.elapsedRealtime()
        if (isRunning) {
            binding.chronometer.stop()
            isRunning = false
        }
    }
}