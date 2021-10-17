package com.example.alertdialog

import android.app.ProgressDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    private lateinit var btnAlret: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAlret = findViewById(R.id.btnAlret)
        btnAlret.setOnClickListener {
            showAlert("")
        }

    }

    private fun showAlert(title: String) {

        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setMessage(title)
        val ed = EditText(this)
        dialogBuilder.setView(ed)

        dialogBuilder.setPositiveButton("TV", DialogInterface.OnClickListener { dialog, id ->
            //findViewById<TextView>(R.id.tv).text = ed.text
            var str = ed.text.toString()
            showAlert(str)
        })
        dialogBuilder.setNegativeButton("GO", DialogInterface.OnClickListener { dialog, id ->
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(AlarmClock.EXTRA_MESSAGE, "${ed.text}")
            startActivity(intent)
        })
        val alert = dialogBuilder.create()
        alert.setTitle("Enter Something")
        alert.show()
    }

}