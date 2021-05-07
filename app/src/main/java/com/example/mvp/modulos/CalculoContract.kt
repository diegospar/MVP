package com.example.mvp.modulos;

import android.widget.EditText

public interface CalculoContract {

    interface Model{

        interface OnFinishedListener {
            fun onSucessGetNumber(response: String)
            fun onFailureGetNumber(e: String)
        }

        fun numAlCuadrado(num:Int?, onFinishedListener : OnFinishedListener)

    }

    interface Presenter{
        fun numAlCuadrado(numero: String?)

    }

    interface View{
        fun obtenerValor(num : EditText?)
        fun mostrarResultado( resultado : String)

    }


}