package com.sena.buttons

import android.app.Activity
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sena.buttons.databinding.ActivityButton1Binding

class Button1() : AppCompatActivity(), View.OnClickListener {
    //var btnGoToButtons: Button? = null

    private lateinit var binding: ActivityButton1Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_button1)

        btnGoToButtons = findViewById(R.id.btnGoToButtons)

        btnGoToButtons?.setOnClickListener(this)*/

        binding = ActivityButton1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoToButtons.setOnClickListener(this)



    }
    override fun onClick(v: View?) {
        when(v){
            binding.btnGoToButtons ->{
                val intent=Intent(this,Buttons::class.java)
                Toast.makeText(applicationContext, "Has ingresado a los Botones", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }

        }
    }


}

