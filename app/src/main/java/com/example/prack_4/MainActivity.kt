package com.example.prack_4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var  textView:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        var imageButton : ImageButton = findViewById(R.id.imageButton3)
        var editText : EditText = findViewById(R.id.editTextText)
        var editText1 : EditText = findViewById(R.id.editTextText2)
        var buttonchik : Button = findViewById(R.id.button2)
        imageButton.setOnClickListener {
            if (editText.text.isEmpty()) {
                textView.text = "Ayo Gojo"
            } else {
                textView.text = "Ayo" + " " + editText.text
            }

            }
        buttonchik.setOnClickListener {
            if (editText1.text.toString() =="Хорошо") {
                textView.text = "Ну тогда ты карсава"


            }

            if(editText1.text.toString() == "Плохо"){
                textView.text = "Блин ну иди выключи компьютер я хз, иди отсюда"
            }

            if(editText1.text.toString() == "Нормально") {
             textView.text = "Ну если норм то норм"

            }

            if(editText1.text.toString() == "")
            {
                textView.text = "Ну ты вообще дубень"
            }




        }
    }
}