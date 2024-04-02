package com.sena.buttons

import android.content.Context
import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sena.buttons.databinding.ActivityButtonsBinding


class Buttons(): AppCompatActivity(), View.OnClickListener {

    val TAG = "activity_buttons"

    /*var containedButton1: Button? = null
    var containedButton: Button? = null
    var outlinedButtonWithIcon1: Button?= null
    var outlinedButtonWithIcon: Button?= null
    var textButton1: Button?= null
    var texButton: Button?= null
    var button1: Button? = null
    var button2: Button? = null
    var button3: Button? = null*/

    //declaro variable binding

    private lateinit var binding: ActivityButtonsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Enlasar pantalla

        binding = ActivityButtonsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setContentView(R.layout.activity_buttons)

        /*containedButton1 = findViewById(R.id.containedButton1)
        containedButton = findViewById(R.id.containedButton)
        outlinedButtonWithIcon1 = findViewById(R.id.outlinedButtonWithIcon1)
        outlinedButtonWithIcon = findViewById(R.id.outlinedButtonWithIcon)
        textButton1 = findViewById(R.id.textButton1)
        texButton = findViewById(R.id.textButton)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)*/

        /*containedButton1?.setOnClickListener(this)
        containedButton?.setOnClickListener(this)
        outlinedButtonWithIcon1?.setOnClickListener(this)
        outlinedButtonWithIcon?.setOnClickListener(this)
        textButton1?.setOnClickListener(this)
        texButton?.setOnClickListener(this)
        button1?.setOnClickListener(this)
        button2?.setOnClickListener(this)
        button3?.setOnClickListener(this)*/

        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.containedButton1.setOnClickListener(this)
        binding.containedButton.setOnClickListener(this)
        binding.outlinedButtonWithIcon1.setOnClickListener(this)
        binding.outlinedButtonWithIcon.setOnClickListener(this)
        binding.textButton1.setOnClickListener(this)
        binding.textButton.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v){
            binding.containedButton1-> {
                /*val intent = Intent(this,Buttons::class.java)*/
                Toast.makeText(applicationContext, "comtainedButton1", Toast.LENGTH_SHORT).show()
            }
            binding.containedButton->{
                //val intent=Intent(this,Buttons::class.java)
                Toast.makeText(applicationContext, "containedButton", Toast.LENGTH_SHORT).show()
            }
            binding.outlinedButtonWithIcon1->{
                //val intent=Intent(this,Buttons::class.java)
                Toast.makeText(applicationContext, "outlinedButtonWithIcon1", Toast.LENGTH_SHORT).show()
            }
            binding.outlinedButtonWithIcon->{
                //val intent=Intent(this,Buttons::class.java)
                Toast.makeText(applicationContext, "outlinedButtonWithIcon", Toast.LENGTH_SHORT).show()
            }
            binding.textButton1->{
               // val intent=Intent(this,Buttons::class.java)
                Toast.makeText(applicationContext, "textButton1", Toast.LENGTH_SHORT).show()
            }
            binding.textButton->{
                //val intent=Intent(this,Buttons::class.java)
                Toast.makeText(applicationContext, "textButton", Toast.LENGTH_SHORT).show()
            }
            binding.button1->{
                //val intent=Intent(this,Buttons::class.java)
                Toast.makeText(applicationContext, "button1", Toast.LENGTH_SHORT).show()
            }
            binding.button2->{
                //val intent=Intent(this,Buttons::class.java)
                Toast.makeText(applicationContext, "button2", Toast.LENGTH_SHORT).show()
            }
            binding.button3-> {
                //val intent = Intent(this, Buttons::class.java)
                Toast.makeText(applicationContext, "button3", Toast.LENGTH_SHORT).show()
            }

    } }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart Called")
    }
}



