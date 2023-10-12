package ru.test.fistkotlin5_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.test.fistkotlin5_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSave.setOnClickListener {
            binding.textViewName.text = "Привет, ${binding.editTextName.text}!"
        }
    }
}