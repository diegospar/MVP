package com.example.mvp.modulos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.mvp.R
import com.example.mvp.databinding.ActivityMainBinding
import com.example.mvp.extensiones.viewBinding

class MainActivity : AppCompatActivity(), CalculoContract.View {

    val presenter: CalculoContract.Presenter = CalculoPresenter(this)
    private val binding by viewBinding(ActivityMainBinding::inflate)
    var boton= binding.button
    var num= binding.editTextNumber
    var mensaje= binding.mensaje

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        /*
        var boton = findViewById<Button>(R.id.button)
        var num= findViewById<EditText>(R.id.editTextNumber)
        mensaje= findViewById<TextView>(R.id.mensaje)*/



        boton.setOnClickListener {
        obtenerValor(num)
        }

    }

    override fun obtenerValor(num: EditText?) {
        presenter.numAlCuadrado(num?.text.toString())
    }

    override fun mostrarResultado(resultado : String) {
         mensaje.text = resultado
    }


}