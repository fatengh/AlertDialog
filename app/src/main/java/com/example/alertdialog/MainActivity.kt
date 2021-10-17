package com.example.alertdialog

<<<<<<< HEAD
import android.app.ProgressDialog
import android.content.DialogInterface
=======
>>>>>>> a8f43b2 (Initial commit)
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
<<<<<<< HEAD
import android.text.InputType
=======
>>>>>>> a8f43b2 (Initial commit)
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    private lateinit var btnAlret: Button
<<<<<<< HEAD
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
=======
    private lateinit var tvBtn:Button
    private lateinit var goBtn:Button

    private lateinit var edText:EditText
    private lateinit var tvText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnAlret = findViewById(R.id.btnAlret)
        btnAlret.setOnClickListener {

            showAlert()
        }
    }




    private fun showAlert() {
        val dialogView = layoutInflater.inflate(R.layout.dailog, null)
        val dialog = AlertDialog.Builder(this)
        dialog.setView(dialogView)



        edText = dialogView.findViewById(R.id.edInput)
        tvText = dialogView.findViewById(R.id.tv2)
        tvBtn = dialogView.findViewById(R.id.btnTv)
        goBtn = dialogView.findViewById(R.id.btnGo)
        tvBtn.setOnClickListener {
            tvText.text = edText.text.toString()
        }

        goBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(AlarmClock.EXTRA_MESSAGE,"${edText.text}" )
            startActivity(intent)
        }

        dialog.show()
    }
    }




>>>>>>> a8f43b2 (Initial commit)
