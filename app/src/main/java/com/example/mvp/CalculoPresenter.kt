package com.example.mvp

import android.view.View
import android.widget.TextView

class CalculoPresenter constructor(view: CalculoContract.View) : CalculoContract.Presenter,
    CalculoContract.Model.OnFinishedListener {
    val  model : CalculoContract.Model = CalculoModel()
    val view : CalculoContract.View = view






    override fun onSucessGetNumber(response: String) {
        view.mostrarResultado(response)
    }

    override fun onFailureGetNumber(e: String) {
        view.mostrarResultado(e)
    }

    override  fun numAlCuadrado(numero: String?){

        model.numAlCuadrado(numero?.toInt(),this)
    }




}