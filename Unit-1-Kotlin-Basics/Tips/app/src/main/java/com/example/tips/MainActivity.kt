package com.example.tips

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tips.databinding.ActivityMainBinding
import java.text.NumberFormat
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener { calculateTip() }
    }

    private fun calculateTip() {
        val cost = binding.costOfService.text.toString().toDoubleOrNull()

        if (cost == null || cost == 0.0) {
            displayTip(0.0)
            return
        }

        val percentage = when(binding.tipOptions.checkedRadioButtonId) {
            R.id.service_amazing -> 0.20
            R.id.service_good -> 0.18
            else -> 0.15
        }

        var tip = percentage * cost

        if (binding.roundUpSwitch.isChecked) tip = ceil(tip)

        displayTip(tip)
    }

    private fun displayTip(tip: Double) {
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }
}