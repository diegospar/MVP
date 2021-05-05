package com.example.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), CalculoContract.View{

    lateinit var presenter: CalculoContract.Presenter
        lateinit var mensaje: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var boton = findViewById<Button>(R.id.button)
        var num= findViewById<EditText>(R.id.editTextNumber)
       mensaje= findViewById<TextView>(R.id.mensaje)

        boton.setOnClickListener {
        obtenerValor(num)
        }

    }

    override fun obtenerValor(num: EditText) {
        presenter.numAlCuadrado(num.text.toString())
    }

    override fun mostrarResultado(resultado : String) {

        mensaje.text = resultado
    }


}