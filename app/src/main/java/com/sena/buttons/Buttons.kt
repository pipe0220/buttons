package com.sena.buttons

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Buttons(): AppCompatActivity(), View.OnClickListener {
    var containedButton1: Button? = null
    var containedButton: Button? = null
    var outlinedButtonWithIcon1: Button?= null
    var outlinedButtonWithIcon: Button?= null
    var textButton1: Button?= null
    var texButton: Button?= null
    var button1: Button? = null
    var button2: Button? = null
    var button3: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)

        containedButton1 = findViewById(R.id.containedButton1)
        containedButton = findViewById(R.id.containedButton)
        outlinedButtonWithIcon1 = findViewById(R.id.outlinedButtonWithIcon1)
        outlinedButtonWithIcon = findViewById(R.id.outlinedButtonWithIcon)
        textButton1 = findViewById(R.id.textButton1)
        texButton = findViewById(R.id.textButton)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)

        containedButton1?.setOnClickListener(this)
        containedButton?.setOnClickListener(this)
        outlinedButtonWithIcon1?.setOnClickListener(this)
        outlinedButtonWithIcon?.setOnClickListener(this)
        textButton1?.setOnClickListener(this)
        texButton?.setOnClickListener(this)
        button1?.setOnClickListener(this)
        button2?.setOnClickListener(this)
        button3?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.containedButton1-> {
                /*val intent = Intent(this,Buttons::class.java)*/
                Toast.makeText(applicationContext, "comtainedButton1", Toast.LENGTH_LONG).show()
            }
            R.id.containedButton->{
                //val intent=Intent(this,Buttons::class.java)
                Toast.makeText(applicationContext, "containedButton", Toast.LENGTH_LONG).show()
            }
            R.id.outlinedButtonWithIcon1->{
                //val intent=Intent(this,Buttons::class.java)
                Toast.makeText(applicationContext, "outlinedButtonWithIcon1", Toast.LENGTH_LONG).show()
            }
            R.id.outlinedButtonWithIcon->{
                //val intent=Intent(this,Buttons::class.java)
                Toast.makeText(applicationContext, "outlinedButtonWithIcon", Toast.LENGTH_LONG).show()
            }
            R.id.textButton1->{
               // val intent=Intent(this,Buttons::class.java)
                Toast.makeText(applicationContext, "textButton1", Toast.LENGTH_LONG).show()
            }
            R.id.textButton->{
                //val intent=Intent(this,Buttons::class.java)
                Toast.makeText(applicationContext, "textButton", Toast.LENGTH_LONG).show()
            }
            R.id.button1->{
                //val intent=Intent(this,Buttons::class.java)
                Toast.makeText(applicationContext, "button1", Toast.LENGTH_LONG).show()
            }
            R.id.button2->{
                //val intent=Intent(this,Buttons::class.java)
                Toast.makeText(applicationContext, "button2", Toast.LENGTH_LONG).show()
            }
            R.id.button3-> {
                //val intent = Intent(this, Buttons::class.java)
                Toast.makeText(applicationContext, "button3", Toast.LENGTH_LONG).show()
            }
    }   }
}


