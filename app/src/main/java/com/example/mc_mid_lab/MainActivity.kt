package com.example.mc_mid_lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Counter for Tracking no.of coffees
    var count:Int = 0
    //Static price for one coffee
    val price:Int = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Objects of spinner and TextViews
        val categorySpinner:Spinner=findViewById(R.id.categoryspinner)
        val coffeeCountText:TextView=findViewById(R.id.coffeeCountText)
        val totalPriceText:TextView=findViewById(R.id.totalPriceText)

        // Objects of Buttons
        val additionbtn:ImageButton=findViewById(R.id.additionimageButton)
        val subtraction:ImageButton=findViewById(R.id.subtractionimageButton)
        val orderbtm:Button=findViewById(R.id.orderbutton)

        additionbtn.setOnClickListener {
            count++
            coffeeCountText.text = count.toString()
            calculateDisplayPrice(categorySpinner, totalPriceText)
        }
        subtraction.setOnClickListener {
            count--
            coffeeCountText.text = count.toString()
            calculateDisplayPrice(categorySpinner, totalPriceText)
        }

        orderbtm.setOnClickListener {
            val intent=Intent(this,OrderActivity::class.java)
            intent.putExtra("category","${categorySpinner.selectedItem.toString()}")
            intent.putExtra("coffeeCount","${coffeeCountText.toString()}")
            intent.putExtra("totalPrice","${totalPriceText.toString()}")
            startActivity(intent)
            //calculateDisplayPrice(categorySpinner, totalPriceText)
        }
    }

    private fun calculateDisplayPrice(categorySpinner:Spinner, totalPriceText:TextView){
        var coffeeType:String = categorySpinner.selectedItem.toString()
        var totalPrice:Int = price*count
        totalPriceText.text = totalPrice.toString()
    }
}


