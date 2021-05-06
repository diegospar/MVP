package com.example.mvp;

import android.widget.EditText
import android.widget.TextView

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