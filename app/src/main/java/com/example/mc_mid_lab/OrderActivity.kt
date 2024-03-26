package com.example.mc_mid_lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order_activity)
        val orderBtn: Button = findViewById(R.id.orderBtn)
        val categoryType = intent.getStringExtra("category")
        val coffeeCount = intent.getStringExtra("coffeeCount")
        val totalPrice = intent.getStringExtra("totalPrice")

        val categoryTxt: TextInputEditText = findViewById(R.id.coffeetypetextInput)
        val coffeeCountTxt: TextInputEditText = findViewById(R.id.coffeecounttextInput)
        val totalPriceTxt: TextInputEditText = findViewById(R.id.totalPricetextInput)


        categoryTxt.setText(categoryType)
        coffeeCountTxt.setText(coffeeCount)
        totalPriceTxt.setText(totalPrice)

        orderBtn.setOnClickListener {
            Toast.makeText(this, "Order Placed Successfully", Toast.LENGTH_LONG).show()
        }
    }
}
